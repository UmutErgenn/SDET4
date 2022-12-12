package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _38_RobotFileUpload2 extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        WebElement input = driver.findElement(By.id("uploadfile_0"));

        input.sendKeys("C:\\Users\\umut\\Documents\\Ornek.txt");

        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//              bu tanımlamayı base driver' a public static olarak tanımladım böylece tekrar tanımlamadan,her yerden ulaşabileceğim.
        WebElement uploadMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMessage.getText().contains("has been successfully uploaded."));

        driverBekleKapat();
    }
}
