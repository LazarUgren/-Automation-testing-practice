package Video31_POM.PracticeTestAutomation.Tests;

import Video31_POM.PracticeTestAutomation.Base.BasePagePTA;
import com.google.common.base.VerifyException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestExceptionsPTA extends BasePagePTA {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/");
    }

    public void goToTestExceptions(){
        sidebarpage.clickPractice();
        practicepage.clickOnTestExceptionsPage();
    }
    public void scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test (priority = 10)
    public void noSuchElementException(){
        goToTestExceptions();
        exceptionsPagePTA.clickOnAddButton();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("row2")));
        Assert.assertTrue(exceptionsPagePTA.getListRow2TextBox().isDisplayed());
    }

    @Test (priority = 20)
    public void elementNotInteractableException(){// test nemoguce izvesti do kraja, jer je dugme na sajtu pokvareno/dugme safe
        String favoriteFood = "Andjelina guza";

        goToTestExceptions();
        exceptionsPagePTA.clickOnAddButton();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("row2")));
        scrollTo(exceptionsPagePTA.getListRow2TextBox());
        exceptionsPagePTA.insertYourFavoriteFoodInRow2(favoriteFood);
        //driver.findElement(By.xpath("//*[@id=\"save_btn\"]")).findElement(By.id("save_btn")).findElement(By.className("btn")).findElement(By.linkText("Safe")).findElement(By.name("Safe")).click();
        try {
            //driver.findElement(By.name("Safe"));
            driver.findElement(By.xpath("//*[@id=\"save_btn\"]")).findElement(By.id("save_btn")).findElement(By.className("btn")).findElement(By.linkText("Safe")).findElement(By.name("Safe")).click();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        Assert.assertFalse(exceptionsPagePTA.getListTextBox().isEnabled());
    }

    @Test (priority = 30)
    public void invalidElementStateException(){
        String favoriteFood = "Andejlina guza";
        goToTestExceptions();
        exceptionsPagePTA.clickOnAddButton();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("row2")));
        scrollTo(exceptionsPagePTA.getListRow2TextBox());
        exceptionsPagePTA.insertYourFavoriteFoodInRow2(favoriteFood);
        exceptionsPagePTA.getRemoveButton().click();
        wdwait.until(ExpectedConditions.elementToBeClickable(exceptionsPagePTA.getAddButton()));
        exceptionsPagePTA.getAddButton().click();
        wdwait.until(ExpectedConditions.elementToBeClickable(exceptionsPagePTA.getListRow2TextBox()));
        String favoriteFood2 = "Andjeline grudi";
        String expectedText = "Andjeline grudi";
        String actualText = driver.findElement(By.id("row2")).getText();
        exceptionsPagePTA.getListRow2TextBox().sendKeys(favoriteFood2);

    }

    @Test (priority = 40)
    public void staleElementReferenceException(){
        goToTestExceptions();
        Assert.assertTrue(exceptionsPagePTA.getInstructionsText().isDisplayed());
        exceptionsPagePTA.getAddButton().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("row2")));
        try {
            Assert.assertTrue(exceptionsPagePTA.getInstructionsText().isDisplayed());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test (priority = 50)
    public void timeoutException(){
        goToTestExceptions();
        exceptionsPagePTA.getAddButton().click();
        wdwait.withTimeout(Duration.ofSeconds(3));
        try {
            Assert.assertFalse(exceptionsPagePTA.getListRow2TextBox().isDisplayed());
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
