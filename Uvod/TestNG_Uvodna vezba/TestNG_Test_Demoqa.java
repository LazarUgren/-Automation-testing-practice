package Video30_TestNg_POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

/*
Zadatak3: Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan.
password 123QWErty!!!
 */
public class TestNG_Test_Demoqa {

    WebDriver driver;
    WebDriverWait wdwait;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
    }

    @Test
    public void testDemoQa(){
        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacic1 = new Cookie("IDE","AHWqTUnotZ4k0Ll0uoAEn3ub19RVV2Y_gPr-aKEgg3auiZUK1Ft13OEJ890iwKo9tsw");
        Cookie kolacic2 = new Cookie("1P_JAR","2022-12-24-11");
        Cookie kolacic3 = new Cookie("userID","382a67bf-9b9b-4a52-8203-dfaacd8897b8");
        Cookie kolacic4 = new Cookie("expires","2022-12-31T11%3A35%3A25.953Z");
        Cookie kolacic5 = new Cookie("NID","511=n0Rq_uJiSAFFFvfepg4NAG9wbCcraR3bcF7XE7gL0xHo9oTiLsowImHaA_iaLtQl0wU-ME_6KWOcIRgTQmvJT-3mokdyUhDeqrrLWz-rMM3ALsTuSR3-DFZOaJoGzsXDIX021IJ3djHBDcdfIne34skfxZgMRTySgOKuB4LsiFo");
        Cookie kolacic6 = new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkxqdWJpY2Fuc3R2ZW5hIiwicGFzc3dvcmQiOiIxMjNRV0VydHkhISEiLCJpYXQiOjE2NzE4ODE3MjV9.MSy575MKCS9doSqOZYYfV8Vcr__gCoQhGEiG79PnO9s");
        Cookie kolacic7 = new Cookie("cto_bidid","xnq_wV9hdm8yQ04lMkZSN09YdERYUU81RnJ1OVJPSHJQV0lLOTVJcnRDMHo0biUyRkcyRGpsek1QaVF4ck53OWtvanVCRW9CUHY2TXllQVlVc1labmV6NlhyTkxqJTJGUSUzRCUzRA");
        Cookie kolacic8 = new Cookie("panoramaId_expiry","1672486459887");
        Cookie kolacic9 = new Cookie("_cc_id","6f408b0a450f09113a115e2c67c79f33");
        Cookie kolacic10 = new Cookie("AEC","AakniGOPCDP03Z6QNuzTSdxfcTLS75pQBtRuLkJq8-4oZasZ9mmj8QhC-0E");
        Cookie kolacic11 = new Cookie("_ga","GA1.1.428150511.1671881657");
        Cookie kolacic12 = new Cookie("cto_bundle","euuphF9xOEREZUR3NnVoSlc3JTJGcmlkTkRQR05nZ1J1OEZJVThiJTJCdmFDZGdtc3hUTXdnRW9oNUhaZVE1VjJERDJYR3VqNGZWN1lKU3gxbHZSZlY3aWd6SXV0RHVoa1BuRWhVaHRTaG9mcnJpd0dTNHI5WEVBY2ViR0glMkJhMGVzOUdKUUdwcg");
        Cookie kolacic13 = new Cookie("_lr_env_src_ats","false");
        Cookie kolacic14 = new Cookie("_pubcid","6375c37a-45fc-44af-bf54-9d023d61df33");
        Cookie kolacic15 = new Cookie("_pbjs_userid_consent_data","3524755945110770");
        Cookie kolacic16 = new Cookie("userName","Ljubicanstvena");
        Cookie kolacic17 = new Cookie("__gpi","UID=00000b97eb872b22:T=1671881656:RT=1671881656:S=ALNI_MYDDollQeCtQHEWup1zDlk1gZkgAQ");
        Cookie kolacic18 = new Cookie("panoramaId","c68e4a86499729229984fbd4d46a16d5393873b07db26d3f87681427ed1b3fd9");
        Cookie kolacic19 = new Cookie("__gads","ID=2f8790916c5400aa:T=1671881656:S=ALNI_MYXmNTcMv0vHcgQWulCYbQBLqhPwQ");
        Cookie kolacic20 = new Cookie("_ga_MVRXK93D28","GS1.1.1671889302.2.0.1671889302.0.0.0");
        Cookie kolacic21 = new Cookie("pbjs-unifiedid","%7B%22TDID_LOOKUP%22%3A%22FALSE%22%2C%22TDID_CREATED_AT%22%3A%222022-12-24T11%3A34%3A19%22%7D");
        Cookie kolacic22 = new Cookie("_gid","GA1.2.1249060279.1671881657");

        driver.manage().addCookie(kolacic1);
        driver.manage().addCookie(kolacic2);
        driver.manage().addCookie(kolacic3);
        driver.manage().addCookie(kolacic4);
        driver.manage().addCookie(kolacic5);
        driver.manage().addCookie(kolacic6);
        driver.manage().addCookie(kolacic7);
        driver.manage().addCookie(kolacic8);
        driver.manage().addCookie(kolacic9);
        driver.manage().addCookie(kolacic10);
        driver.manage().addCookie(kolacic11);
        driver.manage().addCookie(kolacic12);
        driver.manage().addCookie(kolacic13);
        driver.manage().addCookie(kolacic14);
        driver.manage().addCookie(kolacic15);
        driver.manage().addCookie(kolacic16);
        driver.manage().addCookie(kolacic17);
        driver.manage().addCookie(kolacic18);
        driver.manage().addCookie(kolacic19);
        driver.manage().addCookie(kolacic20);
        driver.manage().addCookie(kolacic21);
        driver.manage().addCookie(kolacic22);

        driver.navigate().refresh();

        WebElement logOutButton = driver.findElement(By.id("submit"));
        logOutButton.click();

        WebElement userNameBox = driver.findElement(By.id("userName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement logInButton = driver.findElement(By.id("login"));
        WebElement newUserButton = driver.findElement(By.id("newUser"));

        Assert.assertTrue(userNameBox.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(logInButton.isDisplayed());
        Assert.assertTrue(newUserButton.isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
