package Task.ex_17_10_24;
import java.util.*;
public class Lab007_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int num = sc.nextInt();
        if(num>=90 && num<=100){
            System.out.println('A');
        }
        else if (num>=80 && num<=89){
            System.out.println('B');
        }
        else if(num>=70 && num<=79){
            System.out.println('C');
        }
        else if(num>=60 && num<=69){
            System.out.println('D');
        }
        else if (num>=0 && num <=59){
            System.out.println('F');
        }
        else{
            System.out.println("Number should be in between 0 to 100");
        }

    }
}
