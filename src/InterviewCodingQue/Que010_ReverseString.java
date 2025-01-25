package InterviewCodingQue;

public class Que010_ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shadab");
        sb.reverse();
        System.out.println(sb);
        String name = "shaikh";
        String rev = "";
        for(int i = name.length()-1; i>=0; i--){
            char c= name.charAt(i);
            rev = rev + c;
        }

    }
}
