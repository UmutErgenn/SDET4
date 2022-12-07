package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _18_ActionRightClickTest extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.id("rightClickBtn"));

//        new Actions(driver).moveToElement(element).contextClick().build().perform();

        new Actions(driver).contextClick(element).build().perform();    // moveToElement(element) kullanmak yerine contextClick(WebElement target) de kullanılabilir.
    }
}
