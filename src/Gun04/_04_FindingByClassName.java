package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();                                  // web sayfasının kontrol eden görevli.
        driver.get("https://form.jotform.com/221934510376353");                 // web sayfasını aç.

        WebElement submitButton= driver.findElement(By.className("form-submit-button"));        // class name boşluklarla ayrılan parçalardan oluşur.bu parçalardan birini ararız.
        System.out.println("submitButton.getText() = " + submitButton.getText());
        submitButton.click();       // butona tıkla.

        // birden fazla aynı locator' a sahip eleman bulurssa findElement ne yapıyor ??
        // Cevap: ilk elementi bulur !!!
        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        // bu locator a ait elemanların hepsini nasıl alırım
        List<WebElement> labellar = driver.findElements(By.className("form-sub-label"));
        System.out.println("labellar.size() = " + labellar.size());
        for (WebElement e : labellar)
            System.out.println("e.getText() = " + e.getText());

        // findElement ile findElements arasındaki en önemli fark findElements locator'da bir eleman bulamadığı zaman hata vermez,0 elementli bir liste gönderir
        // aranılan eleman bulunamazsa: findElements NoSuchElement hatası verir.

        MyFunc.Bekle(10);
        driver.quit();                                              // açılmış olan tüm tarayıcıları kapatır.
    }
}
