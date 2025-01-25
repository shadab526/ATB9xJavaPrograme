package OOPs.Inharitance.Multilevel_Inheritance.EX1;

public class Son extends Father{
    public Son(){
        System.out.println("DC - Son");
    }
    void tc003 (){
        Father f = new Father();
        f.home();
        f.tc002();
    }
    void home (){
        System.out.println("Son 3BHK");
    }
}
