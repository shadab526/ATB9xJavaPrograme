package InterviewCodingQue;

import java.util.LinkedHashSet;
import java.util.Set;

public class Que009_RemoveDuplicatesChar {
    public static void main(String[] args) {
        String str = "programing";
        // Using Java 8
        StringBuilder sb = new StringBuilder();
        //str.chars().distinct().forEach(c ->sb.append((char) c));
        str.chars().distinct().forEach(c->sb.append((char) c));

        System.out.println(sb);
        // Using indexOf(..)
        System.out.println("--------------------------------------------");
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int idx = str.indexOf(c, i+1);
            if(idx==-1){
                sb1.append(c);
            }
        }
        System.out.println(sb1);
        // Using Char Array
        System.out.println("------------------------------------------");
        char[] arr = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i<arr.length;i++){
            boolean repeated = false;
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    repeated= true;
                    break;
                }
            }
            if(!repeated){
                sb2.append(arr[i]);
            }
        }
        System.out.println(sb2);
        // Using Set interface
        System.out.println("-----------------");
        StringBuilder sb3 = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        for(Character c : set){
            sb3.append(c);
        }
        System.out.println(sb3  );
    }
}
