package Functions.withoutParameter_withReturnType_2;

import java.util.Scanner;

public class Lab005_Type2 {
    public static void main(String[] args) {
        int childAge = ageOfChild();
        System.out.println(childAge);
        if(childAge<3){
            System.out.println("Child is not applicable for admission");
        } else if (childAge>=3 && childAge<=4) {
            System.out.println("Child is eligible for KG");

        }
        else {
            System.out.println("child is over age");
        }


    }
    public static int ageOfChild(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the child age");
        int age = sc.nextInt();
        System.out.println("Children age");
        return age;
    }
}
