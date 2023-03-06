package Video34.HerokuappPages;

import Video34.HerokuappBase.BaseTestHerokuapp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappLoginPageBeta extends BaseTestHerokuapp {

    public HerokuappLoginPageBeta(){
        PageFactory.initElements(driver, this);
    }

    @FindBy ( id = "username")
    WebElement username;

    @FindBy ( id = "password")
    WebElement password;

    @FindBy ( css = ".fa.fa-2x.fa-sign-in")
    WebElement loginButton;

    //-------------------------------

    public void insertUsername(String name){
        username.clear();
        username.sendKeys(name);
    }

    public void insertPassword (String pass){
        password.clear();
        password.sendKeys(pass);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
