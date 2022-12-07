package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _21_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1()
    {
//        kutucuğa git, içine tıklat
//        Shift bas a' ya bas, shift'i bırak
//        hmet yaz

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element)
                .click()                    // içine tıklat
                    .keyDown(Keys.SHIFT)        // shift'e bas
                        .sendKeys("a")              // a' ya bas
                            .keyUp(Keys.SHIFT)          // shift'i bırak
                                .sendKeys("hmet")           // hmet yaz
                                    .build();                   // hazırda bekle
        MyFunc.Bekle(1);
        aksiyon.perform();

//        aksiyonlar.click(element).keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("hmet").build().perform();

    }
}
