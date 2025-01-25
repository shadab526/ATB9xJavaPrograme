package Nov_2024.ex_08_11_24_Polymorphism.OverLoading;

public class Lab0039 {
    public static void main(String[] args) {
        mathOperations m = new mathOperations();
        int r = m.add(4,6);
        System.out.println(r);

        float r1 =m.add(3.4f,4.5f );
        System.out.println(r1);

    }
}

class mathOperations{
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

}