package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG_TEST_Amazon {

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
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_1_sspa?keywords=selenium+test&qid=1671387614&sprefix=selenium+tes%2Caps%2C195&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFBVjRaT0FYQU1ZRlAmZW5jcnlwdGVkSWQ9QTAxNTM0OTFYUTBBSUdYUE5aQ08mZW5jcnlwdGVkQWRJZD1BMDY3MTM3NTI2UTlNTzNLT0U5MDgmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
    }

    @Test
    public void testAmazon(){
        WebElement counterControlBefore = driver.findElement(By.id("nav-cart-count"));
        String counterCB = counterControlBefore.getText();
        String expectedEmptyCart = "0";

        Assert.assertEquals(counterCB, expectedEmptyCart);

        WebElement addToCartButton = driver.findElement(By.id("addToCart_feature_div"));
        addToCartButton.click();

        WebElement counterControlDuringPurchase = driver.findElement(By.id("nav-cart-count"));
        String counterCA = counterControlDuringPurchase.getText();
        String expectedFullCart = "1";
        Assert.assertEquals(counterCA, expectedFullCart);

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        WebElement counterControlAfterPurchase = driver.findElement(By.id("nav-cart-count"));
        String counterCAP = counterControlAfterPurchase.getText();

        Assert.assertEquals(counterCAP, expectedEmptyCart);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
