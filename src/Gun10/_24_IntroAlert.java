package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _24_IntroAlert extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe1.click();
        MyFunc.Bekle(1);

        driver.switchTo().alert().accept();     // alert kutucuğuna geçiş yapıldı ve okey butonuna tıklandı.    geçiş yapıyoruz çünkü alertler webwlwmwnt değil.
        MyFunc.Bekle(1);    // ok bastığın anda asıl sayfaya dönmüş oluyorsun.

        driverBekleKapat();
    }
}
