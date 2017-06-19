import java.util.*;
public class GongJu {
	public static void main(String[] args) {
		//≈≈–Ú
	int [] date={3,5,8,11,2,1,55,4,66,10};
		Arrays.sort(date);
		for (int i : date) {
			System.out.print("\t"+i+"");
		}
		//∏¥÷∆
		System.out.print("\n");
	int[] da = Arrays.copyOf(date,12);
	//----------------copyOdRanger(date,3,8);
		for(int j : da){
			System.out.print("\t"+j);
		}
		//±»Ωœ
		
		System.out.print(Arrays.equals(da,date));

		System.out.print("\n");
		swap();
		aa();
	}
	//≈≈–Ú
	public static void swap() {
		char[] date = {'A','D','D','F','X','Z','H','G','H'};
		Arrays.sort(date);
		System.out.print("Œª÷√ «"+Arrays.binarySearch(date,'A')+"\n");
		for(char i : date){
		System.out.print("\t"+i+"");
		}
		
	}	
	//ÃÓ≥‰
	public static void aa(){
		System.out.print("\n");
		int[] date = new int[5];
		Arrays.fill(date,7);
		for(int i : date){
			System.out.print("\t"+i);
		
		}
	}
	
	
}
