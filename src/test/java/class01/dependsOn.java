package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void  Login(){
        System.out.println(6/0);
    }

    @Test(dependsOnMethods = {"Login"} )
    public  void DashBoardverification(){
        System.out.println("after login i am verifying dashboard");
    }
}
