package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5UploadPic {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://crop-circle.imageonline.co/#circlecropresult");

        WebElement upload = driver.findElement(By.id("inputImage"));// dugme input fotografije
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", upload);// Ovo je skrolovanje da se spustis niz stranicu i da ti u centru ekrana bude fotografija.
        upload.sendKeys("C:\\Users\\pc\\Desktop\\Slike QA\\zez\\Matrix.png");// lokacija fotke + \\Matrix.png (ime i ekstenzija fotke) to rucno dopises.

    }
}
