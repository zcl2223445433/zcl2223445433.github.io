public class wanshu{
      public static void main(String[] args){
        int a,i,j;
	    for(i=1; i<1000; i++){
		    a=0;
	       for(j=1; j<i; j++){
			   if(i%j==0){
		         a=a+j;
			   }
	       }
		   if(a==i){
	       System.out.println(i);
	    }
	     
        }
	  }
}