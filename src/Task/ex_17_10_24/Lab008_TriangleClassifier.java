package Task.ex_17_10_24;
import java.util.*;
public class Lab008_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 value:");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2 value:");
        int side2 = sc.nextInt();
        System.out.println("Enter side 3 value:");
        int side3 = sc.nextInt();
        if (side1==side2 && side2==side3){
            System.out.println("Triangle is Equilateral");
        } else if (side1==side2) {
            System.out.println("Triangle is Isosceles");
        }
        else if (side1==side3) {
            System.out.println("Triangle is Isosceles");
        }
        else if (side2==side3) {
            System.out.println("Triangle is Isosceles");
        }
        else{
            System.out.println("Triangle is Scalene");
        }

    }
}
