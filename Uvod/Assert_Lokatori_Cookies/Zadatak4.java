package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_1_sspa?keywords=selenium+test&qid=1671387614&sprefix=selenium+tes%2Caps%2C195&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFBVjRaT0FYQU1ZRlAmZW5jcnlwdGVkSWQ9QTAxNTM0OTFYUTBBSUdYUE5aQ08mZW5jcnlwdGVkQWRJZD1BMDY3MTM3NTI2UTlNTzNLT0U5MDgmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");

        WebElement cartPreAdding = driver.findElement(By.id("nav-cart-count"));
        String cart1 = cartPreAdding.getText();
        Assert.assertEquals(cart1, "0");

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        WebElement cartAfterAdding = driver.findElement(By.id("nav-cart-count"));
        String cart2 = cartAfterAdding.getText();
        Assert.assertEquals(cart2, "1");

        driver.manage().deleteCookieNamed("session-id");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        WebElement cartAfterDelate = driver.findElement(By.id("nav-cart-count"));
        String cart3 = cartAfterDelate.getText();
        Assert.assertEquals(cart3, "0");

        Thread.sleep(4000);
        driver.close();
        driver.quit();

    }
}
