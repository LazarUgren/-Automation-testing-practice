package Video29_TestNG;

import org.testng.annotations.*;
/*
Napraviti 3 test metode, u svakoj test metodi ubaciti po jedan TIP testiranja (iz prve nedelje - teorija),
u BeforClass napisati vase ime i prezime, u BeforeMethod upisati "ITBootcamp".
u AfterMethod napisati koja je nedelja kursa, u AfterClass napisati "Kraj"
 */
public class TestNgVeba1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Lazar Ugrnovic");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("ITBootcamp");
    }

    @Test(priority = 10)
    public void test0(){
        System.out.println("Performance test");
    }
    @Test(priority = 20)
    public void test1(){
        System.out.println("Prva nedelja - teorija");
    }
    @Test(priority = 30)
    public void test2(){
        System.out.println("Druga nedelja - java");
    }
    @Test(priority = 40)
    public void test3(){
        System.out.println("Treca nedelja - selenijum");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Ne znam koja je nedelja kursa, ali neka bude 6-ta, cito nagadjam.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Kraj");
    }

}
