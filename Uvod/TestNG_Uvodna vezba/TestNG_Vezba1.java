package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class TestNG_Vezba1 {

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
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void test() throws InterruptedException {
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Itbootcamp");
        textBox.sendKeys(ENTER);
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.partialLinkText("ITBootcamp - Besplatna IT prekvalifikacija"));
        element.click();
    }

    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }




}
