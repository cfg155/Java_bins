import java.util.*;
public class App {
    public static void main(String[]args){ 
        Scanner scan = new Scanner(System.in);
        ArrayList<String>kode=new ArrayList<>();
        ArrayList<String>password=new ArrayList<>();

        kode.add("AA11");
        password.add("123456");

        kode.add("KEN11");
        password.add("jajajaja");

        // View 
        for(int i=0;i<kode.size();i++){
            System.out.println(kode.get(i));
            System.out.println(password.get(i));
        }

        System.out.print("Mau kode apa cuy ?");
        String iniBang = scan.nextLine();

        for(int i=0;i<kode.size();i++){
            if(iniBang.equals(kode.get(i))){
                System.out.print("mau jadi apa kodenya ?");
                kode.set(i, scan.nextLine());

                System.out.print("mau jadi apa passwordnya ?");
                password.set(i, scan.nextLine());
            }
        }

        for(int i=0;i<kode.size();i++){
            System.out.println(kode.get(i));
            System.out.println(password.get(i));
        }

        scan.close();
    }
}
