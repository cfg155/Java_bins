public class OOP2 {
    public class classLain{
        String nama;

        public classLain(String Nama){
            this.nama = Nama;
        }
    }

    public OOP2(){
        classLain x = new classLain("Nama saya enric");
        System.out.println(x.nama);
    }

    public static void main(String[]args){
        new OOP2();
    }
}
