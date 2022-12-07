package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _19_ActionDragAndDropTest extends BaseDriver
{
    @Test
    public void Test1()
    {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));

        //1.Yöntem
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();

        MyFunc.Bekle(1);

        //2.Yöntem
        WebElement seul = driver.findElement(By.id("box5"));
        WebElement kore = driver.findElement(By.id("box105"));

        aksiyon = aksiyonlar.clickAndHold(seul).build();
        aksiyon.perform();
//        new Actions(driver).clickAndHold(seul).build().perform();

        aksiyon = aksiyonlar.moveToElement(kore).release().build();
        aksiyon.perform();
//        new Actions(driver).moveToElement(kore).release().build().perform();
//        new Actions(driver).release(kore).build().perform();
//        aksiyonlar.release(kore).build().perform();       // eğer çok kullanacaksak her seferinde new actions kullanmak yerine yeni nesne oluşturup onu kullanmak daha mantıklı



    }
}