import java.util.Scanner;

public class App {

    String username="";
    String password="";
    int age = 0;
    int height = 0;
    int menu = 0;

    Scanner scan = new Scanner(System.in);
    public App(){
        do{
            System.out.println("Ideal Body Weight Calculation");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose : ");
            try{
                menu = scan.nextInt(); scan.nextLine();
            }catch(Exception e){scan.nextLine();};

            switch(menu){
                case 1:
                    login();
                break;
    
                case 2:
                    System.exit(0);
                break;
            }
        }while(true);

    }

    public void login(){
        username();
        password();
        System.out.println("Welcome, "+username);
        calculation();
    }

    public void username(){
        System.out.print("Input Username [5..30]: ");
        usernameValidation(scan.nextLine());
    }
    
    public void password(){
        System.out.print("Input Password [Cancel] for cancel : ");
        passwordValidation(scan.nextLine());
    }

    public void usernameValidation(String username){
        if(username.length()<5||username.length()>30){
            username();
        }else{
            this.username = username;
        }
    }

    public void passwordValidation(String password){
        if(!password.equals(this.username)){
            System.out.println("Invalid Username & Password!");
            password();
        }else{
            this.password = password;
        }
    }

    public void calculation(){  
        System.out.print("Input your age [1..60] years old : ");
        age = scan.nextInt(); scan.nextLine();
        if(age<=10){
            calculationFormula(age,height);
        }else{
            System.out.print("Input your height [150..300] cm : ");
            height = scan.nextInt(); scan.nextLine();
            calculationFormula(age,height);
        }
    }

    public void calculationFormula(int age, int height){
        double weight = 0;
        if(age<=10){
            weight = (age*2)+8;
        }else{
            weight = (height-100)*0.9;
        }
        System.out.println("Your ideal Weight is : "+weight+"Kg");
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
