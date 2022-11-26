package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();                                  // web sayfasının kontrol eden görevli.
        driver.get("https://www.hepsiburada.com/");                             // web sayfasını aç.

        WebElement link=driver.findElement(By.linkText("Siparişlerim"));        // linkin ekranda görünen texti yazılır , sadece a TAG leri için özel locator bulma yöntemidir.
        System.out.println("link.getText() = " + link.getText());

        System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("href"));
        System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("title"));
        System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("rel"));

        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));  // linkin görünen text inin bir kısmı ile bulma,
        // adece a TAG leri için özel locator bulma yöntemidir.
        System.out.println("link2.getText() = " + link2.getText());
        
        MyFunc.Bekle(10);
        driver.quit();                                              // açılmış olan tüm tarayıcıları kapatır.
    }
}
