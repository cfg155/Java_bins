import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        boolean hasUpperCase = false;
        boolean hasNumber = false;
        do{
            hasUpperCase = false;
            hasNumber = false;

            System.out.print("Input Username (contain uppercase & contain number) : ");
            String username = scan.nextLine();
            
            // check huruf besar dalam string
            for(int i=0;i<username.length();i++){
                if(username.charAt(i) == username.toUpperCase().charAt(i)) hasUpperCase = true;
            }



            //check ada angka di string
            for(int i=0;i<username.length();i++){
                for(int j=0;j<9;j++){
                    char temp = Character.forDigit(j, 10);
                    if(username.charAt(i) == temp) hasNumber = true;
                }
            }

            System.out.println(hasUpperCase+" "+hasNumber);
        }while(!hasUpperCase||!hasNumber);


    }
}
