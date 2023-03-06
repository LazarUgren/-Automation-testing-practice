package Video30_TestNg_POM.POM_PokaznaVezba.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
Ovde se prave sve stranice koje taj sajt ima, tacnije
pravimo po jednu klasu za svaku stranicu.
 */
public class SidebarPage {

    WebDriver driver;

    WebElement home;
    WebElement practice;
    WebElement courses;
    WebElement blog;
    WebElement contact;

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getHome() {
        return driver.findElement(By.id("menu-item-43"));
    }

    public WebElement getPractice() {
        return driver.findElement(By.id("menu-item-20"));
    }

    public WebElement getCourses() {
        return driver.findElement(By.id("menu-item-21"));
    }

    public WebElement getBlog() {
        return driver.findElement(By.id("menu-item-19"));
    }

    public WebElement getContact() {
        return driver.findElement(By.id("menu-item-18"));
    }

    //------------------------------------------------------

    public void clickOnPractice(){
        this.getPractice().click();
    }

}
