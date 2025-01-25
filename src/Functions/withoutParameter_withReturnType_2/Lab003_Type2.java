package Functions.withoutParameter_withReturnType_2;

public class Lab003_Type2 {
    public static void main(String[] args) {
        int car_drive = age_for_drive();
        System.out.println(car_drive);
        if (age_for_drive()>=18){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You can not drive");
        }

    }
    static int age_for_drive(){
        System.out.println("Driving age!");
        return 30;
    }
}
