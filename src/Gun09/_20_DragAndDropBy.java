package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _20_DragAndDropBy extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Bekle(1);
        solSurgu.getSize();


        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.dragAndDropBy(solSurgu,100,0).build();
        aksiyon.perform();


        driverBekleKapat();


    }
}
