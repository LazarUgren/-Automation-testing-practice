package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak2a {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://wordpress.com/create/?aff=58022&cid=8348279&cmp_id=9808156547&adg_id=98727271423&kwd=wordpress&device=c");

        WebElement logIn = driver.findElement(By.xpath("//*[@id=\"lpc-header-nav\"]/div/div/div/div/nav/ul[2]/li[1]/a"));
        logIn.click();
        Thread.sleep(500);

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"usernameOrEmail\"]"));
        userName.sendKeys("laza-lazica.94@hotmail.com");
        Thread.sleep(500);

        WebElement clicLogIn = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
        clicLogIn.click();
        Thread.sleep(500);

        WebElement seenPaswprd = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[1]/div/div/span"));
        seenPaswprd.click();
        Thread.sleep(500);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("123qwerty");
        Thread.sleep(500);


        WebElement clicLogIn2 = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
        clicLogIn2.click();

        // e sada cu da radim Assert, dakle da testiram da li korespondiraju elementi.
        /*
        Ideje kako sve mogu da testiram: Uporedi url sa pocetnom stranicom, uporedi url kad si prijavljen.
        tipa uporedi da li ima imena sajta i pokusaj da uporedis taj string sa imenom, a ne samo da li je neki string prisutan.
         */

        Thread.sleep(1000);

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Thread.sleep(1000);

        String expectedURL = "https://wordpress.com/home/lazarugrenovic.wordpress.com";

        Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(500);

        String actualHead = driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[1]/header/h1")).getText();
        String actualUpdateYourHomepage = driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[2]/div[1]/div/div/div/div[2]/ul/li[2]/button/div[2]/span")).getText();

        String expectedHead = "My Home";
        String expectedUpdateYourHomepage = "Update your homepage";

        Assert.assertEquals(actualHead, expectedHead);
        Assert.assertEquals(actualUpdateYourHomepage, expectedUpdateYourHomepage);

        Thread.sleep(2000);
        driver.quit();


    }
}
