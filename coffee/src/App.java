import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        ArrayList<String> namaKopiArr = new ArrayList<>();
        ArrayList<String> tipeKopiArr = new ArrayList<>();
        ArrayList<String> tambahGulaArr = new ArrayList<>();
        ArrayList<Integer> qtyArr = new ArrayList<>();
        ArrayList<Integer> priceArr = new ArrayList<>();
        ArrayList<Double> totalPriceArr = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("input nama kopi");
            String namaKopi = scan.nextLine();
    
            System.out.print("input tipe kopi [C|A|L] : ");
            String tipeKopi = scan.nextLine();
    
            int quality=0;
            if(tipeKopi.equals("C")) quality=1;else
            if(tipeKopi.equals("A")) quality=2;else 
            if(tipeKopi.equals("L"))quality=3;
    
            int price = (quality*namaKopi.length())*100;
    
            System.out.print("tambah gula [Y/N]");
            String gula = scan.nextLine();
            

            if(gula.equals("Y")){
                price = (price*10)/100;
            }
    
            System.out.print("input qty ");
            int qty = scan.nextInt(); scan.nextLine();

            double totalPrice = price*qty;

            namaKopiArr.add(namaKopi);
            tipeKopiArr.add(tipeKopi);
            tambahGulaArr.add(gula);
            qtyArr.add(qty);
            priceArr.add(price);
            totalPriceArr.add(totalPrice);
        }

        for (int i = 0; i < namaKopiArr.size(); i++) {
            System.out.println(namaKopiArr.get(i));
            System.out.println(tipeKopiArr.get(i));
            System.out.println(tambahGulaArr.get(i));
            System.out.println(qtyArr.get(i));
            System.out.println(priceArr.get(i));
            System.out.println(totalPriceArr.get(i));
        }






    }
}
