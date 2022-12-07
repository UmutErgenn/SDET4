package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _25_AlertPart2 extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

//        WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
//        clickMe2.click();
//        MyFunc.Bekle(1);
//
//        driver.switchTo().alert().dismiss();     // alert kutucuğuna geçiş yapıldı ve cancel butonuna tıklandı.    geçiş yapıyoruz çünkü alertler webwlwmwnt değil.
//        MyFunc.Bekle(1);    // ok bastığın anda asıl sayfaya dönmüş oluyorsun.


        WebElement clickMe3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMe3.click();
        MyFunc.Bekle(2);
        String name = "umut";
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();

        WebElement prompted = driver.findElement(By.xpath("//p[@id='prompt-demo']"));

        Assert.assertTrue("çıktı isimle eşleşiyor mu",prompted.getText().contains(name));

        driverBekleKapat();
    }
}
