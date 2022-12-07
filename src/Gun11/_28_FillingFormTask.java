package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
public class _28_FillingFormTask extends BaseDriver {
    @Test
    public void Test()
    {
        String name = "umut";
        String comment = "Merhaba ben umut";
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement webName = driver.findElement(By.xpath("//input[@id='title']"));
        webName.sendKeys(name);

        WebElement webComment = driver.findElement(By.xpath("//textarea[@id='description']"));
        webComment.sendKeys(comment);

        WebElement submit = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submit.click();

//         bu locator'daki elementin text'i bu olana kadar bekle.
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(10));
        bekle.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Form submited Successfully!']"),"Form submited Successfully!"));

        WebElement iletildi = driver.findElement(By.xpath("//div[text()='Form submited Successfully!']"));
        Assert.assertEquals("Form submited Successfully!",iletildi.getText());
    }
}
