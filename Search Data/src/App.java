import java.util.*;

public class App {
    int totalArr;
    ArrayList<String> arrName = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public App(){
        arrName.add("Vincent");
        arrName.add("Kenth");
        arrName.add("Ipen");

        System.out.println("Masukan Nama");
        String find = sc.nextLine();

        totalArr = arrName.size();
        data(totalArr,find);
    }

    public void data(int totalArr,String find){
        int isEmpty = 0;
        for(int i=0;i<totalArr;i++){
            if(arrName.get(i).contains(find)){
                System.out.println(arrName.get(i));
            }else{
                isEmpty++;
            }
        }

        if(isEmpty == arrName.size()){
            System.out.println("No Data Found");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
