package PT_MENTOL;

import java.util.ArrayList;
import java.util.Scanner;

public class main{
    class identity{
        private String Name;
        private String Role;
        private int Salary;

        public identity(String name,String role,int salary){
            this.Name = name;
            this.Role = role;
            this.Salary = salary;
        }

        public String setName(String name){
            return this.Name = name;
        }

        public String getName(){
            return this.Name;
        }

        public String setRole(String role){
            return this.Role = role;
        }

        public String getRole(){
            return this.Role;
        }

        public int setSalary(int salary){
            return this.Salary = salary;
        }

        public int getSalary(){
            return this.Salary;
        }
        
    }

    ArrayList<identity> emp = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public main(){
        do{
            System.out.println("Employee Data");
            System.out.println("1. Add New Employee");
            System.out.println("2. View Employee");
            System.out.print("> ");
            int choose = scan.nextInt();scan.nextLine();

            // biar gampang rolenya ada 3 : x,y,z

            switch(choose){
                case 1:
                // input nama
                    System.out.print("Input Nama : ");
                    String name = scan.nextLine();

                // input roles
                    System.out.println("Input Roles");
                    String role = scan.nextLine();

                // generate salary & bonus
                    // posisi X gajinya 1k
                    // posisi y gajinya 2k
                    // posisi z gajinya 3k
                    int salary = 0;
                    if(role.equals("x")) salary = 1000;
                    else if(role.equals("y")) salary = 2000; 
                    else if(role.equals("z")) salary = 3000; 

                    emp.add(new identity(name, role, salary));
                break;

                case 2:
                    int x=0,y=0,z=0;
                    for(int i=0;i<emp.size();i++){
                        if(emp.get(i).getRole().equals("x")) x++;
                        else if(emp.get(i).getRole().equals("y")) y++;
                        else if(emp.get(i).getRole().equals("z")) z++;
                    }

                    System.out.println(x);
                    System.out.println(y);
                    System.out.println(z);

                    int[] tmp = {x,y,z};
                    boolean xBonus=false;
                    boolean yBonus=false;
                    boolean zBonus=false;
                    for(int i=0;i<tmp.length;i++){
                        if((tmp[i]==4&&tmp[i]<7)||(tmp[i]==7)){
                            if(i==0) xBonus = true;
                            else if(i==1) yBonus = true;
                            else if(i==2) zBonus = true;
                        }
                    }

                    for (int i = 0; i < emp.size(); i++) {
                        System.out.println("Name : "+emp.get(i).getName());
                        System.out.println("Roles : "+emp.get(i).getRole());
                        System.out.println("Salary : "+emp.get(i).getSalary());
                        // fungsi bonus
                            if(emp.get(i).getRole().equals("x")&&xBonus) System.out.println("Bonus : 5%");
                            if(emp.get(i).getRole().equals("y")&&yBonus) System.out.println("Bonus : 7.5%");
                            if(emp.get(i).getRole().equals("z")&&zBonus) System.out.println("Bonus : 10%");
                        System.out.println("===============================");
                    }
                break;
            }
        }while(true);
    }

    public static void main(String[]args){
        new main();
    }
}