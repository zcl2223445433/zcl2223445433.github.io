import java.util.Scanner;
public class JJCC{
    public static void main(String[] args){
        Scanner name=new Scanner(System.in);
		System.out.println("请输入两个数");
		double a=name.nextDouble();
		double b=name.nextDouble();
		//int a=2,b=3;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
    }
}