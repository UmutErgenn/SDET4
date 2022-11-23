package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {             // eleman bulunamazsa ne olur ????
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();                                  // web sayfasının kontrol eden görevli.
        driver.get("https://form.jotform.com/221934510376353");                 // web sayfasını aç.

        try {
                                                            // locator
            WebElement element = driver.findElement(By.id("sublabel_8_firs"));      // id yi yanlış yazdık, dolayısıyla elemanı bulamadı ve hata verecek.
            System.out.println("element.getText() = " + element.getText());
        }
        catch (Exception ex){
            System.out.println("Eleman bulunamadı = " + ex.getMessage());
        }

        MyFunc.Bekle(10);
        driver.quit();                                              // açılmış olan tüm tarayıcıları kapatır.
    }
}
