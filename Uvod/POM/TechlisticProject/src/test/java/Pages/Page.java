package Pages;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Page extends BasePage {

    public Page(){
        PageFactory.initElements(driver, this);
    }

    public @FindBy ( name = "exp")
    List<WebElement> experience;

    //------------------------------


    public void clickExperience(int i){
        this.experience.get(i).click();
    }
}
