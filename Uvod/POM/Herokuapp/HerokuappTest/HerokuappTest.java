package Video34.HerokuappTest;

import Video34.HerokuappBase.BaseTestHerokuapp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuappTest extends BaseTestHerokuapp {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test (priority = 10)
    public void userCanLogIn(){
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickLogin();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 1, 1);

        String actualMessage = loginPage.getActualMessageLogedIn().getText();
        String expectedMessage = excelReader.getStringData("Message", 1, 0);

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(logoutPage.getLogoutButton().isDisplayed());
    }

    @Test (priority = 20)
    public void userCannotLogInWithWrongUsername(){
        String invalidUsername = excelReader.getStringData("Login", 1, 2);
        String validPassword = excelReader.getStringData("Login", 1, 1);

        loginPage.inputUsername(invalidUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickLogin();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 1, 2);

        String actualMessage = loginPage.getActualMessageCannotLogIn().getText();
        String expectedMessage = excelReader.getStringData("Message", 1, 1);

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 30)
    public void userCannotLogInWithWrongPassword(){
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String invalidPassword = excelReader.getStringData("Login", 1, 3);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickLogin();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 1, 2);

        String actualMessage = loginPage.getActualMessageCannotLogIn().getText();
        String expectedMessage = excelReader.getStringData("Message", 1, 2);

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 40)
    public void userCannotLogInWithMultipleWrongUsernamesAndPasswords(){
        for (int j = 1; j <= excelReader.getLastRow("ListOfUsernamesAndPasswords"); j++) {
            for (int i = 1; i <= excelReader.getLastRow("ListOfUsernamesAndPasswords"); i++) {
                String invalidUsername = excelReader.getStringData("ListOfUsernamesAndPasswords", i, 0);
                String invalidPassword = excelReader.getStringData("ListOfUsernamesAndPasswords", j, 1);

                loginPage.inputUsername(invalidUsername);
                loginPage.inputPassword(invalidPassword);
                loginPage.clickLogin();

                String actualURL = driver.getCurrentUrl();
                String expectedURL = excelReader.getStringData("URL", 1, 2);

                String actualMessage = loginPage.getActualMessageCannotLogIn().getText();
                String expectedMessageNick = excelReader.getStringData("Message", 1, 1);
                String expectedMessagePass = excelReader.getStringData("Message", 1, 2);

                if (actualMessage.equals(expectedMessageNick)){
                    Assert.assertEquals(actualMessage, expectedMessageNick);
                } else {
                    Assert.assertEquals(actualMessage, expectedMessagePass);
                }

                Assert.assertEquals(actualURL, expectedURL);
            }
        }
    }

    @Test (priority = 50)
    public void userCannotLogInWithMultipleWrongUsernames(){
        for (int i = 1; i <= excelReader.getLastRow("ListOfUsernamesAndPasswords"); i++){
            String invalidUsername = excelReader.getStringData("ListOfUsernamesAndPasswords", i, 0);
            String validPassword = excelReader.getStringData("Login", 1, 1);

            loginPage.inputUsername(invalidUsername);
            loginPage.inputPassword(validPassword);
            loginPage.clickLogin();

            String actualURL = driver.getCurrentUrl();
            String expectedURL = excelReader.getStringData("URL", 1, 2);

            String actualMessage = loginPage.getActualMessageCannotLogIn().getText();
            String expectedMessageNick = excelReader.getStringData("Message", 1, 1);

            Assert.assertEquals(actualMessage, expectedMessageNick);
            Assert.assertEquals(actualURL, expectedURL);
        }

    }

    @Test (priority = 60)
    public void userCannotLogInWithMultipleWrongPasswords(){
        for (int i = 1; i <= excelReader.getLastRow("ListOfUsernamesAndPasswords"); i++){
            String validUsername = excelReader.getStringData("Login", 1, 0);
            String invalidPassword = excelReader.getStringData("ListOfUsernamesAndPasswords", i, 1);

            loginPage.inputUsername(validUsername);
            loginPage.inputPassword(invalidPassword);
            loginPage.clickLogin();

            String actualURL = driver.getCurrentUrl();
            String expectedURL = excelReader.getStringData("URL", 1, 2);

            String actualMessage = loginPage.getActualMessageCannotLogIn().getText();
            String expectedMessage = excelReader.getStringData("Message", 1, 2);

            Assert.assertEquals(actualURL, expectedURL);
            Assert.assertEquals(actualMessage, expectedMessage);
        }
    }


    /*
     vezbe radi, idi u neki drugi projekat, dopuni pom fajl i kreiraj
    excel kao ovde i zameni stringove sa getovanim podatcima iz exela.
     */

}
