package Selenium_Video25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) {

        // ovde mogu da ubacim web driver ili da ga importujem u pom-u u obliku biblioteke
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // prvi nacin na koji mozemo da otvorimo driver sa nekom adresom
        //driver.get("https://www.google.com/");
        // drugi nacin kako mozemo da odemo na neku stranicu, koristi drugi nacin jer get suvise podseca na druge radnje.
        driver.navigate().to("https://www.google.com/");

        driver.navigate().to("https://www.youtube.com/");
        // jebi ga, morao sam :D
        driver.navigate().to("https://www.facebook.com/");
        // komanda za osvezavanje
        driver.navigate().refresh();
        // komanda za korak unazad
        driver.navigate().back();
        // komanda za korak unapred
        driver.navigate().forward();

        // Ovo je komanda za zatvaranje drivera, da ne klikcem na x polje
        driver.close();

    }
}
