package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _34_ScrollIntro extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");
        MyFunc.Bekle(2);

        // javascript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,3000);");
//        (0,3000) -> (x,y) Sayfayı sağa/sola x kadar ve aşağı/yukarı y kadar kaydır.
//        3000 (px) pixel kadar aşağı kaydıracak

        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0,-3000);");

        // scrollTo : verilen pixel'e gider.
        // scrollBy : verilen kadar daha ileri gider.

        MyFunc.Bekle(5);
        driverBekleKapat();
    }
}
