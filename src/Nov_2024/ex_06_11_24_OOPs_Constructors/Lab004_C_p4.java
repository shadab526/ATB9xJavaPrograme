package Nov_2024.ex_06_11_24_OOPs_Constructors;

public class Lab004_C_p4 {
    public static void main(String[] args) {
        sweet s = new sweet("Barfi", 10);
        System.out.println(s.name);
        System.out.println(s.kg);

    }
}

    class sweet {
        String name;
        int kg;

        sweet(String name_sweet, int kg_avbl) {
            this.name = name_sweet;
            this.kg = kg_avbl;

        }
    }