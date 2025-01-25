package OOPs.Inharitance.Single_Inheritance.Example2;

public class Python extends Programming{
    void print (){
        System.out.println(version);
        System.out.println(author);
    }

    public static void main(String[] args) {
        Python p = new Python();
        System.out.println(p.author);
        System.out.println(p.version);
    }
}
