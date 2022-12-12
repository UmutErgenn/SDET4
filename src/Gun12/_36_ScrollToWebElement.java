package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    window.scrollBy(0, 3000);
    window.scrollTo(0, document.body.scrollHeight);
    "arguments[0].scrollIntoView(true);", element
    "arguments[0].click();", element
 */
public class _36_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://triplebyte.com/");
        MyFunc.Bekle(5);
        JavascriptExecutor js = (JavascriptExecutor) driver;

//         scroll'u bir elemente kadar, yani o pencere içinde gözükene kadar nasıl kaydırırım

        WebElement element = driver.findElement(By.cssSelector("[id='cta-demo-5']>div[style]"));

        js.executeScript("arguments[0].scrollIntoView(true);", element);        // javascript scroll to element selenium
        MyFunc.Bekle(3);

        js.executeScript("window.scrollBy(0,-500);");   // sayfanın kaydırma sonrası tekrar yüklenmesi için tetikleme

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='cta-demo-5']>div[style]")));


        js.executeScript("arguments[0].click();", element);     // javascript element click selenium
//         element.click();     // de yapılabilir

        driverBekleKapat();
    }
}
