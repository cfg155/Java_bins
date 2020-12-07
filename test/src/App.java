import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        do{


        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean numberCheck = false;
        boolean specialCheck = false;

        Scanner scan = new Scanner(System.in);
        String Vpass = scan.nextLine();

        String specialCharacter = "~!@#$%^&*()_+-=,./<>?|:;'";
        char [] storedSC = specialCharacter.toCharArray();

        for(int i = 0; i < Vpass.length();i++){
            if(Character.isUpperCase(Vpass.charAt(i))){
                upperCheck = true;
            }
            if(Character.isLowerCase(Vpass.charAt(i))){
                lowerCheck = true;
            }
            if(Character.isDigit(Vpass.charAt(i))){
                numberCheck = true;
            }

            for(int j=0;j<storedSC.length;j++){
                if(Vpass.charAt(i) == storedSC[j]){
                    specialCheck = true;
                }
            }
        }

        if(upperCheck == false){
            System.out.println("upper"+upperCheck);
        }else if(lowerCheck == false) {
            System.out.println("lower"+lowerCheck);
        }else if(numberCheck == false){
            System.out.println("number"+numberCheck);
        }else if(specialCheck == false){
            System.out.println("special"+specialCheck);
        }

    }while(true);
    }
}
