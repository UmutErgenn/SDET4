package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
    Selenium Bekletme Konusu
    Thread.Sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

    Implicitly Wait :
    Tüm sayfadaki elemanlar için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
    Bütüm elemanlar için geçerli.NoSuchElement hatası nı vermek için verilen süre kadar,  eleman bulunana kadar bekler.

      driver.manage().timeouts().implicitlyWait(dr);


    pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
 */
public class _26_ImplicitlyWait extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));               // elementi bulduğu anda yeni adıma geçer.
//        MyFunc.Bekle(120);                                                            // elementi bulsa bile 120 saniye bekleyecek. interview'lerde bundan bahsedilmez.

        WebElement webDriverText = driver.findElement(By.xpath("//p[text()='WebDriver']"));
    }
}
