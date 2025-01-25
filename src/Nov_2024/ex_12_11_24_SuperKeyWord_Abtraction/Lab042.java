package Nov_2024.ex_12_11_24_SuperKeyWord_Abtraction;

public class Lab042 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();

    }
}


    class Child extends Father {

        @Override
        public void loan50k() {
            System.out.println("Child is giving teh 50k loan");
        }
    }

    abstract class Father {
        abstract void loan50k();

        void loan25k() {
            System.out.println("done by father");
        }
    }

