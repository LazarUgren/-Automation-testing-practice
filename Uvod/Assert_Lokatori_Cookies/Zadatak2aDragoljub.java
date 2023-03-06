package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak2aDragoljub {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*
        Ovo je takodje pauza za cekanje s tim sto je nastelovana, ona je oznacena na driver i ceka 10 sekundi.
        sada stavis je i postavis uslov da traje dok neko dugme ne postane klikljivo ili url ne postane pristupan.
        ako se to desi u periodu ispod 10 sekundi, cim se zadatak izvrsi ona prekida pauzu i program nastavlja.
        ako dodje do 10 sekundi i uslov se nije ispunio, pauza je gotova i program nastavlja dalje.
         */
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/create/?aff=58022&cid=8348279&cmp_id=9808156547&adg_id=98727271423&kwd=wordpress&device=c");

        /*
        U slucaju da u imenu clase imas razmak, onda promenis na css selektor i umesto razmaka stavis tacku i na pocetku recenice stavis tacku.
        Ovo omogucava programskom jeziku da procita tekst, jer on trazi jednu recenicu u celini, a postojanje razmaka je razbija na dve.
         */
        WebElement logIn0 = driver.findElement(By.cssSelector(".lpc-header-nav-bar-list-item-not-logged-in.lpc-header-nav-bar-list-item"));
        logIn0.click();

        WebElement username = driver.findElement(By.id("usernameOrEmail"));
        username.sendKeys("laza-lazica.94@hotmail.com");

        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();

        WebElement password = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        password.sendKeys("123qwerty");

        //WebElement logInButton = driver.findElement(By.className("login__form-action"));
        //logInButton.click();
        continueButton.click();

        wdwait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/lazarugrenovic.wordpress.com"));

        String expectedURL = "https://wordpress.com/home/lazarugrenovic.wordpress.com";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        WebElement profileButton = driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));
        Assert.assertTrue(profileButton.isDisplayed());
        profileButton.click();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.className("sidebar__me-signout-text")));
        WebElement logOutButton = driver.findElement(By.className("sidebar__me-signout-text"));
        Assert.assertTrue(logOutButton.isDisplayed());

        driver.quit();


    }
}
