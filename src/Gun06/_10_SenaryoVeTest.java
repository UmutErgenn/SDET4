package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _10_SenaryoVeTest extends BaseDriver {
    /*
1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
2- Business i çekleyin.
3- discover XYZ ye tıklatın ve online Advertising i seçin
4- Every day i seçin
5- Good u seçin
6- using XYZ yi tıklatın ve 3.seçeneği seçin
    */

@Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");           //Locator
        WebElement businessCheckBox = driver.findElement(By.cssSelector("input[id$='_4586_0']"));
        businessCheckBox.click();
        MyFunc.Bekle(2);

        WebElement select = driver.findElement(By.cssSelector("select[id$='_4588']"));
        select.click();
        MyFunc.Bekle(2);
                                                                        // select tag'li, id si ... ile biten elemanın çocuklarından option tag'li value değeri ... olan eleman.
        WebElement onlineAlisveris = driver.findElement(By.cssSelector("select[id$='_4588']>option[value='Online Advertising']"));      // :nth-child() ile de bulunabilirdi.
        onlineAlisveris.click();
        MyFunc.Bekle(2);

        WebElement everyDay=driver.findElement(By.cssSelector("input[id$='_89585_0']"));
        everyDay.click();
        MyFunc.Bekle(2);

        WebElement good = driver.findElement(By.cssSelector("input[id$='_4589_0']"));
        good.click();
        MyFunc.Bekle(2);

        WebElement howLong = driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLong.click();
        MyFunc.Bekle(2);

        WebElement Month = driver.findElement(By.cssSelector("select[id$='_4597']>option[value*='month or more']"));
        Month.click();

        driverBekleKapat();
    }
}
