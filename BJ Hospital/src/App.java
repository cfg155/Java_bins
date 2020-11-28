import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<String>nam3 = new ArrayList<String>();   // 1  2
        ArrayList<String>genderr = new ArrayList<String>(); // 2 3
        ArrayList<String>r0omz = new ArrayList<String>(); // 2 3
        
         int pilih =0;
         String nama ="";
         String gender = "";
         String room = "";

         nam3.add("Mr Vincent");
		 genderr.add("Female");
		 r0omz.add("Normal");

		 nam3.add("Mr Kenth");
		 genderr.add("Male");
		 r0omz.add("VIP");
		 
		 do {
			   System.out.println("================");
			   System.out.println(" : BJ Hospital :");
			   System.out.println("================");
			   System.out.println("1. add patient");
			   System.out.println("2. view patient");
			   System.out.println("3. delete");
			   System.out.println("4. Search name");			   
			   System.out.println("choose >>");
			   pilih = scan.nextInt(); scan.nextLine();
			   
			   switch(pilih) {
			   case 1:
				   do {
					    System.out.println("Input patient name : [ Mr/Mrs ]");
					    nama = scan.nextLine();
				   }while (!nama.startsWith("Mr") && !nama.startsWith("Mrs"));
				   
				   nam3.add(nama);
				   
				   do {
					    System.out.println("Input your gender : [ Male / Female ]");
					    gender = scan.nextLine(); 
				   }while (!gender.equals("Male") && !gender.equals("Female"));
					  
				   genderr.add(gender);
				   
				   do {
					    System.out.println("Choose your room type : [ VIP / Normal ]");
					    room = scan.nextLine();
				   }while (!room.equals("VIP") && !room.equals("Normal"));
				   
				   r0omz.add(room);

				   break;
				   
			   case 2:
				   if(nam3.size() == 0) {
					   System.out.println("No Patient!");
				   }else {
					   for(int i=0;i<nam3.size();i++) {
						   System.out.print((i+1)+". ");
						   System.out.print(" "+nam3.get(i));  // 0 1 
						   System.out.print(" "+genderr.get(i)); // 0 1 2
						   System.out.println(" "+r0omz.get(i)); // 0 1 2
					   }
				   }
				   break;
			   }
         }while(true);
    }
}
