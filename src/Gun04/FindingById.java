package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingById {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();                                  // web sayfasının kontrol eden görevli.
        driver.get("https://form.jotform.com/221934510376353");                 // web sayfasını aç.


        //WebElement name = driver.findElement(By.id("first_8"));     // elemanı bulma.  - firs_8 aradığımız elemanın id'si.eğer id yoksa name'i üzerinden de arayabiliriz -
        //name.sendKeys("ismet");                                       // kutucuklara yazı gönderme.

        WebElement label1 = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("label1.getText() = " + label1.getText());                       // sabit bir text'i id'sini kullanarak bulduk.

        MyFunc.Bekle(10);
        driver.quit();                                              // açılmış olan tüm tarayıcıları kapatır.
    }
}