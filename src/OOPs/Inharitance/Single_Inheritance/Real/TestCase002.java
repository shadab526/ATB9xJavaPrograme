package OOPs.Inharitance.Single_Inheritance.Real;

public class TestCase002 extends Common_BaseTest{
    TestCase002(){
        System.out.println("DC of Child");
    }
    void test(){
        Start_Browser();
        Read_Excel();
        Close_Browser();

    }
}
