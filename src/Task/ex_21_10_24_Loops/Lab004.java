package Task.ex_21_10_24_Loops;
import java.util.Scanner;
public class Lab004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n;i++){
           sum = sum+i;
        }
        System.out.println("Sum of entered number is: "+sum);
    }
}
