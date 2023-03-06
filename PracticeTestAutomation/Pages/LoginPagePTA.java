package Video31_POM.PracticeTestAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement usernameTextBox;
    WebElement passwordTextBox;
    WebElement submitButton;
    WebElement errorMessage;

    String validUsername = "student";
    String validPassword = "Password123";
    String invalidUsername = "invalidUsername";
    String invalidPassword = "invalidPassword";

    public LoginPagePTA(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsernameTextBox() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextBox() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.id("error"));
    }

    //----------------------------------------

    // Sve sto je nadole zakomentarisano to sam ja radio,
    //zakomentario sam da bih uabcio dragoljubov nacin.
    /*

    public void clickOnUsernameTextBox(){
        this.getUsernameTextBox().click();
    }

    public void clickOnPasswordTextBox(){
        this.getPasswordTextBox().click();
    }

    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }

    //-------------------------

    public void insertValidUsername(){
        this.getUsernameTextBox().sendKeys(validUsername);
    }

    public void insertValidPassword(){
        this.getPasswordTextBox().sendKeys(validPassword);
    }

    public void insertInvalidUsername(){
        this.getUsernameTextBox().sendKeys(invalidUsername);
    }

    public void insertInvalidPassword(){
        this.getPasswordTextBox().sendKeys(invalidPassword);
    }

     */

    public void insertUsername(String username){
        this.getUsernameTextBox().clear();
        this.getUsernameTextBox().sendKeys(username);
    }

    public void insertPassword(String pass){
        this.getPasswordTextBox().clear();
        this.getPasswordTextBox().sendKeys(pass);
    }

    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }

    public String getErrorText(){
        return  this.getErrorMessage().getText();
    }


}
