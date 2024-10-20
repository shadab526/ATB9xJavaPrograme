package Task.ex_18_10_24;
import java.util.Scanner;
public class Lab009_simpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 - Add\n 2 - Subtraction\n 3 - Multiply\n 4 - Divide\n 5 - Modulus");
        System.out.println("Choose the operator: ");
        int operator = sc.nextInt();
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int result = 0;
        switch(operator){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Entered operator is invalid");
        }
        System.out.println("Result is: "+result);

    }

}
