class A {
	
		

		//int y = 'A';
		//System.out.println(y);
		/**
		boolean flag = false;
		int i = 0;
		if(flag||i>100){
			System.out.println("step1");
		}else if(!!flag&i/0>8){
			System.out.println("step2");
		}else{
			System.out.println("step3");
		}
		*/
		//System.out.println(1+2+"java"+3+4);
		/*
		int i=0;
		for(i++;i++<10;i++);
		System.out.println(++i);
		*/
		/*
		for(int i=0;i<3;i++){
			switch(i){
				case 1:
					System.out.println("a");
					break;
				case 0:
					System.out.println("b");
					break;
				default:
					System.out.println("c");
					
				case 2:
					System.out.println("d");
					
			}
		}
		*/
		/*String[] i =new String[3];
		  int j;
		for(j=0;j<i.length;j++){
			System.out.println(i[j]);
		}*/
		public static void prt(){
			System.out.println("1");
		}
	
		public A(){
			System.out.println("A");
		}
}
	public class B extends A{
		public static void prt(){
			System.out.println("2");
		}
		public B(){
			System.out.println("B");
		}
		public static void main(String[] args) {
			A a = new B();
			a=new A();
		}
	
}	