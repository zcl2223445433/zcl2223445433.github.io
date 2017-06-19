public class student1 {
	
		String name; //学生姓名
		int age;	 //学生年龄
		String sex;	 //学生性别
		
		public student1(String name,int age, String sex){
			this.name=name;
			this.age=age;
			this.sex=sex;
		}

		public  void eat(){
			System.out.println("eating");
		}
		public  void sleep(){
			System.out.println("sleep");
		}
		public  void study(){
			System.out.println("learn");
		}
		public void say(){
			System.out.println("我是"+name+"，我今年"+age+"岁，是"+sex+"孩子");
		}
}
