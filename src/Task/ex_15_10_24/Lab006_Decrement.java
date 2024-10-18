package Task.ex_15_10_24;

public class Lab006_Decrement {
    public static void main(String[] args) {
        int a = 20;
        //                 19 + 19+1 + 20 - 1 = 58
       System.out.println(--a + a++ + a--);
    }
}
