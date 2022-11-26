package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseDriver {

    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
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
