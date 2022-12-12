package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _37_RobotClass extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt = new Robot();
         /*    Accept all için  */  /*
        for (int i = 0; i < 6; i++)
        {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }
        */  /* ***************************** */

        for (int i = 0; i < 21; i++)
        {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);      // şu anda windows pop up açıldı
        MyFunc.Bekle(5);

        // bilgisayarımızdaki dosyanın path'ini dosya adının olduğu tere yapıştırmamız gerekiyor bunun için
        // önce dosyanın path'inin yolunu hafızaya kopyalayıp, sonra ctrl + v ile açılan windows popup' ın dosya adı bölümüne yapıştırmamız gerekiyor.

        // hafızaya path'i kopyaladım
        StringSelection selection = new StringSelection("\"C:\\Users\\umut\\Documents\\Ornek.txt\"");       // javaya ait yöntem    / java set clipboard text / google search
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

        MyFunc.Bekle(1);

        // ctrl+v BASTIM
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);

        //CTRL+V BIRAKTIM
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i = 0; i < 2; i++)
        {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        // butona basıldıktan sonra yazının çıkmasını bekle
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        // bu bekleme kodu aynı zamanda WebElement tipinde değer döndürür.

        Assert.assertTrue(uploadMessage.getText().contains("has been successfully uploaded."));     // ERROR
    }
}
