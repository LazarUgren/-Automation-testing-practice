package Video31_POM.PracticeTestAutomation.Tests;

import Video31_POM.PracticeTestAutomation.Base.BasePagePTA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPTA extends BasePagePTA {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @Test
    public void homeTextTest(){
        //String expectedText = "HOME";
        //Assert.assertEquals(sidebarpage.getHomeText(), expectedText);

        //Obrati paznju na razliku ".toUpperCase()" znaci da biram da konvertujem sva slova koja poredim u velika.
        // Imam i opciju ".toLowerCase()" konvertuje sva slova koja se porede u mala.
        // U gornjem zakomentarisanom slucaju sam napravio string koji je identican tekstu na stranici.

        String expectedText = "HOME";
        Assert.assertEquals(sidebarpage.getHomeText().toUpperCase(), expectedText);
    }

    /*
    @Test
    public void sidebarTextTest(){
        String expectedTextPractice = "practice";
        Assert.assertEquals(sidebarpage.getPracticeText().toLowerCase(), expectedTextPractice);

        String expectedTextCourses = "COURSES";
        Assert.assertEquals(sidebarpage.getCoursesText().toUpperCase(), expectedTextCourses);

        String expectedTextBlog = "blog";
        Assert.assertEquals(sidebarpage.getBlogText().toLowerCase(), expectedTextBlog);

        String expectedTextContact = "CONTACT";
        Assert.assertEquals(sidebarpage.getContactText().toUpperCase(), expectedTextContact);
    }
     */


    public void goToLoginPage(){
        sidebarpage.clickPractice();
        practicepage.clickOnTestLoginPage();
    }

    // Ova tri testa sam zakomentarisao (ja sam ih radio),
    // da bih ispisao kako Dragoljub radi
    /*
    @Test
    public void positiveLogInTest(){
        goToLoginPage();

        loginPagePTA.getUsernameTextBox().clear();
        loginPagePTA.clickOnUsernameTextBox();
        loginPagePTA.insertValidUsername();

        loginPagePTA.getPasswordTextBox().clear();
        loginPagePTA.clickOnPasswordTextBox();
        loginPagePTA.insertValidPassword();

        loginPagePTA.clickOnSubmitButton();
    }

    @Test
    public void negativeUsernameTest(){
        goToLoginPage();

        loginPagePTA.getUsernameTextBox().clear();
        loginPagePTA.clickOnUsernameTextBox();
        loginPagePTA.insertInvalidUsername();

        loginPagePTA.getPasswordTextBox().clear();
        loginPagePTA.clickOnPasswordTextBox();
        loginPagePTA.insertValidPassword();

        loginPagePTA.clickOnSubmitButton();
    }

    @Test
    public void negativePasswordTest(){
        goToLoginPage();

        loginPagePTA.getUsernameTextBox().clear();
        loginPagePTA.clickOnUsernameTextBox();
        loginPagePTA.insertValidUsername();

        loginPagePTA.getPasswordTextBox().clear();
        loginPagePTA.clickOnPasswordTextBox();
        loginPagePTA.insertInvalidPassword();

        loginPagePTA.clickOnSubmitButton();
    }

     */

    // Test treba da izgleda u ovoj formi, kao da se rade koraci...
    // idi na login stranicu, ubaci korisnicko ime, ubaci sifru, klikni na submit
    // i na kraju test
    @Test
    public void userCanLogIn(){
        goToLoginPage();
        String validUsername = "student";
        String validPassword = "Password123";
        loginPagePTA.insertUsername(validUsername);
        loginPagePTA.insertPassword(validPassword);
        loginPagePTA.clickOnSubmitButton();

        Assert.assertTrue(logoutPagePTA.getLogOutButton().isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidUsername(){
        goToLoginPage();
        String invalidUsername = "wrong";
        String validPassword = "Password123";
        String expectedErrorMessage = "Your username is invalid!";

        loginPagePTA.insertUsername(invalidUsername);
        loginPagePTA.insertPassword(validPassword);
        loginPagePTA.clickOnSubmitButton();

        Assert.assertTrue(loginPagePTA.getErrorMessage().isDisplayed());
        Assert.assertEquals(loginPagePTA.getErrorText(), expectedErrorMessage);
    }









    /*
    @Test
    public void goToExceptionsPage(){
        sidebarpage.clickPractice();
        practicepage.clickOnTestExceptionsPage();
    }
     */


}
