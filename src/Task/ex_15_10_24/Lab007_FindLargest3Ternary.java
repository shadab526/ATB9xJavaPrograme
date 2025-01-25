package Task.ex_15_10_24;

public class Lab007_FindLargest3Ternary {
    public static void main(String[] args) {
        int a =  30; int b = 23; int c = 45;
        int max = (a>b && a>c)? a: (b>c) ? b :c;
        System.out.println(max);

    }
}
