package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab001_Constructors {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car tata = new Car();
        tata.name = "nano";
        tata.model = "mini";
        tata.year = 2012;
        System.out.println(tata.name);
        System.out.println(tata.model);
        System.out.println(tata.year);
    }
}
