package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test3Yontem2 extends BaseDriver
{
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

        // görünmüyor
        WebElement hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girilmeden önce gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));  // burda hidden_elem'in olmasını bekleyecek

        WebElement email = driver.findElement(By.xpath("//input[@aria-label='Cep telefonu numarası veya e-posta']"));
        email.sendKeys("umuterdem@gmail.com");
        MyFunc.Bekle(1);

        // görünüyor
        hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girilmeden önce gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));     //// burda hidden_elem'in olmamasını bekleyecek

        WebElement day=driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][@id='day']"));
        Select ddDayMenu=new Select(day);
        ddDayMenu.selectByValue("20");
        MyFunc.Bekle(1);

        WebElement month=driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][@id='month']"));
        Select ddMonthMenu=new Select(month);
        ddMonthMenu.selectByValue("8");
        MyFunc.Bekle(1);

        WebElement year=driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][@id='year']"));
        Select ddYearMenu=new Select(year);
        ddYearMenu.selectByValue("1999");
        MyFunc.Bekle(1);

        driverBekleKapat();
    }
}