package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab002_Constructor_p2 {
    public static void main(String[] args) {
        Car2 tata = new Car2("Nexa",2015);
        System.out.println(tata.model);
        System.out.println(tata.year);

        Car2 tata2 = new Car2("Nexa XUV",2018);
        System.out.println(tata2.model);
        System.out.println(tata2.year);
    }
}
