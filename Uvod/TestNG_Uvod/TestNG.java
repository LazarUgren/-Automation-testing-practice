package Video29_TestNG;

import org.testng.annotations.*;

import java.sql.SQLOutput;

/*
-Ovo su najcesce anotacije koje cu da koristim.
-Na anotaciju ne ide ;
-PRE I POSLE KLASE IZVRSAVAJU SE SAMO JEDNOM
-ZA SVAKI IZVRSENI TEST IMAMO PRE I POSLE METODU KOJA SE IZVRSAVAVA
-TESTIRANJE SE NE MOZE POKRENUTI BEZ POSTOJANJA SEKCIJE TEST!!!
- U TEST NG MOZES DA DODAJES PRIORITETE ZA RAZLIKU OD J UNITA.
- PRIORITET SE ODNOSI SAMO NA TESTOVE I IDE OD NAJMANJEG KA NAJVECEG PRIORITETA.
-
-
 */
public class TestNG {

    @BeforeClass
    public void beforeClass(){
        System.out.println("*************");
        System.out.println("OVO JE PRE KLASE");
        System.out.println("*************");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("******** Ovo je PRE svake metode ********");
    }

    @Test(priority = 30)
    public void test1(){
        System.out.println("OVO JE TEST 1");
    }
    @Test(priority = 25)
    public void test(){
        System.out.println("OVO JE TEST DODAT TEST");
    }
    @Test(priority = 20)
    public void test2(){
        System.out.println("OVO JE TEST 2");
    }
    @Test(priority = 10)
    public void test3(){
        System.out.println("OVO JE TEST 3");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("********* Ovo je POSLE svake metode ************");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("************");
        System.out.println("OVO JE POSLE KLASE");
        System.out.println("*************");
    }

}
