package Variable;

public class vari {

    public static void main(String[] args) {
        int local = 20;// This is Local Variable.

        System.out.println("Local Variable value is: "+local);
        vari v = new vari();
        int a = v.instance;
        System.out.println("Instance Variable value is: "+a);
        System.out.println("static Variable value is: "+vari.sta);

    }
    int instance = 30; // instance Variable
    static int sta = 40; // static Variable
}
