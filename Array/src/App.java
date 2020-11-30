import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args){













        // //Array Statis
        // // String[] x = {"a","b","c","d"};
        // // System.out.println(x[2]);

        // int[] angka = new int[5];
        // angka[0] = 1;
        // angka[0] = 2;
        // System.out.println(angka[0]);
        // System.out.println(angka.length);


        // input nama
        // input umur

            //menu 
            //1. masukan data
            //2. tampilkan data
            //3. apus data
                //data mana yang mau di apus
            //4. edit data
                //data mana yang mau di edit

        // // Array Dinamis
        // ArrayList<String> y = new ArrayList<>();
        // Vector<String> z = new Vector<>();
        // // List<String> a = new ArrayList<>();

        // //add(); menambahkan data
        // y.add("louis");

        // //size() jumlah data 
        // System.out.println(y.size()); 
        // //set()
        // y.set(0, "Tuti");
        
        // //remove() apus value array
        // y.remove(0);




        Scanner scan = new Scanner(System.in);

        //Dinamis 
        // boolean exit = false;
        ArrayList<String> menuArr = new ArrayList<>();
        
        menuArr.add("abc");
    
        // do{
        //     System.out.println("Tambah Menu [0]: ");
        //     String menuDinamis = scan.nextLine();
    
        //     if(menuDinamis.equals("0")){
        //         exit = true;
        //     }else{
        //         menuArr.add(menuDinamis);
        //     }
        // }while(!exit);

        for(int i=0;i<menuArr.size();i++){
            System.out.println(menuArr.get(i));
        }

        //Statis
        // boolean keluar = false;
        // String[] menuStat = new String[10];
        // int count=0;
        // do{
        //     System.out.println("Tambah Menu [0]: ");
        //     String menuStatis = scan.nextLine();
    
        //     if(menuStatis.equals("0")){
        //         keluar = true;
        //     }else{
        //         menuStat[count] = menuStatis;
        //         count++;
        //     }
        // }while(!keluar);

        // for(int i=0;i<menuStat.length;i++){
        //     System.out.println(menuStat[i]);
        // }
    }
}
