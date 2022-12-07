package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _23_ActionHoverOverTest extends BaseDriver {
                                            //         Jewelry-necklaces-bib necklaces'e git
    @Test
    public void Test1()
    {
        driver.get("https://www.etsy.com/");

//                  1- isDisplay ve isEnable gibi kontroller, element HTML nini içinde var fakat görünür değil durumunda kullanılır.
//                  2- BAZI durumlarda element HTML nini içinde hiç yoktur.

        List<WebElement>cookiesAccept = driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
            // elementi bulamazsa implicitly wait devreye girer ve verilen süre kadar bulmaya çalışır.

        if (cookiesAccept.size()>0) {         // varsa
            cookiesAccept.get(0).click();      // kapat
        }



        WebElement jewelry = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(jewelry).build().perform();
        MyFunc.Bekle(1);

        WebElement necklaces = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));

        aksiyonlar.moveToElement(necklaces).build().perform();
        MyFunc.Bekle(1);

        WebElement bibNecklaces = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));

        aksiyonlar.moveToElement(bibNecklaces).click().build().perform();

        Assert.assertTrue("Url de bib-Necklaces var mı?",driver.getCurrentUrl().contains("bib"));

        driverBekleKapat();
    }
}
