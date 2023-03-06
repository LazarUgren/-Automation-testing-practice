package Video34.HerokuappBase;

import Video34.HerokuappPages.HerokuappLoginPage;
import Video34.HerokuappPages.HerokuappLogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTestHerokuapp {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public HerokuappLoginPage loginPage;
    public HerokuappLogoutPage logoutPage;
    public ExcelReader excelReader;
    public String HomeURL;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\pc\\IdeaProjects\\Video34SeleniumApachePOI_POM\\TestBook.xlsx");
        HomeURL = excelReader.getStringData("URL", 1, 0);
        loginPage = new HerokuappLoginPage(driver);
        logoutPage = new HerokuappLogoutPage(driver);
    }

    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitClick(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
