import java.util.Scanner;
public class CaiQuan1 {
	public static void main(String[] args) {
		System.out.println("输入一个数 1=锤  2=剪刀  3= 包袱");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a==1){
			System.out.println("你出的是：锤");
		}
		else if (a==2){
			System.out.println("你出的是：剪刀");
		}
		else if (a==3){
			System.out.println("你出的是：包袱");
		}
		int b = (int)(Math.random()*3+1);
		if (b==1){
			System.out.println("电脑出的是：锤");
		}
		else if (b==2){
			System.out.println("电脑出的是：剪刀");
		}
		else if (b==3){
			System.out.println("电脑出的是：包袱");
		}
		new CaiQuan().ff(a, b);
	}
}
