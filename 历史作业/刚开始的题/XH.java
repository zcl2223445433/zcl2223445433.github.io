public class XH{
	public static void main(String[] args) {
		//第一题
		int a=1,sum=0;
		for(int i=1; i<=10; i++){
			a=a*i;
			sum=sum+a;
		}
		System.out.println("1.阶乘和是"+sum);
		//第二题
		int b=0;
		System.out.println("2.3的倍数有：");
		for(int n=1; n<=100; n++){
			if (n%3==0){
				b++;
				System.out.print(n+"\t");
			}
		}
				System.out.println("个数是"+b+"个");
		//第三题
		int c=0;
		System.out.println("3.3的倍数前五个是：");
		for(int m=1; m<=100; m++){
			if (m%3==0){
				c++;
				System.out.print(m+"\t");
				if(c==5){
					break;
				}
			}
		}
		System.out.print("\n");
		//第四题
		int h=0;
		for(int x=100; x<=200; x++){
			if(x%2!=0){
				h=h+x;
			}
		}
			System.out.println("4.奇数和是："+h);
				
	}
}
