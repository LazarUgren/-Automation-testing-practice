package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG_TEST_WordPrees {

    WebDriver driver;
    WebDriverWait wdwait;
    JavascriptExecutor js;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
    }
    @Test(priority = 10)
    public void testWorldPress(){
        driver.navigate().to("https://wordpress.com/create/?aff=58022&cid=8348279&cmp_id=9808156547&adg_id=98727271423&kwd=wordpress&device=c");
        WebElement logInUserNameButton = driver.findElement(By.cssSelector(".lpc-header-nav-bar-list-item-not-logged-in.lpc-header-nav-bar-list-item"));
        logInUserNameButton.click();
        WebElement usernameBox = driver.findElement(By.className("form-text-input"));
        usernameBox.sendKeys("laza-lazica.94@hotmail.com");
        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();
        WebElement passwordBox = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordBox));
        passwordBox.sendKeys("123qwerty");
        WebElement logInPasswordButton = driver.findElement(By.className("login__form-action"));
        logInPasswordButton.click();

        wdwait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/lazarugrenovic.wordpress.com"));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://wordpress.com/home/lazarugrenovic.wordpress.com";
        Assert.assertEquals(actualURL, expectedURL);

        WebElement myProfileButton = driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));
        myProfileButton.click();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.className("sidebar__me-signout-text")));
        WebElement logOut = driver.findElement(By.className("sidebar__me-signout-text"));
        Assert.assertTrue(logOut.isDisplayed());

        wdwait.until(ExpectedConditions.elementToBeClickable(logOut));
        logOut.click();
    }
    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
