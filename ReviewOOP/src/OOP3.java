public class OOP3 {
    public OOP3(){
        anjing x = new anjing();

        x.setNamaAnjing("coco");
        x.setras("corgi");
        x.setumur(1);
        
        System.out.println(x.getNamaAnjing());
        System.out.println(x.getras());
        System.out.println(x.getumur());
    }

    public static void main(String[]args){
        new OOP3();
    }
}
