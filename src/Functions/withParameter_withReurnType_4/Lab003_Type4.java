package Functions.withParameter_withReurnType_4;

public class Lab003_Type4 {
    public static void main(String[] args) {
        String name = input("shadab");
        System.out.println(name);
        int pinCode = input(400070);
        System.out.println(pinCode);


    }
    public static String input(String firstName){
        return firstName;

    }
    public static int input(int code){
        return code;
    }
}
