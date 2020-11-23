import java.util.*;
public class App {
    public App(){
        //Static Array 
        String [] arrStatic = new String[10];

        // Cara Masukin value ke index static atau add data ke index static
        arrStatic[0] = "ABC";

        // Cara panggil array static
        System.out.println(arrStatic[0]);

        // cara panggil jumlah data dalam array static
        System.out.println(arrStatic.length);

        // cara set data dalam array static
        arrStatic[0] = "XYZ";

        //Dynamic Array
        ArrayList<String> arrDynamic = new ArrayList<>();

        // cara add value ke dynamic array
        arrDynamic.add("ABC");

        // cara panggil array dynamic
        System.out.println(arrDynamic.get(0));

        // cara panggil jumlah data dalam array dynamic
        System.out.println(arrDynamic.size());

        // cara set data dynamic
        arrDynamic.set(0, "XYZ");

        // cara remove data dynamic
        arrDynamic.remove(0);

    }
    public static void main(String[] args){
        new App();
        System.out.println("hello");
    }
}
