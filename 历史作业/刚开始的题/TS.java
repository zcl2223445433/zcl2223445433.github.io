public class TS{
	public static void main(String[] args) {
		long TS=0,SWK=0,ZBJ=0,SS=0;
		for(int a=1000; a<=25000;a++){
			TS=TS+a;
		}
		System.out.println("ÌÆÉ®ÊÇ"+TS);
		for(int b=25001; b<=50000;b++){
			SWK=SWK+b;
		}
		System.out.println("ËïÎò¿ÕÊÇ"+SWK);
		for(int c=50001; c<=75000;c++){
			ZBJ=ZBJ+c;
		}
		System.out.println("Öí°Ë½äÊÇ"+ZBJ);
		for(int d=75001; d<=100000;d++){
			SS=SS+d;
		}
		System.out.println("É³É®ÊÇ"+SS);
		System.out.println("ºÍÊÇ"+(TS+SWK+ZBJ+SS));
	}
}
