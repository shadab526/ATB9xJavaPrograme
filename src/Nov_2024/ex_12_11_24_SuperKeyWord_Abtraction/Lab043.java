package Nov_2024.ex_12_11_24_SuperKeyWord_Abtraction;

public class Lab043 {
    public static void main(String[] args) {
        jio j = new jio();
        j.salt();
        j.store();

    }
}
class jio extends tata{

    @Override
    public void salt() {
        System.out.println("Nano");

    }
}
abstract class tata {
    abstract void salt();
    void store (){
        System.out.println("done by tata");
    }
}
