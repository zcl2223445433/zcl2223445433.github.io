public class student {
	
		String name; //学生姓名
		int age;	 //学生年龄
		String sex;	 //学生性别


		public static void eat(){
			System.out.println("eating");
		}
		public static void sleep(){
			System.out.println("sleep");
		}
		public static void study(){
			System.out.println("learn");
		}
		public void say(){
			System.out.println("我是"+name+"，我今年"+age+"岁，是"+sex+"孩子");
		}
}
