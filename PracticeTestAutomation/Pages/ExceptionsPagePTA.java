package Video31_POM.PracticeTestAutomation.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionsPagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement listTextBox;
    WebElement listRow2TextBox;
    WebElement editButton;
    WebElement addButton;
    WebElement safeButton;
    WebElement removeButton;
    WebElement instructionsText;

    public ExceptionsPagePTA(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getListTextBox() {
        return driver.findElement(By.id("row1")).findElement(By.className("input-field"));
    }

    public WebElement getEditButton() {
        return driver.findElement(By.id("edit_btn"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("add_btn"));
    }

    public WebElement getListRow2TextBox() {
        return driver.findElement(By.id("row2")).findElement(By.className("input-field"));
    }

    public WebElement getSafeButton() {
        return driver.findElement(By.name("Safe"));
        //By.id("save_btn")
        //By.className("btn")
        //(By.linkText("Safe")
    }

    public WebElement getRemoveButton() {
        return driver.findElement(By.id("remove_btn"));
    }

    public WebElement getInstructionsText() {
        return driver.findElement(By.id("instructions"));
    }

    //----------------------------------------------------

    public void clickOnEditButton(){
        this.getEditButton().click();
    }

    public void clickOnAddButton(){
        this.getAddButton().click();
    }

    public void insertYourFavoriteFood(String food){
        this.getListTextBox().clear();
        this.getListTextBox().sendKeys(food);
    }

    public void insertYourFavoriteFoodInRow2(String food){
        this.getListRow2TextBox().clear();
        this.getListRow2TextBox().sendKeys(food);
    }



}
