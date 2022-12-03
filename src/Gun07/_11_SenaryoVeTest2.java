package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.util.List;

public class _11_SenaryoVeTest2 extends BaseDriver {
/*
        1- https://www.saucedemo.com/  sitesini açın
        2- login işlemini yapınız.
        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
        4- Sonra geri dönün (Back to products e tıklatın)
        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
        6- sepete tıklatın
        7- CheckOut a tıklatın
        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
        Item total e eşit olup olmadığını if/Assert ile test ediniz.
*/
    @Test
    public void Test2()
    {
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

        userName.sendKeys("standard_user");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement backPack =driver.findElement(By.xpath("//a[@id='item_4_title_link']/div[text()='Sauce Labs Backpack']"));
        backPack.click();
        MyFunc.Bekle(1);

        WebElement addToCartBackPack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCartBackPack.click();
        MyFunc.Bekle(1);

        WebElement backToProducts = driver.findElement(By.xpath("//div[@class='header_secondary_container']//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(1);

        WebElement boltTshirt = driver.findElement(By.xpath("//a[@id='item_1_title_link']/div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();
        MyFunc.Bekle(1);

        WebElement addToCartTshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCartTshirt.click();
        MyFunc.Bekle(1);

        WebElement shoppingCartContainer=driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        shoppingCartContainer.click();
        MyFunc.Bekle(1);

        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Bekle(1);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("umut");
        MyFunc.Bekle(1);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("erdem");
        MyFunc.Bekle(1);

        WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip.sendKeys("48000");
        MyFunc.Bekle(1);

        WebElement continueClick = driver.findElement(By.xpath("//input[@id='continue']"));
        continueClick.click();
        MyFunc.Bekle(1);

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;

        for (WebElement e: prices) {
            toplam+=Double.parseDouble(e.getText().substring(1));    //$
        }
        System.out.println("total = " + toplam);


        WebElement webAltToplam = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam ="+webAltToplam.getText());
        double altToplam=Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam: " + altToplam);

        Assert.assertTrue("değerler eşit değil",(toplam==altToplam));

        driverBekleKapat();
    }



}
