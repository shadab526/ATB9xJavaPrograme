package InterviewCodingQue;
import java.util.Scanner;
public class Que002_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int count =0;
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(n + " Number is prime number");
        }
        else {
            System.out.println(n + " Number is not prime number");
        }

    }
}
