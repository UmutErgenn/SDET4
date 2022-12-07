package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _15_isDisplayed extends BaseDriver {
    @Test
    public void Test3() {
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doüum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.

        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement NewAccountButton = driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']"));
        NewAccountButton.click();
        MyFunc.Bekle(1);

        WebElement name = driver.findElement(By.xpath("//input[@aria-label='Adın']"));
        name.sendKeys("umut");
        MyFunc.Bekle(1);

        WebElement surname = driver.findElement(By.xpath("//input[@aria-label='Soyadın']"));
        surname.sendKeys("erdem");
        MyFunc.Bekle(1);

        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());  // False
        Assert.assertFalse(reEmail.isDisplayed());

        WebElement email = driver.findElement(By.xpath("//input[@aria-label='Cep telefonu numarası veya e-posta']"));
        email.sendKeys("umuterdem@gmail.com");
        MyFunc.Bekle(1);

        reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed()); // True
        Assert.assertTrue(reEmail.isDisplayed());

        driverBekleKapat();
    }
}