package BasePage;

import Pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    public WebDriverWait wdwait;
    public Page page;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        page = new Page();
    }

    @AfterClass
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        //driver.close();
        //driver.quit();
    }


}
