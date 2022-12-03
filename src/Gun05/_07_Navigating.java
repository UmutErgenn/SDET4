package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseDriver {

    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");      // driver.get ile aynı.sadece ileri geri gisdip gelirken navigate.to kullanmamız gerek.
        // illa navigate.to ile açmak zorunda değiliz, driver.get ile aldığımız linkte de ileri geri gidip gelebiliriz ama driver.navigate.back/forward kullanmamız gerekir.

        // driver.get("");         // navigate.to sayfanın tümünün yüklenmesini beklemezken driver.get sayfanın tümünün yüklenmesini bekler.
        // driver.navigate.back;
        // driver.navigate.forward;

        MyFunc.Bekle(3);

        WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl());     // o anda bulunduğum URL' yi veriyor.

        MyFunc.Bekle(3);
        driver.navigate().back();   // tarayıcı history'sinden geri geldim.

        System.out.println(driver.getCurrentUrl());        // o anda bulunduğum URL' yi veriyor.

        MyFunc.Bekle(3);
        driver.navigate().forward();    // ileri gittim.

        System.out.println(driver.getCurrentUrl());         // o anda bulunduğum URL' yi veriyor.

        driverBekleKapat();
    }
}
