package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab006_C_p6 {
    public static void main(String[] args) {
        mobile mo = new mobile("mi","x21",7000);
        System.out.println(mo.company);
        System.out.println(mo.model);
        System.out.println(mo.price);



    }

}
    class mobile{
    String model;
    int price;
    String company;

        mobile(String mon_company, String mob_model, int mob_price){
        this.company = mon_company;
        this.model = mob_model;
        this.price = mob_price;
        }
    }
