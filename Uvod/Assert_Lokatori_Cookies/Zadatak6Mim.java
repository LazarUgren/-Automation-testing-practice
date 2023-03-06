package Video26Selenium_Assert_Lokatori_Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak6Mim {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.navigate().to("https://imgflip.com/memegenerator");

        Cookie kolacic1 = new Cookie("rootkey", "wVbYrhG3DK7FrHYA3cJUobu22InNPwo3");
        Cookie kolacic2 = new Cookie("__utma","71379083.1563304203.1671398465.1671528934.1671534504.5");
        Cookie kolacic3 = new Cookie("rootemail","filosof666tragicni%40gmail.com");
        Cookie kolacic4 = new Cookie("__gpi","UID=00000b949cba9ee7:T=1671398467:RT=1671524029:S=ALNI_MYg3visp368blDmMKtWk-xydsma4A");
        Cookie kolacic5 = new Cookie("__gpi","UID=00000b949cba9ee7:T=1671398467:RT=1671524029:S=ALNI_MYg3visp368blDmMKtWk-xydsma4A");
        Cookie kolacic6 = new Cookie("G_ENABLED_IDPS","google");
        Cookie kolacic7 = new Cookie("_ncid","98357fa4e08055167f51d1f18a0f9a98");
        driver.manage().addCookie(kolacic1);
        driver.manage().addCookie(kolacic2);
        driver.manage().addCookie(kolacic3);
        driver.manage().addCookie(kolacic4);
        driver.manage().addCookie(kolacic5);
        driver.manage().addCookie(kolacic6);
        driver.manage().addCookie(kolacic7);

        driver.navigate().refresh();

        WebElement picture = driver.findElement(By.xpath("//*[@id=\"mm-select-popular\"]/div[15]"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mm-select-popular\"]/div[15]")));
        picture.click();
        WebElement focus = driver.findElement(By.id("mm-preview-outer"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", focus);

        WebElement textBox1 = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[1]/div[1]/textarea"));
        WebElement textBox2 = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[2]/div[1]/textarea"));
        wdwait.until(ExpectedConditions.elementToBeClickable(textBox1));
        wdwait.until(ExpectedConditions.elementToBeClickable(textBox2));

        textBox1.sendKeys("Vidi macku kako sedi za stolom, kako moze?!?");
        textBox2.sendKeys("mnjau");

        WebElement settingButton = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[2]/div[2]/div[3]/button"));
        wdwait.until(ExpectedConditions.elementToBeClickable(settingButton));
        settingButton.click();

        WebElement font = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[6]/div[2]/div[2]/div[3]/div/div[5]/input"));
        wdwait.until(ExpectedConditions.elementToBeClickable(font));
        font.clear();
        Thread.sleep(500);
        font.sendKeys("30");

        wdwait.until(ExpectedConditions.elementToBeClickable(settingButton));
        settingButton.click();

        WebElement generateButton = driver.findElement(By.cssSelector(".mm-generate.b.but"));
        wdwait.until(ExpectedConditions.elementToBeClickable(generateButton));
        generateButton.click();












    }
}
