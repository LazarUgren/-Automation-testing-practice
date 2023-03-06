package Video30_TestNg_POM.POM_PokaznaVezba.Tests;

import Video30_TestNg_POM.POM_PokaznaVezba.Base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends BasePage {



    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @Test
    public void userCanGoToLoginPage(){
        sidebarPage.clickOnPractice();
        practicePage.clickOnLoginPageButton();
    }
}
