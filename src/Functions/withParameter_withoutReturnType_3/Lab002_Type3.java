package Functions.withParameter_withoutReturnType_3;

public class Lab002_Type3 {
    public static void main(String[] args) {
        password("admin123");
        student("Zohan",4);

    }
    static void password(String pwd){
        System.out.println("Password is: "+pwd);
    }
    static void student(String name, int age){
        System.out.println("Student name is: "+name +"\nStudent age is: "+age);
    }
}
