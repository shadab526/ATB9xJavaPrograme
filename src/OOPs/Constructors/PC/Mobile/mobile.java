package OOPs.Constructors.PC.Mobile;

public class mobile {
    String model;
    int year;
    String brand;


    mobile(){
        brand="VIVO";
        model= "VivoS1";
        year = 2022;
        System.out.println("DC");

    }



    mobile(String Brand_Name,String Model_Name, int Year){
        this.model = Model_Name;
        this.brand = Brand_Name;
        this.year = Year;
        System.out.println("PC");
    }
}
