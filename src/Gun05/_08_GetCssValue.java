package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValueEnter=driver.findElement(By.id("inputValEnter"));
        
        /*                          bunların hepsi attribute.
        <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="" strtindx="" endindx="">
        */

        //  class'ın karşılığı olan CSS değerlerini almak için getCssValue kullanılır.
        System.out.println("inputValueEnter.getAttribute(\"class\") = " + inputValueEnter.getAttribute("class"));
        System.out.println("inputValueEnter.getCssValue(\"color\") = " + inputValueEnter.getCssValue("color"));
        System.out.println("inputValueEnter.getCssValue(\"font-size\") = " + inputValueEnter.getCssValue("font-size"));

        driverBekleKapat();
    }
}
