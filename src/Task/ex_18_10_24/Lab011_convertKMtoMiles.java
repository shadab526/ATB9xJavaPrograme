package Task.ex_18_10_24;
import java.util.Scanner;
public class Lab011_convertKMtoMiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for converting KM to Miles \nEnter 2 is for converting celsius and fahrenheit");
        System.out.println("Choose the input");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter KM");
                double km = sc.nextDouble();
                double miles = (km * 0.621371);
                System.out.printf("%.2f KM = %.2f Miles", km,miles);
                break;
            case 2:
                System.out.println("Enter Celsius");
                double cel = sc.nextDouble();
                double fah = (cel * 0.621371);
                System.out.printf("%.2f cel = %.2f fah", cel,fah);
                break;
            default:
                System.out.println("Entered choice is invalid");

        }

    }
}
