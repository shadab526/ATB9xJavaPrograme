package Task.ex_17_10_24;
import java.util.*;
public class Lab008_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int num = sc.nextInt();
        char grade = 'F';
        if(num>=90 && num<=100){
           grade = 'A';
        }
        else if (num>=80 && num<=89){
            grade = 'B';
        }
        else if(num>=70 && num<=79){
            grade = 'C';
        }
        else if(num>=60 && num<=69){
            grade = 'D';
        }
        else if (num>=0 && num <=59){
            grade = 'F';
        }
        else{
            System.out.println("Number should be in between 0 to 100");
            grade = 0;
        }
        System.out.println(grade);

    }
}
