package Video34.HerokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HerokuappLoginPage {

    public WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement actualMessageLogedIn;
    WebElement actualMessageCannotLogIn;

    public HerokuappLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }

    public WebElement getActualMessageLogedIn() {
        return driver.findElement(By.className("subheader"));
    }

    public WebElement getActualMessageCannotLogIn() {
        return driver.findElement(By.id("flash"));
    }

    //---------------------------------

    public void inputUsername(String name){
        this.getUsername().clear();
        this.getUsername().sendKeys(name);
    }

    public void inputPassword(String pass){
        this.getPassword().clear();
        this.getPassword().sendKeys(pass);
    }

    public void clickLogin(){
        this.getLoginButton().click();
    }


}
