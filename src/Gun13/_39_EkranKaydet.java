package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class _39_EkranKaydet extends BaseDriver {
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.cssSelector("[name='username']"));
        userName.sendKeys("umut");

        WebElement password = driver.findElement(By.cssSelector("[name='password']"));
        password.sendKeys("123");

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        // çıkan ekran görüntüsünü kaydetmek istiyorum
        // if(hata var ise){ekran kaydet}

        List<WebElement> hataMesaji = driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size()>0)
        {
            System.out.println("Login olamadı, Hata mesajı göründü");

            TakesScreenshot ts = (TakesScreenshot) driver;      // 1. Aşama : ekran görüntüsü alma değişkenini tanımladım.
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);      // 2.Aşama : ekran görüntüsü alındı, şuan hafızada

            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png"));
        }

        // TODO: burada her hatada aynı dosyayı yeniliyor ve üzerine yazıyor.
        //       biz istiyoruz ki her dosya ayrı olsun yani her kayıt ayrı olsun,
        //       bunu nasıl yaparız ?
        //       LocalDateTime 'dan bilgileri alıcaz
        //       YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        MyFunc.Bekle(5);
        driverBekleKapat();
    }
}
