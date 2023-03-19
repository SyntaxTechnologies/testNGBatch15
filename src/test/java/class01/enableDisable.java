package class01;

import org.testng.annotations.Test;

public class enableDisable {

    @Test(enabled = false)
    public  void Atest(){
        System.out.println("i am first test case");
    }

    @Test
    public  void Btest(){
        System.out.println( "i am the second test case");
    }


    @Test(enabled = false)
    public  void Ctest(){
        System.out.println( "i am the third test case");
    }

}
