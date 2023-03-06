package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

/*
Zadatak3: Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan.
password 123QWErty!!!
 */
public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/login");

        /*
        WebElement userNameBox = driver.findElement(By.id("userName"));
        userNameBox.sendKeys("Ljubicanstvena");

        WebElement passwordBox = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        passwordBox.sendKeys("123QWErty!!!");
        WebElement logIn = driver.findElement(By.id("login"));
        logIn.click();

         */

        Cookie k1 = new Cookie("userName","Ljubicanstvena");
        Cookie k2 = new Cookie("userID", "382a67bf-9b9b-4a52-8203-dfaacd8897b8");
        Cookie k3 = new Cookie("_pbjs_userid_consent_data","3524755945110770");
        Cookie k4 = new Cookie("expires","2022-12-25T14%3A43%3A16.024Z");
        Cookie k5 = new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkxqdWJpY2Fuc3R2ZW5hIiwicGFzc3dvcmQiOiIxMjNRV0VydHkhISEiLCJpYXQiOjE2NzEzNzQ1OTZ9.m5TRGXuK04gMVEmnEDo6KpHrTp4v9WwJ-5oihfA7sQs");
        driver.manage().addCookie(k1);
        driver.manage().addCookie(k2);
        driver.manage().addCookie(k3);
        driver.manage().addCookie(k4);
        driver.manage().addCookie(k5);
        driver.navigate().refresh();

        WebElement logOut = driver.findElement(By.id("submit"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        logOut.click();

        WebElement userNameBox = driver.findElement(By.id("userName"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        WebElement logIn = driver.findElement(By.id("login"));
        WebElement newUser = driver.findElement(By.id("newUser"));

        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("newUser")));

        Assert.assertTrue(userNameBox.isDisplayed());
        Assert.assertTrue(passwordBox.isDisplayed());
        Assert.assertTrue(logIn.isDisplayed());
        Assert.assertTrue(newUser.isDisplayed());

        driver.quit();

    }
}
