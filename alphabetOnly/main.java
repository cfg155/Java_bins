package alphabetOnly;

import java.util.Scanner;

class main {
    boolean check = false;
    String name="";

    boolean isAlphabet(int asciiVal){
        if(asciiVal < 65 || asciiVal > 90) return false; else return true;
    }

    void isChecking(char [] name){
        int[] tmp = new int[name.length];
        for(int i=0;i<name.length;i++) tmp[i] = (int) name[i];

        for(int i=0;i<name.length;i++){
            if(isAlphabet(tmp[i])) check = true;
            else
            {
                System.out.println("Please Type in Alphabet");
                check = false;
                break;
            }
        }
    }

    public main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            do{
                System.out.print("Input Name : ");
                name = scan.nextLine(); 
                String tmpName = name;
                isChecking(tmpName.toUpperCase().toCharArray());
            }while(!check);
    
            if(check){ 
                System.out.println(name+" is Correct");
            }
        }
    }

    public static void main(String[]args){
        new main();
    }
}