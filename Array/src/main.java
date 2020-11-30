package src;
import java.util.*;
public class main {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> namaArr = new ArrayList<>();
    ArrayList<String> umurArr = new ArrayList<>();

    String nama="";
    String umur="";

    // public void tambahData(){
    //     System.out.println("masukan Nama");
    //     nama = scan.nextLine();

    //     System.out.println("Masukan umur");
    //     umur = scan.nextLine();
    // }

    // public void panggilData(){
    //     if(namaArr.isEmpty()){
    //         System.out.println("gk ada data");
    //     }else{
    //         for (int i = 0; i < namaArr.size(); i++) {
    //             System.out.println("Nomor : "+(i+1));
    //             System.out.println("Nama : " + namaArr.get(i));
    //             System.out.println("Nama : " + umurArr.get(i));
    //         }
    //     }
    // }

    public main(){
        do{
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Apus Data");
            System.out.println("4. Ubah Data");

            int pilihan = scan.nextInt(); scan.nextLine();
            switch(pilihan){
                case 1:
                    System.out.println("masukan Nama");
                    nama = scan.nextLine();
            
                    System.out.println("Masukan umur");
                    umur = scan.nextLine();

                    namaArr.add(nama);
                    umurArr.add(umur);
                break;

                case 2:
                    if(namaArr.isEmpty()&&umurArr.isEmpty()){
                        System.out.println("gk ada data");
                    }else{
                        for (int i = 0; i < namaArr.size(); i++) {
                            System.out.println("Nomor : "+(i+1));
                            System.out.println("Nama : " + namaArr.get(i));
                            System.out.println("Umur : " + umurArr.get(i));
                        }
                    }
                break;

                case 3:
                    // isEmpty()
                    // size()
                    if(namaArr.isEmpty()){
                        System.out.println("gk ada data");
                    }else{
                        for (int i = 0; i < namaArr.size(); i++) {
                            System.out.println("Nomor : "+(i+1));
                            System.out.println("Nama : " + namaArr.get(i));
                            System.out.println("Umur : " + umurArr.get(i));
                        }

                        // add("anto") --> index 0
                        // add("jess") --> index 1
                        System.out.println("data mana yang mau di hapus");
                        int hapus = scan.nextInt();scan.nextLine();

                        namaArr.remove(hapus);
                        umurArr.remove(hapus);
                    }
                break;

                case 4:
                    if(namaArr.isEmpty()){
                        System.out.println("gk ada data");
                    }else{
                        for (int i = 0; i < namaArr.size(); i++) {
                            System.out.println("Nomor : "+(i+1));
                            System.out.println("Nama : " + namaArr.get(i));
                            System.out.println("Umur : " + umurArr.get(i));
                        }

                        System.out.println("data mana yang mau di edit");
                        int edit = scan.nextInt();scan.nextLine();
                        
                        System.out.println("masukan Nama");
                        nama = scan.nextLine();
                
                        System.out.println("Masukan umur");
                        umur = scan.nextLine();
    
                        namaArr.set(edit-1, nama);
                        umurArr.set(edit-1, umur);
                    }

                break;
            }

        }while(true);
    }

    public static void main(String[]args){
        new main();
    }
}
