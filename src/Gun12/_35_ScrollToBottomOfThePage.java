package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _35_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");        // sayfanın sonuna kadar kaydır

        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0, 0);");     // sayfanın başına gider

        driverBekleKapat();
    }
}
