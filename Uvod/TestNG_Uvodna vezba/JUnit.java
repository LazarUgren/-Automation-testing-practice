package Video30_TestNg_POM;

import org.junit.*;
import org.junit.jupiter.api.Order;

/*
TestNg: BeforeClass, BeforeMethod, Test, AfterMethod, AfterClass
JUnit: BeforeClass, Before,        Test, After,      AfterClass
Selenijum je okruzenje, a testNG i JUnit su biblioteke koje nam pruzaju odredjene metode sa kojima
mozemo da radimo.
 */

public class JUnit {

    @BeforeClass
    public static void  beforeClass(){
        System.out.println("____________________");
        System.out.println("OVO JE PRE KLASE");
        System.out.println("___________________");
    }

    @Before
    public void before(){
        System.out.println("!!!!!!!!!!!!! Ovo je PRE svake metode !!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test1(){
        System.out.println("Test, Test, JEDINICA, JEDINICA  :D");
    }

    @Test
    public void test2(){
        System.out.println("Test, test, DVOJCICA, DEVOJCICA :D ");
    }

    @Test
    public void test3(){
        System.out.println("TEST, TEST, TROJCICA, trojcica :D ");
    }

    @After
    public void after(){
        System.out.println("!!!!!!!!!!!!! Ovo je POSLE svake metode !!!!!!!!!!!!!!!!!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("__________________");
        System.out.println("OVO JE POSLE KLASE");
        System.out.println("____________________");
    }


}
