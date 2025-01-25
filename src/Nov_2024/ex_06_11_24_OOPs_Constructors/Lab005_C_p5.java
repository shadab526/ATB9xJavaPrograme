package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab005_C_p5 {
    public static void main(String[] args) {
        student s = new student("shadab", 45);
        System.out.println(s.name);
        System.out.println(s.roll_no);

    }
}
    class student{
        String name;
        int roll_no;


        student(String std_name,int std_roll_no){
            this.name= std_name;
            this.roll_no= std_roll_no;

        }
}
