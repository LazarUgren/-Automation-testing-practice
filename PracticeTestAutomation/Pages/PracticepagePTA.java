package Video31_POM.PracticeTestAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticepagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement testLoginPage;
    WebElement testExceptionsPage;

    public PracticepagePTA(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTestLoginPage() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

    public WebElement getTestExceptionsPage() {
        return driver.findElement(By.linkText("Test Exceptions"));
    }

    //-----------------------

    public void clickOnTestLoginPage(){
        this.getTestLoginPage().click();
    }

    public void clickOnTestExceptionsPage(){
        this.getTestExceptionsPage().click();
    }


}
