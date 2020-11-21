import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String nama = "";
		String date = "";
		
		String day="";
		String mon="";
		String year="";
		System.out.println("Selamat datang ke username dan password generator");
		System.out.println("=================================================");
		System.out.println("");
		
		do {
			System.out.print("Silahkan masukan nama anda : ");
			nama = sc.nextLine();
			
			if(nama.length()<4) {
				System.out.println("Tidak boleh kurang dari 4 huruf");
			}
		}while(nama.length()<4);

		boolean valid = false;
		do {
			valid = false;
			System.out.print("Silahkan masukan tanggal lahir anda(ddmmyyyy) : ");
			date = sc.nextLine();
			
			day = date.substring(0,2);
			mon = date.substring(2,4);
			year = date.substring(4,8);
			
			String[] tigaSatu = {"01","03","05","07","08","10","12"};
			String[] tigaPuluh = {"04","06","09","11"};
			
			for(int i=0;i<tigaSatu.length;i++) {
				if(mon.equals(tigaSatu[i]) ) {
					valid = true;
				}
			}
			
			for(int i=0;i<tigaPuluh.length;i++) {
				if(mon.equals(tigaPuluh[i]) ) {
					valid = true;
				}
			}
			
			if(Integer.parseInt(mon) == 02) {
				int kabisatYear = (2020 - Integer.parseInt(year));
				int febDay=0;
				
				if(kabisatYear%4==0) {
					febDay = 28;
				}else {
					febDay = 29;
				}
				
				if(day.equals(Integer.toString(febDay))) valid = true;
			}

			if(date.length()!=8) {
				System.out.println("- Salah masukan tanggal lahir. Harap gunakan ddmmyyyy");
			}
			
			if((2020 - Integer.parseInt(year) < 20)||(2020 - Integer.parseInt(year) > 60)) {
				System.out.println("- Usia harus diantara 20 - 60");
				valid = false;
			}
			
			if(Integer.parseInt(mon) > 12) {
				System.out.println("- Bulan tidak boleh lebih besar dari 12");
				valid = false;
			}
		}while(!valid||date.length()!=8);
		
		String username = "";
		System.out.println("Selamat Datang "+nama);
		nama = nama.toLowerCase();
		nama = nama.replaceAll(" ","");
		
		int max = 0;
		if(nama.length()<8) {
			nama.trim();
			max = 8 - nama.length();
			String temp = nama.substring(0,max-1);
			username = (nama+temp)+mon+year.substring(0,2);
			
		}else {
			nama = nama.substring(0,9);
			username = nama+mon+year.substring(0,2);;
		}

		System.out.println("Username anda adalah " + username);
		System.out.println("Password anda adalah " + date);
    }
}
