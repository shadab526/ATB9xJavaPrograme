package InterviewCodingQue;
import java.util.Scanner;
public class Que003_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");

        int year = sc.nextInt();
        if (year %4 ==0){
            System.out.println(year +" Year is leap year");
        }
        else{
            System.out.println(year +" Year is not leap year");
        }
}
}
