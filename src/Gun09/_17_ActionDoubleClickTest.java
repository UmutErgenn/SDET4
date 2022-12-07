package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _17_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("doubleClickBtn"));

//        Actions aksiyonlar = new Actions(driver);
//
//        aksiyonlar.moveToElement(element).doubleClick().build().perform();

        new Actions(driver).moveToElement(element).doubleClick().build().perform();     // en kısa hali


        driverBekleKapat();
    }
}
