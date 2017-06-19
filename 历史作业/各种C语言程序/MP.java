public class MP{
	public static void main(String[] args) {
		int i,j,x;
		int [] a = new int[]{5,4,7,2,3};
		for (j=0 ;j<5 ;j++ ){
			for (i=0 ;i<4-j ;i++ ){
				if (a[i]>a[i+1]){
					x=a[i];
					a[i]=a[i+1];
					a[i+1]=x;
				}
			}
		}
		for (i=0 ;i<5; i++ ){
			System.out.println(a[i]);
		}
	}
}
