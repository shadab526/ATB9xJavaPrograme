package OOPs.Constructors.PC.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        mobile m1 = new mobile("Samsung","GalaxiS1",2017);
        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.year);

        System.out.println("--------------------------------");

        mobile m2 = new mobile();
        System.out.println("Brand is: "+ m2.brand);
        System.out.println("Model is: "+m2.model);
        System.out.println("Year is: "+m2.year);

        System.out.println("--------------------------------");
        mobile m3 = new mobile("Oppo","OppA7",2020);
        System.out.println(m3.brand);
        System.out.println(m3.model);
        System.out.println(m3.year);
    }
}
