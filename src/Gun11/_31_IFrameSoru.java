package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
public class _31_IFrameSoru extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.cssSelector("[id='topic']+input"));
        topic.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.cssSelector("[id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement menu = driver.findElement(By.cssSelector("[id='animals']"));
        Select ddMenu = new Select(menu);
        ddMenu.selectByIndex(3);        // veya ddMenu.getOptions().size()-1

        driverBekleKapat();
    }

}
