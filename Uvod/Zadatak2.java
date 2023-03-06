package Selenium_Video25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driverom idemo na stranicu vikipedije
        driver.navigate().to("https://www.wikipedia.org/");

        // pristupamo elemetu polja za unost teksta koji pretrazujemo
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));

        // Unosimo u polje pretrage zeljeni tekst
        searchBox.sendKeys("Nikola Tesla");

        // formiramo dugme za pretrazivanje koje se nalazi pored polja za pretrage
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));

        // idemo na opciju klik dugmeta za pretragu kako bi dosli do zeljenog clanka o Nikoli Tesli
        searchButton.click();

        // Sto se testiranja tice, postavlja se pitanje... Kako da znamo da smo na stranici koja sadrzi clanak o Nikoli Tesli?
        // Npr. Mozemo da uporedimo url koji smo dobili preko zadatka i url koji bi obezbedili da uporedimo sa urlom koji smo dobili radeci zadatak.

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);

        String expectedURL = "https://en.wikipedia.org/wiki/Nikola_Tesla";
        //Uporedjivanje aktuelnog url u kodu i ocekivanog urla kakav je na sajtu.
        //Kad ovde uporedjujem url/e nisu jednaki zato sto je jedan sajt engleska viki, a drugi srpska viki.
        Assert.assertNotEquals(actualURL, expectedURL);

        // Uporedjivanja prvog head...prvog naslova u kodu i unos ocekivanog naslova na sajtu u kodu.
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]/span")).getText();


        String expectedTitle = "Nikola Tesla";

        // Kad ovde uporedjujem naslove, nisu ekvivalentni zato sto je jedan na cirilici drugi na latinici
        Assert.assertNotEquals(actualTitle, expectedTitle);

        // Ovde proveravam da li je na stranici slika izlozena. Ne proveravam koja je fotografija u pitanju, nego da li je fotografija prisutna.
        WebElement picture = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[2]/td/a/img"));

        Assert.assertTrue(picture.isDisplayed());

        //driver.clouse zatvara samo jedan tab(prozor) u pretrazivacu
        driver.close();
        //drugi nacin za zatvaranje drivera, i driver quit zatvara celokupan prozor sa svim tabovima.
        //driver.quit();
    }
}
