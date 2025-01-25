package Task.ex_23_10_24_Function;
import java.util.*;
public class Lab033_Function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b = sc.nextInt();
        //sum of 2 number
        int result_of_sum = sum_of_number(a,b);
        System.out.println("Sum of number is :"+ result_of_sum);

        // sub of 2 number
        int result_of_sub = sub_of_number(a,b);
        System.out.println("Sub of number is :"+ result_of_sub);
        // mul of 2 number
        int result_mul = mul_of_number(a,b);
        System.out.println("Mul of number is :" + result_mul);

        // Div of 2 number
        int result_div = div_of_number(a,b);
        System.out.println("Div of number is :" + result_div);

    }
    // sum of 2 number.
    static int sum_of_number(int a, int b){
        return a+b;
    }

    //sub of 2 number
    static int sub_of_number(int a, int b){
        return a-b;
    }
    // mul of 2 number
    static int mul_of_number(int a, int b){
        return a*b;
    }
    // divide of 2 number
    static int div_of_number(int a , int b){
        return a/b;
    }


}
