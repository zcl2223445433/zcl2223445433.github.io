public class shuixianhuashu{
	public static void main (String[] args) {
		int n,a=0,b=0,c=0;
		for(n=100; n<500; n++){
			a=n/100;
			b=(n-a*100)/10;
			c=n%10;
		if(n==a*a*a+b*b*b+c*c*c){
			System.out.print(n+"\t");
		}
	}
}
}