package Functions;

public class Fun_001 {
    public static void main(String[] args) {
        // 1.	Without Parameter and without Return Type.
        greed();
        //  2.	Without Parameter and with Return Type.
        String return_value = greed_with_hello();
        System.out.println(return_value);

        int voting_age = age_of_vote();
        if (voting_age >=18){
            System.out.println("You can vote");
        }
        else {
            System.out.println("You can not vote");
        }

    }
    // 1.	Without Parameter and without Return Type.
    static void greed(){
        System.out.println("Hi How are you");
    }

    // 2.	Without Parameter and with Return Type.
    static String greed_with_hello(){
        //Write the code
        System.out.println("Hi I am Shadab");
        return "Hi you are looking awesome";
    }

    static  int age_of_vote(){
        System.out.println("Vote age returned!");
        return 17;
    }
}
