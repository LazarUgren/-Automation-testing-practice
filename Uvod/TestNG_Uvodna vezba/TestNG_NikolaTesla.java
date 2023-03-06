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

public class TestNG_NikolaTesla {

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
        driver.navigate().to("https://www.wikipedia.org/");
    }

    @Test(priority = 10)
    public void testWikipedia() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Nikola Tesla");
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
        searchButton.click();

        wdwait.until(ExpectedConditions.urlToBe("https://sr.wikipedia.org/wiki/%D0%9D%D0%B8%D0%BA%D0%BE%D0%BB%D0%B0_%D0%A2%D0%B5%D1%81%D0%BB%D0%B0"));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sr.wikipedia.org/wiki/%D0%9D%D0%B8%D0%BA%D0%BE%D0%BB%D0%B0_%D0%A2%D0%B5%D1%81%D0%BB%D0%B0";
        Assert.assertEquals(actualURL, expectedURL);


        WebElement firstHeading = driver.findElement(By.id("firstHeading"));
        String head = firstHeading.getText();
        String expectedHead = "Никола Тесла";
        Assert.assertEquals(head, expectedHead);

        WebElement picture = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[2]/td/a/img"));
        Assert.assertTrue(picture.isDisplayed());
    }




    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }





}
