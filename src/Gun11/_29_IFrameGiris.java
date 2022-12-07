package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _29_IFrameGiris extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);     // "frame1" id ve name ve webelement geçişi çok yavaş.

        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("türkiye");

        // şu anda frame1 ile gösteilen sayfadayız, diğer frame2 veya frame3 veya ilk sayfamızdaki locator'ları bulamayız, çünkü driver şu anda frame1 isimli sayfayı Drive etmekte.

//        driver.switchTo().frame(0);           // içteki frame3' e geçiş olur.
//        driver.switchTo().parentFrame();        // bir önceki sayfaya geri döner.
//        driver.switchTo().defaultContent();       // hangi sayfada olursan ol ilk sayfaya direk geçiş yapar.

//        <iframe id="frame1".........>       // index=0      bu frame'in içine girilmeden frame3 görünür değil,yok gibi bu yüzden fram3'ün indexi de 0
//            <iframe id="frame3".........></iframe>      // index=0
//        </iframe>
//        <iframe id="frame2".........>       // index=1

        driverBekleKapat();
    }
}
