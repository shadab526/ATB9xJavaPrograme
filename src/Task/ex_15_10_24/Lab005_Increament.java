package Task.ex_15_10_24;

public class Lab005_Increament {
    public static void main(String[] args) {
        int a = 10;
        //                 11 + 11+1 + 12 +1 = 34
        System.out.println(++a + a++ + a++);
        //               a=13
        System.out.println(a);
    }
}
