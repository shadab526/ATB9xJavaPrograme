package OOPs.Constructors.DC;

public class ConstructorsTesla {
    public static void main(String[] args) {
        // Using default constructor.
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);
        System.out.println("-----------------------------------");

        Car nano = new Car();
        nano.name ="Tata Nano";
        nano.model = "XUV";
        nano.year = 2002;
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
