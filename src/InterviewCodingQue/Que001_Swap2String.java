package InterviewCodingQue;

public class Que001_Swap2String {
    public static void main(String[] args) {
        String s1 = "Shadab";
        String s2 = "Shaikh";
//        String s3 = "";
//        s3 =s1;
//        s1=s2;
//        s2=s3;
//        System.out.println(s1);
//        System.out.println(s2);

        String s = s1+s2;
        s2=s.substring(s1.length());
        s1 = s.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);

    }
}
