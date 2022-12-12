package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra ana sayfa ya dönününüz.
    ipucu : driver.switchTo().window(id) ile istenilen tab a geçiş yapılır
 */
public class _33_WindowSwitch extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle();       // bulunduğum sayfanın id'sini aldım yani ana sayfa

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)
        {
             if (!link.getAttribute("href").contains("mailto"));
             link.click();
        }

        Set<String> windowIdler = driver.getWindowHandles();
        for (String id : windowIdler)
        {
            driver.switchTo().window(id);   // diğer tarafa (windowa) geçiş yaptık.

            System.out.println(id+" -Title = "+driver.getTitle()+" - URL: "+driver.getCurrentUrl());
        }
        // TODO:
        // burada önce ana sayfaya geçelim
        // sonra ana sayfa harici diğer sayfaları kapatalım

        driver.switchTo().window(mainPageId);
        for (String id : windowIdler)
        {
            if (id.equals(mainPageId))
                continue;   // sadece bu adımı pas geçti,
            driver.switchTo().window(id);
            driver.close();     // sadece bulunduğum window'u kapatır
        }
        MyFunc.Bekle(5);
        driverBekleKapat();
    }
}
