package Video31_POM.PracticeTestAutomation.Tests;

import Video31_POM.PracticeTestAutomation.Base.BasePagePTA;
import Video31_POM.PracticeTestAutomation.Pages.CoursesPagePTA;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;

public class TestCoursesPagePTA extends BasePagePTA {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @Test(priority = 10)
    public void goToCoursesPage(){
        sidebarpage.clickCourses();

        String expectedURL = "https://practicetestautomation.com/courses/";
        String actualURL = driver.getCurrentUrl();
        wdwait.until(ExpectedConditions.urlToBe("https://practicetestautomation.com/courses/"));
        Assert.assertEquals(actualURL, expectedURL);

        wdwait.until(ExpectedConditions.elementToBeClickable(coursesPagePTA.getLinkToJavaForTesters()));
        Assert.assertTrue(coursesPagePTA.getLinkToAdvancedSeleniumGridAndCloud().isDisplayed());
        Assert.assertTrue(coursesPagePTA.getLinkToJavaForTesters().isDisplayed());
    }

    @Test(priority = 20)
    public void clickOnSeleniumWebDriverWithJavaForBeginners(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToSeleniumWebDriverWithJavaForBeginners().click();
        redirectToNewTab();

        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3067701/selenium-webdriver-with-java-for-beginners";
        String actualURL = driver.getCurrentUrl();
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3067701/selenium-webdriver-with-java-for-beginners"));
        Assert.assertEquals(actualURL, expectedURL);

        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".school-title.navbarBrand")));
        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 22)
    public void clickOnEnrollUdemyButton0(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton0().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/selenium-for-beginners/?referralCode=A21BE51035C15406EFA4";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/selenium-for-beginners/?referralCode=A21BE51035C15406EFA4"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 24)
    public void clickOnEnrollTeachable0(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton0().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3067701/selenium-webdriver-with-java-for-beginners";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3067701/selenium-webdriver-with-java-for-beginners"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 30)
    public void clickOnSeleniumWebDriverWithPythonForBeginners(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToSeleniumWebDriverWithPythonForBeginners().click();
        redirectToNewTab();

        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/4401910/selenium-webdriver-with-python-for-beginners";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 32)
    public void clickOnEnrollUdemyButton1(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton1().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/selenium-webdriver-python-course/?referralCode=58A27F30D4182400844C";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/selenium-webdriver-python-course/?referralCode=58A27F30D4182400844C"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 34)
    public void clickOnEnrollTeachable1(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton1().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/4401910/selenium-webdriver-with-python-for-beginners";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/4401910/selenium-webdriver-with-python-for-beginners"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 40)
    public void clickOnJavaForTesters(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToJavaForTesters().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3767507/java-for-testers";
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 42)
    public void clickOnEnrollUdemyButton2(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton2().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/java-for-testers-dmitry/?referralCode=F58D4816F344105F0A27";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/java-for-testers-dmitry/?referralCode=F58D4816F344105F0A27"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 44)
    public void clickOnEnrollTeachable2(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton2().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3767507/java-for-testers";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3767507/java-for-testers"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 50)
    public void clickOnAdvancedSeleniumWebDriverWithJavaAndTestNG(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToAdvancedSeleniumWebDriverWithJavaAndTestNG().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3119905/advanced-selenium-webdriver-with-java-and-testng";
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 52)
    public void clickOnEnrollUdemyButton3(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton3().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/advanced-selenium-webdriver/?referralCode=3B2C78FCD0550DEA0920";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/advanced-selenium-webdriver/?referralCode=3B2C78FCD0550DEA0920"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 54)
    public void clickOnEnrollTeachable3(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton3().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3119905/advanced-selenium-webdriver-with-java-and-testng";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3119905/advanced-selenium-webdriver-with-java-and-testng"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 60)
    public void clickOnXPathLocatorsForSelenium(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToXPathLocatorsForSelenium().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3136295/xpath-locators-for-selenium";
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 62)
    public void clickOnEnrollUdemyButton4(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton4().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/xpath-locators-for-selenium/?referralCode=ACB28329B5AC2333DDCC";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/xpath-locators-for-selenium/?referralCode=ACB28329B5AC2333DDCC"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 64)
    public void clickOnEnrollTeachable4(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton4().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3136295/xpath-locators-for-selenium";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3136295/xpath-locators-for-selenium"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 70)
    public void clickOnRESTAssuredAPITestAutomationForBeginners(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToRESTAssuredAPITestAutomationForBeginners().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3138687/rest-assured-api-test-automation-for-beginners";
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 72)
    public void clickOnEnrollUdemyButton5(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton5().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/rest-assured-for-beginners/?referralCode=1A09A25AF7AF9D99A116";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/rest-assured-for-beginners/?referralCode=1A09A25AF7AF9D99A116"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 74)
    public void clickOnEnrollTeachable5(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton5().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3138687/rest-assured-api-test-automation-for-beginners";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3138687/rest-assured-api-test-automation-for-beginners"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 80)
    public void clickOnAdvancedSeleniumGridAndCloud(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToAdvancedSeleniumGridAndCloud().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3131318/advanced-selenium-grid-and-cloud";
        Assert.assertEquals(actualURL, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 82)
    public void clickOnEnrollUdemyButton6(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton6().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/advanced-selenium-grid-and-cloud/?referralCode=464C5E80B2950274ADBE";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/advanced-selenium-grid-and-cloud/?referralCode=464C5E80B2950274ADBE"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 84)
    public void clickOnEnrollTeachable6(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton6().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3131318/advanced-selenium-grid-and-cloud";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3131318/advanced-selenium-grid-and-cloud"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 90)
    public void clickOnAdvancedSeleniumTestingFrameworkWithJava(){
        clickOnCoursesPage();
        coursesPagePTA.getLinkToAdvancedSeleniumTestingFrameworkWithJava().click();
        redirectToNewTab();

        String actualURl = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3152639/selenium-webdriver-framework";
        Assert.assertEquals(actualURl, expectedURL);

        String actualFirstHeaderText = driver.findElement(By.cssSelector(".school-title.navbarBrand")).getText();
        String expectedFirstHeaderText = "Practice Test Automation School";
        Assert.assertEquals(actualFirstHeaderText, expectedFirstHeaderText);
        goToHomePage();
    }

    @Test(priority = 92)
    public void clickOnEnrollUdemyButton7(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollInThisCourseOnUdemyButton7().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.udemy.com/course/selenium-webdriver-test-framework-from-scratch/?referralCode=AFA22636EC7880A95457";
        wdwait.until(ExpectedConditions.urlToBe("https://www.udemy.com/course/selenium-webdriver-test-framework-from-scratch/?referralCode=AFA22636EC7880A95457"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    @Test(priority = 94)
    public void clickOnEnrollTeachable7(){
        clickOnCoursesPage();
        coursesPagePTA.getEnrollForJust$999OnTeachableButton7().click();
        redirectToNewTab();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://sso.teachable.com/secure/971788/checkout/3152639/selenium-webdriver-framework";
        wdwait.until(ExpectedConditions.urlToBe("https://sso.teachable.com/secure/971788/checkout/3152639/selenium-webdriver-framework"));
        Assert.assertEquals(actualURL, expectedURL);
        goToHomePage();
    }

    public void clickOnCoursesPage(){
        sidebarpage.clickCourses();
    }

    public void redirectToNewTab(){
        //ArrayList<String>
        listaTabova = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listaTabova.get(1));
    }

    public void goToHomePage(){
        driver.switchTo().window(listaTabova.get(1));
        driver.close();
        driver.switchTo().window(listaTabova.get(0));
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @AfterMethod
    public void pauseBetweenTests(){

    }

}
