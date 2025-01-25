package Nov_2024.ex_08_11_24_Polymorphism.OverRiding;

public class Lab040 {
    public static void main(String[] args) {
        son s = new son();
        s.bhk();

    }
}

    class father{
        void bhk(){
            System.out.println("2BHK");
        }
    }

    class son extends father{
        @Override
        void bhk(){
            System.out.println("3BHK");
        }
    }

