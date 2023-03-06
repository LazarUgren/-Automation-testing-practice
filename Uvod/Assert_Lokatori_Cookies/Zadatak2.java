package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

/*
Zadatak2: Otvori stranicu worldpress i prijavi se na svoj nalog.
 */
public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));

        userName.sendKeys("laza-lazica.94@hotmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

        password.sendKeys("sifra sifrica");

        WebElement prijaviSe = driver.findElement(By.cssSelector("[data-testid='royal_login_button']"));
        prijaviSe.click();

        //Thread.sleep(2000);
        //driver.close();










    }
}
