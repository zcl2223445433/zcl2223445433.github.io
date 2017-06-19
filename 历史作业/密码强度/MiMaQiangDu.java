import java.util.*;
public class MiMaQiangDu {
	public static void main(String[] args) {
		int a=0,b=0,c=0,sum;
		System.out.println("请输入密码：");
		Scanner sc = new Scanner(System.in);
		String aa = sc.next();
		char[] x = aa.toCharArray();
		for(int i=0; i<aa.length();i++){
			if (x[i]>='0'&&x[i]<='9'){
				a=1;
			}
			if (x[i]>='A'&&x[i]<='Z'){
				b=1;
			}
			if (x[i]>=33&&x[i]<=47){
				c=1;
			}
		}
		sum=a+ b+ c;
		if(sum==1){
			System.out.println("密码强度弱！");
		}else if(sum==2){
			System.out.println("密码强度中！");
		}else if(sum==3){
			System.out.println("密码强度强！");
		}
	}
}
