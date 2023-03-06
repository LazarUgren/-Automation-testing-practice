package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cookies {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/create/?aff=58022&cid=8348279&cmp_id=9808156547&adg_id=98727271423&kwd=wordpress&device=c");
        WebElement logIn0 = driver.findElement(By.cssSelector(".lpc-header-nav-bar-list-item-not-logged-in.lpc-header-nav-bar-list-item"));
        logIn0.click();

        /*
        WebElement username = driver.findElement(By.id("usernameOrEmail"));
        username.sendKeys("laza-lazica.94@hotmail.com");
        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();
        WebElement password = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        password.sendKeys("123qwerty");
        continueButton.click();
         */

        /*
        Prvo kreiramo kolacic i u zagradi ide njegovo ime i njegova vrednost.
        U sledecoj komandi dodajes kolacic drajveru.
        Kolacic nalazis tako sto ides na inspekt,
        pa trazis dve stelice desno,
        pa trazis application
        pa tu imas kolacice
        tebi je potreban kolacic sa imenom log in.
        i vidis da je u njegovoj vrednosti upisano korisnicko ime naloga.
         */
        //Cookie primer = new Cookie("Ime", "Vrednost");
        //driver.manage().addCookie(primer);


        Cookie kolacic = new Cookie("wordpress_logged_in", "lazarugrenovic%7C1765930157%7C4Duj3OrCg6k3PjMa56fuh2WR9u6j9nVRHxR3x6wZmYo%7C8c08821f78be70789c86d66140b674976b27f6620b7b0b52f096073746a8cf6f");
        driver.manage().addCookie(kolacic);
        driver.navigate().refresh();

        WebElement continueButton = driver.findElement(By.cssSelector(".button.is-primary"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.is-primary")));
        continueButton.click();

        /*
        Neka vrsta kraja programa, obrisemo kolacice, zatvorimo prozorcice i zatvorimo drajver.
         */
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
