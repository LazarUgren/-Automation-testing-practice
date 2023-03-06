package Video30_TestNg_POM.POM_PokaznaVezba.Base;

import Video30_TestNg_POM.POM_PokaznaVezba.Pages.PracticePage;
import Video30_TestNg_POM.POM_PokaznaVezba.Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public SidebarPage sidebarPage;
    public PracticePage practicePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sidebarPage = new SidebarPage(driver);
        practicePage = new PracticePage(driver);
    }

    @AfterClass
    public void tearDown(){
        /*driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();*/
    }
}
