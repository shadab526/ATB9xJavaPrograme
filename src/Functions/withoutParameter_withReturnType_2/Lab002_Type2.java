package Functions.withoutParameter_withReturnType_2;

public class Lab002_Type2 {
    public static void main(String[] args) {
        int voting_age = age_of_vote();
        System.out.println(voting_age);
        if(age_of_vote()>=18){
            System.out.println("You are eligible for Vote");
        }
        else {
            System.out.println("You are not eligible for Vote");
        }

    }
    static int age_of_vote(){
        System.out.println("Voting age returned!");
        return 18;
    }
}
