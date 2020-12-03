package Array;
import java.util.ArrayList;							//step 1
import java.util.Vector;

public class DynamicArray {
	
	ArrayList<String> a = new ArrayList<>();	//step 2
	Vector <String> a1 = new Vector<>();
	
	public DynamicArray() {

		//syntax utk dynamic Array
		/*
		 * add
		 * get
		 * set
		 * remove
		 * clear() => menghapus semua element yang terkandung dalam suatu objek
		 * size() => menunjukan berapa data (bukan total array)
		 * 
		 */
		
		a.add("mobil");		//menambahkan suatu element terhadap objek (a)
		a.size();			//jumlah data atau total data dri element suatu objek
		a.set(0, "motor");	//mengubah value dari element terhadap suatu objek ([index ke brpa],[value yang dimau])
		a.remove(0);		//menghapus element dri index array tertentu terhadap objek (a)
		a.clear();			//menghapus semua element yang ada dalam objek (a)
		
		a.add("motor");
		a.add("pesawat");
		System.out.println(a.get(0));	//get untuk menampilkan element dri index ke brp dri suatu objek

		for(int i=0;i<a.size();i++) {		//menampilkan semua element dari suatu objek
			System.out.println(a.get(i));
		}
		
		BubbleSort();
	}
	
	public void BubbleSort() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(1);
		arr.add(7);
		arr.add(2);
		arr.add(3);
		
		//cara 1
		for(int i=0;i<arr.size()-1;i++) {
			for(int j=arr.size()-1;j>i;j--) {
				if(arr.get(j)<arr.get(j-1)){
					int arr1 = arr.get(j);
					arr.set(j, arr.get(j-1));
					arr.set(j-1,arr1);
				}
			}
		}
		System.out.print("Bubble Sort [9,20,1,7] asc: ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[]args) {
		new DynamicArray();
	}
}
