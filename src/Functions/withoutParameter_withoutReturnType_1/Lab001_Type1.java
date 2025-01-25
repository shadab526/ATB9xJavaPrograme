package Functions.withoutParameter_withoutReturnType_1;

public class Lab001_Type1 {
    public static void main(String[] args) {
        greet();


        for (int i = 0; i<=10; i++){
            greet();
        }
    }


    static void greet(){
        System.out.println("Hello good morning");
    }
}
