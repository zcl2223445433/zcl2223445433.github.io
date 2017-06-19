import java.util.Scanner;
public class AAA{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
		System.out.println("请输入两个数");
		double a=in.nextDouble();
		String ch=in.next();
		double b=in.nextDouble();
		if (ch.equals("+")){
			System.out.println("a+b="+(a+b));
		}
		else if (ch.equals("-")){
			System.out.println("a-b="+(a-b));
		}
		else if (ch.equals("*")){
			System.out.println("a*b="+(a*b));
		}
		else if (ch.equals("/")){
			System.out.println("a/b="+(a/b));
		}
    }
}