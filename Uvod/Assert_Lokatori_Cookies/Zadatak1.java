package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Zadatak1: Otvoriti 3 taba, svaki tab treba da odlazi na poseban URL (po vasoj zelji), sacekati 2 sekunde i zatvoriti sve tabove.
 */
public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        //napravi js objekat, sluzi za kreiranje novic tabova
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // otvori nove tabove
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        // smesti tabove u listu
        ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());

        // pozovi clan liste u kome je tab
        driver.switchTo().window(listaTabova.get(1));
        // tom tabu ispisi adresu kojoj treba da te odvede
        driver.navigate().to("https://www.youtube.com");

        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.pornhub.com");

        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(listaTabova.get(1));
        Thread.sleep(2000);
        driver.close();

        Thread.sleep(2000);
        driver.quit();

    }
}
