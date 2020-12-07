public class OOP1 {
    public class classLain{
        String nama = "Nama saya Enric";

        void blabla(){
            System.out.println("lalala");
        }
    }

    public OOP1(){
        classLain x = new classLain();
        System.out.println(x.nama);
        x.blabla();
    }

    public static void main(String[] args){
        new OOP1();
    }
}
