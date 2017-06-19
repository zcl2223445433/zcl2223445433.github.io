import java.util.Scanner;
public class XZSS{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
		System.out.println("请输入两个数");
		double a=in.nextDouble();
		char ch=in.next().charAt(0);
		double b=in.nextDouble();
		if (ch=='+'){
			System.out.println("a+b="+(a+b));
		}
		else if (ch=='-'){
			System.out.println("a-b="+(a-b));
		}
		else if (ch=='*'){
			System.out.println("a*b="+(a*b));
		}
		else if (ch=='/'){
			System.out.println("a/b="+(a/b));
		}
    }
}