package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver
{
    public static WebDriver driver;
/*
    public static void driverBaslat()       // NORMAL KULLANIMI BU ŞEKİLDE
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();       // web sayfasının kontrol eden görevli.
    }
*/
    // Eğer java'da açılışta, yani ilk başta çalışacak bir metodu sadece static olarak tanımlayabiliriz,
    // ve metodu çağırmamıza gerek kalmadan, program başlangıcında otomatik olarak çalışır.bu sadece ilk çalışacak kod için geçerlididr.

    static  // açışılta çalışan kod kısmı.
    {
        KalanOncekileriKapat();

        Logger logger = Logger.getLogger("");       // "" işareti ile sisteme ait tüm log'lara ulaştım.
        logger.setLevel(Level.SEVERE);      // sadece error'ları göster.

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");        // sessiz çalış, bana info verme.

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

     // driver.manage().window().maximize();    // tam ekran.
        driver.manage().deleteAllCookies();     // site bizi robot olarak fişleyebileceği için sitenin senin bilgisayarında yaptığı ayarlar siliniyor.
        // Sayfayı başlangıç ayarlarına döndürür, sayfaya ilk kez giriyormuş gibi oluruz.


        // sayfa yüklenirken butonlar ve elemanların tıklanabilir hale gelmesi için belli bir süre gerekir,
        // biz test yaparken javanın bu süre kadar beklemesi gerekir.

        // sayfanın yüklenmesi ve elemanların yüklenmesi farklı şeylerdir.

        // bunun sebebi: java hızlı çalışıyor ama web sayfası o kadar hızlı çalışamaıyor, bizim bunu eşitlememiz gerek.

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // bu eklenmezse selenium sayfa yüklenene (sonsuza) kadar bekler. : 30 sn sayfanın yüklenmesini bekle,yüklenemezse hata ver.
        // eğer 2 sn'de yüklerse 30 sn beklemez.

        driver.manage().timeouts().implicitlyWait(dr);  // tüm WebElementlerin element bazında, elemente özel işlem yapılmadan önce,
        // hazır hale gelmesi için verilen mühlet yani süre.
    }

    public static void KalanOncekileriKapat() {     // test yaparken webdriver'ın açtığı, açık kalmış chrome sekmelerini kapatır, performans booster.

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        }
        catch (Exception ignored)
        {

        }
    }

    public static void driverBekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();             // açılmış olan tüm tarayıcıları kapatır.
    }

}
