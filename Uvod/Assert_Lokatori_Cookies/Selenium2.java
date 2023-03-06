package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenium2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        //driver.getWindowHandles();
        ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("https://www.youtube.com");

        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.facebook.com");

        driver.switchTo().window(listaTabova.get(3));
        Thread.sleep(1000);
        driver.close();

        Thread.sleep(2000);
        driver.switchTo().window(listaTabova.get(2));
        driver.close();//sada zatvaram tab fejsbuka

        Thread.sleep(3000);
        driver.quit();

        System.out.println(listaTabova.get(0));
        System.out.println(listaTabova.get(1));
        System.out.println(listaTabova.get(2));
        System.out.println(listaTabova.get(3));


    }

}
