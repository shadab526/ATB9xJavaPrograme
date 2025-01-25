package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab003_Constructor_p3 {
    public static void main(String[] args) {
        atb9x at = new atb9x("Java", 2012);
        System.out.println(at.course);
        System.out.println(at.year);
    }

}



    class atb9x{
        String course;
        int year;

        atb9x(String course_name, int year_recorded){
            this.course=course_name;
            this.year=year_recorded;
            System.out.println("PC1");

        }


}
