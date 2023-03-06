package Video34.HerokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HerokuappLogoutPage {

    public WebDriver driver;

    WebElement logoutButton;

    public HerokuappLogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
    }

}
