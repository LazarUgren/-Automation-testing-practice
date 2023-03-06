package Video31_POM.PracticeTestAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class CoursesPagePTA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js;
    public ArrayList<String> listaTabova;


    WebElement linkToSeleniumWebDriverWithJavaForBeginners;
    WebElement EnrollInThisCourseOnUdemyButton0;
    WebElement EnrollForJust$999OnTeachableButton0;

    WebElement linkToSeleniumWebDriverWithPythonForBeginners;
    WebElement EnrollInThisCourseOnUdemyButton1;
    WebElement EnrollForJust$999OnTeachableButton1;

    WebElement linkToJavaForTesters;
    WebElement EnrollInThisCourseOnUdemyButton2;
    WebElement EnrollForJust$999OnTeachableButton2;

    WebElement linkToAdvancedSeleniumWebDriverWithJavaAndTestNG;
    WebElement EnrollInThisCourseOnUdemyButton3;
    WebElement EnrollForJust$999OnTeachableButton3;

    WebElement linkToXPathLocatorsForSelenium;
    WebElement EnrollInThisCourseOnUdemyButton4;
    WebElement EnrollForJust$999OnTeachableButton4;

    WebElement linkToRESTAssuredAPITestAutomationForBeginners;
    WebElement EnrollInThisCourseOnUdemyButton5;
    WebElement EnrollForJust$999OnTeachableButton5;

    WebElement linkToAdvancedSeleniumGridAndCloud;
    WebElement EnrollInThisCourseOnUdemyButton6;
    WebElement EnrollForJust$999OnTeachableButton6;

    WebElement linkToAdvancedSeleniumTestingFrameworkWithJava;
    WebElement EnrollInThisCourseOnUdemyButton7;
    WebElement EnrollForJust$999OnTeachableButton7;

    public CoursesPagePTA(WebDriver driver, WebDriverWait wdwait, JavascriptExecutor js, ArrayList<String> listaTabova) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.js = js;
        this.listaTabova = listaTabova;
    }

    public WebElement getLinkToSeleniumWebDriverWithJavaForBeginners() {
        return driver.findElement(By.id("selenium-webdriver-with-java-for-beginners"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton0() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[2]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton0() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[2]/div[2]/a"));
    }

    public WebElement getLinkToSeleniumWebDriverWithPythonForBeginners() {
        return driver.findElement(By.linkText("Selenium WebDriver with Python for beginners"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton1() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[4]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton1() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[4]/div[2]/a"));
    }

    public WebElement getLinkToJavaForTesters() {
        return driver.findElement(By.linkText("Java for Testers"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton2() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[6]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton2() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[6]/div[2]/a"));
    }

    public WebElement getLinkToAdvancedSeleniumWebDriverWithJavaAndTestNG() {
        return driver.findElement(By.linkText("Advanced Selenium WebDriver with Java and TestNG"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton3() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[8]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton3() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[8]/div[2]/a"));
    }

    public WebElement getLinkToXPathLocatorsForSelenium() {
        return driver.findElement(By.linkText("XPath locators for Selenium"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton4() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[10]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton4() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[10]/div[2]/a"));
    }

    public WebElement getLinkToRESTAssuredAPITestAutomationForBeginners() {
        return driver.findElement(By.linkText("REST Assured. API test automation for beginners"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton5() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[12]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton5() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[12]/div[2]/a"));
    }

    public WebElement getLinkToAdvancedSeleniumGridAndCloud() {
        return driver.findElement(By.linkText("Advanced Selenium Grid and Cloud"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton6() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[14]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton6() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[14]/div[2]/a"));
    }

    public WebElement getLinkToAdvancedSeleniumTestingFrameworkWithJava() {
        return driver.findElement(By.linkText("Advanced Selenium testing framework with Java"));
    }

    public WebElement getEnrollInThisCourseOnUdemyButton7() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[16]/div[1]/a"));
    }

    public WebElement getEnrollForJust$999OnTeachableButton7() {
        return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[16]/div[2]/a"));
    }
}
