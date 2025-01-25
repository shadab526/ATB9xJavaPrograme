package InterviewCodingQue;

public class Que006_Swap2Number {
    public static void main(String[] args) {
        int a = 3, b = 5;
        // 1. Using 3rd variable
//        int t;
//        t=a;
//        a=b;
//        b=t;
//        System.out.println("a " + a);
//        System.out.println("b " + b);
        // 2. without using 3rd variable.
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a " + a);
//        System.out.println("b " + b);

        System.out.println("--------------------------");

//        a = a*b; // 3 * 5 = 15
//        b = a/b; // 15 / 5 = 3
//        a = a/b; // 15 /3 = 15
//        System.out.println("a " + a);
//        System.out.println("b " + b);
        // using bitwise XOR
        a = a^b; // a XOR b
        b = a^b;
        a = a^b;

        System.out.println("a " + a);
        System.out.println("b " + b);


    }
}
