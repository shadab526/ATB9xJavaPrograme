package OOPs.Class_and_Object.Student;

public class runnerClass {
    public static void main(String[] args) {
        StudentATB s1 = new StudentATB();
        s1.address = "Kurla West";
        System.out.println(s1.address);

        StudentATB s2 = new StudentATB();
      int result =   s2.sum(4,7);
        System.out.println(result);
    }
}
