package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class annotationsBeforeClass {

    @BeforeClass
    public void heelo(){
        System.out.println("i am before class");
    }

    @Test
    public void testB(){
        System.out.println("i am TestB");
    }
}
