package OOPs.Inharitance.Multilevel_Inheritance.EX1;

public class Father extends GrandFather{
    public Father() {
        System.out.println("DC - Father");
    }
    void tc002 (){
        GrandFather gf = new GrandFather();
        gf.home();
        gf.openBrowser();
        gf.closeBrowser();
    }
    void home(){
        System.out.println("Father 2BHK");
    }
}
