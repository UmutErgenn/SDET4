package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;    // javanın kendi test kontrol ve organize sınıfı

public class _09_FindingByCssSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement textBox =driver.findElement(By.cssSelector("[id='user-message'][class='form-control']"));    // bulmak istediğimiz elementin id'si başka bir elemente de atanmışsa
        textBox.sendKeys("Merhaba Umut");                                                                 // CSSselector kullanarak birden fazla anahtar kelimeyle arama yapabiliriz.

        // WebElement textBox =driver.findElement(By.cssSelector("input[id='user-message']"));      id'nin hangi tag'a ait olduğunu belirterek de arayabiliriz.

        MyFunc.Bekle(3);

        WebElement button = driver.findElement(By.cssSelector("[type='button'][class='btn btn-default'][onclick='showInput();']"));
        button.click();

        WebElement msg = driver.findElement(By.cssSelector("span[id='display']"));
        /*              textbox'a gönderdiğimiz mesajın display elementine ulaşıp ulaşmadığını kontrol ediyoruz

        if (msg.getText().contains("Merhaba Umut"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        */
            // if-else sürekli başarılı/başarısız mesajı gönderecek ve bu test sürecinde bizi ve bilgisayarı yorar,bu yüzden sadece hata varsa mesaj veren assert'i kullanırız.

        Assert.assertTrue("Mesaj bulunamadı",msg.getText().contains("Merhaba Umut"));  //  kontrol noktası görevi görür        beklenen/expect
        // assertTrue: içindeki değer true mu ? True ise hiç bir şey yapmaz,mesaj vermez.
        // True değil ise beklenen olmamış demektir ve hata mesajı verir.
        // yani genel kural : hata var ise göster, yok ise beni rahatsız etme.


        driverBekleKapat();
    }
}
