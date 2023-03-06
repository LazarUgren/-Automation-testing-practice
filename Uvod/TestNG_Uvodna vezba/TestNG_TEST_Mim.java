package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class TestNG_TEST_Mim {

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
        driver.navigate().to("https://imgflip.com/memegenerator");



    }

    @Test
    public void testMim(){
        WebElement pictureButton = driver.findElement(By.xpath("//*[@id=\"mm-select-popular\"]/div[14]"));
        scrollTo(pictureButton);
        WebElement pictureFrame = driver.findElement(By.className("mm-canv"));
        scrollTo(pictureFrame);
        pictureButton.click();

        WebElement textBox1 = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[1]/div[1]/textarea"));
        WebElement textBox2 = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[2]/div[1]/textarea"));

        textBox1.sendKeys("Jebes ovaj zadatak");
        textBox2.sendKeys("Burn baby Burn!!!");

        WebElement generateButton = driver.findElement(By.cssSelector(".mm-generate.b.but"));
        generateButton.click();


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }

    public void scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
