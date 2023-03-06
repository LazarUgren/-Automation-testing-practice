package Selenium_Video25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaprednijeStvari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https:www.google.com/");

        /*
        Struktura pretrage putem lokatora:
        id
        name
        class
        css
        relative xpath
        absolute xpath
         */


    }
}
