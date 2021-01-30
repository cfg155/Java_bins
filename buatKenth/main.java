package buatKenth;

import java.util.ArrayList;
import java.util.Scanner;

class main {    
    Scanner scan = new Scanner(System.in);
    ArrayList<String> nameArr = new ArrayList<>();
    ArrayList<String> roleArr = new ArrayList<>();

    public int[] totalData(String role) {
        int [] currArr = new int[roleArr.size()];

        for(int i=0;i<roleArr.size();i++){
            if(roleArr.get(i).equals("manager")){
                currArr[i] = i;
            }
        }    
        return currArr;
    }

    public int generateSalary(String role,int[] arr){
        int salary=0;
        if(role.equals("manager")){
            if(arr.length > 3){
                salary = 3000;
                
            }else{
                salary = 2000;
            }
        }

        if(role.equals("admin")){
            if(arr.length > 3){
                salary = 1500;
            }else{
                salary = 1000;
            }
        }
        return salary;
    }

    public main(){

        while(true){
            System.out.println("1. Add new emp");
            System.out.println("2. view all emp");
            int pick = scan.nextInt();scan.nextLine();

            switch(pick){
                case 1:
                    System.out.print("input name : ");
                    nameArr.add(scan.nextLine());

                    System.out.print("input role : ");
                    roleArr.add(scan.nextLine());
                break;

                case 2:
                    System.out.printf("%-10s | %-10s | %-10s |\n","Name","Role","Salary");
                    for(int i=0;i<nameArr.size();i++){
                        System.out.printf("%-10s | %-10s | %-10d |\n",nameArr.get(i),roleArr.get(i),generateSalary(roleArr.get(i),totalData(roleArr.get(i))));   
                    }
                break;
            }
        }
    }

    public static void main(String[]args){
        new main();
    }
}