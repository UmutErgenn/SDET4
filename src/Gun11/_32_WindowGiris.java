package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _32_WindowGiris extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
            link.click();
        }

//        driver.getWindowHandle();   --> aktif olan tab (window)'un id'sini verir
        Set<String> windowIdler = driver.getWindowHandles();
        for (String id:windowIdler) 
        {
            System.out.println("id = " + id);    
        }
        
        MyFunc.Bekle(5);
        driverBekleKapat();
    }
}
