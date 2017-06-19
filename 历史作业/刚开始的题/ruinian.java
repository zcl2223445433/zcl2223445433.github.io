public class ruinian{
	public static void main (String[] args) {
		int n=1900;
		if(n%400==0||n%4==0&&n%100!=0){
			System.out.print("yes");
		}else{
			System.out.print("no");
		}
		
	}
}