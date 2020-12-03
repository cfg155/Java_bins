package Array;

public class StaticArray {
	
	public StaticArray() {
		String [] a= {"motor","mobil","pesawat"};	//cara 1 buat static array
		a[0] = "bajaj"; 								// mengganti array ke-0 menjadi bajaj
		System.out.println(a[0]);						//mencetak array ke-0
		System.out.println(a.length);					//mencetak total data *bukan array
		
		
		String [] b = new String[5];			//cara 2 buat static array
		b = new String[] {
				"lala"
		};
		System.out.println(b[0]);				//bisa ArrayOutOfBounds	
		System.out.println(b.length);
		//atau
		String [] b1 = new String[] {
				"ikan","kochenk","anjing"
		};
		System.out.println(b1[0]);				//bisa ArrayOutOfBounds	
		System.out.println(b1.length);
		

		//untuk mencetak semua data array ada 2 cara
		//cara 1
		for(int i=0;i<3 ;i++) {							//bisa ArrayOutOfBounds				
			System.out.print(a[i]+",");		
		}
		
		System.out.println("");
		
		//cara 2
		for(String i : a) {								//String i mendeskripsikan semua data a
			System.out.print(i+",");
		}
		
		//multidimensional array 2x2
		int [][] numbers = {							//bisa ArrayOutOfBounds	
							{1,2,3},{4,5,6}
							};			
		int x = numbers[0][2];							//[3][2] = [baris] [kolom]
		System.out.println(x);
		
		BubbleSort();
	}
	
	public void BubbleSort() {
		int arrBub[] = {
				9,20,1,7
				};
		
		//cara 1
		for(int i=0; i<arrBub.length-1; i++) {
			for(int j=0; j<arrBub.length-1;j++) {
				if(arrBub[j]>arrBub[j+1]) {
					int tmp = arrBub[j];
					arrBub[j] = arrBub[j+1];
					arrBub[j+1] = tmp;
				}
			}
		}
		
		//cara 2
//		for(int i=0; i<arrBub.length-1; i++) {
//			for(int j=arrBub.length-1; j>i;j--) {
//				if(arrBub[j]<arrBub[j-1]) {
//					int tmp = arrBub[j];
//					arrBub[j] = arrBub[j-1];
//					arrBub[j-1] = tmp;
//				}
//			}
//		}
		System.out.print("Bubble Sort [9,20,1,7] asc: ");
		for(int x : arrBub) {
			System.out.print(x+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[]args) {
		new StaticArray();
	}
}
