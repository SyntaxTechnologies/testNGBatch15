package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {

    @BeforeMethod
    public  void beforeMethods(){
        System.out.println("i am before Method");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("i am after method");
    }

    @Test(groups = "regression")
    public void aFirstTestCase(){
        System.out.println("i am the first test case");
    }

    @Test
    public  void bSecondTestcase(){
        System.out.println("i am the second test case");
    }

    @Test
    public  void cThirdTestcase(){
        System.out.println("i am thirdTest case");
    }
}


//11:52