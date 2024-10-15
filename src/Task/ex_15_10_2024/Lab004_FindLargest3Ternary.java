package Task.ex_15_10_2024;

public class Lab004_FindLargest3Ternary {
    public static void main(String[] args) {
        int n =  30; int n1 = 23; int n2 = 25;
        int max = (n>n1 && n>n2)? n: (n1>n && n1>n2) ? n1 :n2;
        System.out.println(max);

    }
}
