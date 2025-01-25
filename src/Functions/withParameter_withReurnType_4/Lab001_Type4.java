package Functions.withParameter_withReurnType_4;

public class Lab001_Type4 {
    public static void main(String[] args) {
      //  int result = add(3,5);
        int result = add(4,7);
        System.out.println(result);
        float r = add(3.4f,5.3f);
        System.out.println(r);


    }
    static int add(int a, int b){
        return a+b;
    }
    static float add(float a, float b){
        return a+b;
    }
}
