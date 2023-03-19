package class01;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 3)
    public void Atest(){
        System.out.println("i am TestA");
    }


    @Test(priority = 1)
    public void Btest(){
        System.out.println("i am TestB");
    }


    @Test(priority = 2)
    public void Ctest(){
        System.out.println("i am TestC");
    }

}
