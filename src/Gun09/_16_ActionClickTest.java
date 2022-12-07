package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _16_ActionClickTest extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver);
//        System.out.println("aksiyon öncesi tüm aksiyonları çalıştıracağımız ana aksiyonlar sınıfı oluşturuldu");
//
//        Action aksiyon = aksiyonlar.moveToElement(element).click().build();     // elementin üzerine gidildi, click aksiyonu hazırda beekliyor, henüz click olmadı.
//        MyFunc.Bekle(1);
//
//        aksiyon.perform();  // harekete geç.

        aksiyonlar.moveToElement(element).click().build().perform();        // kısa hali


    }
}
