package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebsite {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();      // web sayfasının kontrol eden görevli.
        driver.get("https://www.techno.study/");    // web sayfasını aç.


        MyFunc.Bekle(10);
        driver.quit();      // açılmış olan tüm tarayıcıları kapatır.

    }
}
