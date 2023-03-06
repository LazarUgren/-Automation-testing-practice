package Video31_POM.PracticeTestAutomation.Base;

import Video31_POM.PracticeTestAutomation.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.ArrayList;

public class BasePagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js = (JavascriptExecutor) driver;
    public ArrayList<String> listaTabova;
    public SidebarpagePTA sidebarpage;
    public PracticepagePTA practicepage;
    public LoginPagePTA loginPagePTA;
    public LogoutPagePTA logoutPagePTA;
    public ExceptionsPagePTA exceptionsPagePTA;
    public CoursesPagePTA coursesPagePTA;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sidebarpage = new SidebarpagePTA(driver, wdwait);
        practicepage = new PracticepagePTA(driver, wdwait);
        loginPagePTA = new LoginPagePTA(driver, wdwait);
        logoutPagePTA = new LogoutPagePTA(driver, wdwait);
        exceptionsPagePTA = new ExceptionsPagePTA(driver, wdwait);
        coursesPagePTA = new CoursesPagePTA(driver, wdwait, js, listaTabova);
    }

    @AfterClass
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        //driver.close();
        driver.quit();
    }


}
