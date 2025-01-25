package Nov_2024.ex_07_Nov_24_OOPs_Inheritance.singleinheritance.Example2;

public class Python extends programming{
    void print(){
       System.out.println(author);
       System.out.println(version);
        }

        Python(){
            System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p = new Python();
        System.out.println(p.version);
        System.out.println(p.author);
    }
}
