package Video31_POM.PracticeTestAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarpagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement home;
    WebElement practice;
    WebElement courses;
    WebElement blog;
    WebElement contact;

    public SidebarpagePTA(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
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

    //----------------------------------

    public void clickHome(){ // ovo je metoda koju cu da koristim
        this.getHome().click(); // da kliknem na home
    }

    public void clickPractice(){
        this.getPractice().click();
    }

    public void clickCourses(){
        this.getCourses().click();
    }

    public void clickBlog(){
        this.getBlog().click();
    }

    public void clickContact(){
        this.getContact().click();
    }

    // ako zelim da proverim da li sam dobro uneo tekst za svaki
    // element na stranici pisem sledecu metodu.

    public String getHomeText(){
        return this.getHome().getText();
    }

    public String getPracticeText(){
        return this.getPractice().getText();
    }

    public String getCoursesText(){
        return this.getCourses().getText();
    }

    public String getBlogText(){
        return this.getBlog().getText();
    }

    public String getContactText(){
        return this.getContact().getText();
    }


}
