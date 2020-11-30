import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> nama = new ArrayList<>();

    public void addData(){
        System.out.println("Masukan Nama");
        String name = scan.nextLine();
        nama.add(name);
    }

    public void getData(){
        if(nama.isEmpty()){
            System.out.println("data kosong");
        }else{
            for(int i=0;i<nama.size();i++){
                System.out.println("Nama "+nama.get(i));
            }
        }
    }

    int apus=0;
    public void removeData(){
        System.out.println("apus data ke brpa");
            apus = scan.nextInt();scan.nextLine();
        try{
            nama.remove(apus-1);
        }catch(Exception e){
            System.out.println("gk ada datanya");
            scan.nextLine();
        }
    }

    public App(){
        do{
            System.out.println("1.Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. apus data");
            int pilihan = scan.nextInt(); scan.nextLine();

            switch(pilihan){
                case 1:
                    addData();
                break;

                case 2:
                    getData();
                break;

                case 3:
                    removeData();
                break;
            }
        }while(true);
    }

    public static void main(String[] args) { //gate
        new App();
    }
}
