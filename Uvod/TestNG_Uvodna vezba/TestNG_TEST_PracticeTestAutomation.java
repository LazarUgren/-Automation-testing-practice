package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

/*
https://practicetestautomation.com/practice-test-login/
 */
public class TestNG_TEST_PracticeTestAutomation {

    WebDriver driver;
    WebDriverWait wdwait;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 10)
    public void positiveLogInTest(){
        WebElement textBoxUsername = driver.findElement(By.id("username"));
        WebElement textBoxPassword = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        String validUsername = "student";
        String validPassword = "Password123";

        textBoxUsername.clear();
        textBoxUsername.sendKeys(validUsername);

        textBoxPassword.clear();
        textBoxPassword.sendKeys(validPassword);
        submitButton.click();

        String expextedURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expextedURL);

        WebElement textMessage1 = driver.findElement(By.className("post-title"));
        WebElement textMessage2 = driver.findElement(By.className("has-text-align-center"));
        String actualTextMessage1 = textMessage1.getText();
        String actualTextMessage2 = textMessage2.getText();
        String expectedMessage1 = "Logged In Successfully";
        String expectedMessage2 = "Congratulations student. You successfully logged in!";

        WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));

        Assert.assertEquals(actualTextMessage1, expectedMessage1);
        Assert.assertEquals(actualTextMessage2, expectedMessage2);
        Assert.assertTrue(logOutButton.isDisplayed());

    }

    @Test(priority = 20)
    public void negativeUnsernameTest(){
        WebElement textBoxUsername = driver.findElement(By.id("username"));
        WebElement textBoxPassword = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        String invalidUsername = "invalide user name";
        String validPassword = "Password123";

        wdwait.until(ExpectedConditions.urlToBe("https://practicetestautomation.com/practice-test-login/"));
        textBoxUsername.clear();
        textBoxUsername.sendKeys(invalidUsername);

        textBoxPassword.clear();
        textBoxPassword.sendKeys(validPassword);
        submitButton.click();

        WebElement errorMessage = driver.findElement(By.id("error"));
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("error")));
        String acturalErrorMessage = errorMessage.getText();
        String expectedMessage = "Your username is invalid!";

        Assert.assertTrue(errorMessage.isDisplayed());
        Assert.assertEquals(acturalErrorMessage, expectedMessage);
    }

    @Test(priority = 30)
    public void negativePasswordTest(){
        WebElement textBoxUsername = driver.findElement(By.id("username"));
        WebElement textBoxPassword = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        String validUsername = "student";
        String invalidPassword = "inValidPassword";

        wdwait.until(ExpectedConditions.urlToBe("https://practicetestautomation.com/practice-test-login/"));
        textBoxUsername.clear();
        textBoxUsername.sendKeys(validUsername);

        textBoxPassword.clear();
        textBoxPassword.sendKeys(invalidPassword);
        submitButton.click();

        WebElement errorMessage = driver.findElement(By.id("error"));
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("error")));
        String acturalErrorMessage = errorMessage.getText();
        String expectedMessage = "Your password is invalid!";

        Assert.assertTrue(errorMessage.isDisplayed());
        Assert.assertEquals(acturalErrorMessage, expectedMessage);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
