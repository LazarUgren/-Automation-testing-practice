package Video30_TestNg_POM.POM_PokaznaVezba.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
    WebDriver driver;

    WebElement login;
    WebElement exceptions;

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

    public WebElement getExceptions() {
        return driver.findElement(By.linkText("Test Exceptions"));
    }

    //----------------------------------------------

    public void clickOnLoginPageButton(){
        this.getLogin().click();
    }

}
