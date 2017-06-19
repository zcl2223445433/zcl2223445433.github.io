import java.util.*;
public class Caipiao {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new  Scanner(System.in);
		System.out.println("输入你的号码");
		int [] a = new int[7];
		int [] b= new int[7];
		for(int i=0;i<7;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<7;i++){
			b[i] = (int)(Math.random()*35+1);
			int w =i;
			for(int n1=0;n1<w;n1++){
				if(b[i] == b[n1]){
					b[i] = (int)(Math.random()*35);
					n1=0;
				}
			}
		}
		for(int i = 0;i<7;i++){
			for(int e = 0;e<7;e++){
				if(a[i] == b[e]){
					n++;
					break;
				}
			}
		}
		for(int i=0;i<7;i++){
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<7;i++){
			System.out.print(a[i]+"\t");
		}
		if(n<5){
			System.out.println("再买一张");
		}else if(n == 7){
			System.out.println("特等奖");
		}else if(n == 6){
			System.out.println("一等奖");
		}else if(n == 5){
			System.out.println("安慰奖");
		}
	}
}


