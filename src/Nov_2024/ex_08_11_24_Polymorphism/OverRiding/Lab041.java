package Nov_2024.ex_08_11_24_Polymorphism.OverRiding;

public class Lab041 {
    public static void main(String[] args) {
        honda h = new honda();
        h.activa();

    }
}
class bike{
    void activa(){
        System.out.println("Honda Activa 3G");
    }
}
class honda extends bike{
    @Override
    void activa(){
        System.out.println("Honda Activa 5G");
    }
        }