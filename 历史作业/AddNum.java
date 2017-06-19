import java.util.Scanner;

public class AddNum {
	public static void main(String[] args) {
		int a, temp, num, c = 0, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		a = sc.nextInt();
		System.out.println("请输入位数：");
		temp = sc.nextInt();
		num = a;
		for (int i = 1; i < temp; i++) {
			a = a * 10 + num;
			c += a;
		}
		sum = c + num;
		System.out.println("sum:" + sum);
	}
}