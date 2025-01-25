package Nov_2024.ex_20_11_24_List_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab050_List {
    public static void main(String[] args) {
        List<String> vages = new ArrayList<>();
        vages.add("Palak");
        vages.add("matar");
        vages.add("tomato");
        System.out.println(vages);

        List<String> dairy = new ArrayList<>();
        dairy.add("milk");
        dairy.add("paneer");
        dairy.add("butter");
        System.out.println(dairy);

        List all = new ArrayList();
        all.add(vages);
        all.add(dairy);
        System.out.println(all);

    }
}
