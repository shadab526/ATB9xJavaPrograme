package InterviewCodingQue;
import java.util.*;
public class Que004_Vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        s=s.toLowerCase();
        int vol =0;
        int con = 0;
        for (int i = 0; i<s.length(); i ++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vol++;
            }
            else{
                con++;
            }
        }

        System.out.println(vol);
        System.out.println(con);
    }
}
