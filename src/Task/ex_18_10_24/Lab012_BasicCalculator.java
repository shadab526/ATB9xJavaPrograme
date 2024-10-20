package Task.ex_18_10_24;
import java.util.Scanner;
public class Lab012_BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the case no");
        int calculator = sc.nextInt();
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int result =0;
        switch (calculator){
            case 1:
                result= n1+n2;
                break;

        }
        System.out.println(result);




    }
}
