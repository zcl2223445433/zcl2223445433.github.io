import java.util.*;
public  class Students {
	static student1[] suibian = new student1[100];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		caiDan();
	}
	
	public static void caiDan(){
		System.out.println("+========================+");
		System.out.println("|--请输入你需要的功能：--|");
		System.out.println("|------1：增加数据-------|");
		System.out.println("|------2：删除数据-------|");
		System.out.println("|------3：修改数据-------|");
		System.out.println("|------4：查询数据-------|");
		System.out.println("|------5：退出-----------|");
		System.out.println("+========================+");
		int flag=sc.nextInt();
		switch(flag){
			case 1: addStudents(); break;
			case 2: deleteStudents(); break;
			case 3: updateStudents(); break;
			case 4: selectStudents(); break;
			case 5: exit(); break;
		}

	}
	public static  void addStudents(){
		int i=0;//局部变量  需调节 成员变量 
		Boolean aa=true;
		while(aa){
			System.out.println("请输入姓名");
			String name= sc.next();
			System.out.println("请输入年龄");
			int age=sc.nextInt();
			System.out.println("请输入性别");
			String sex=sc.next();
			student1 student = new student1(name,age,sex);
			suibian[i]=student;
			i++;
			System.out.println("添加成功，是否继续添加？ 1：继续；2：返回菜单");
			int cc=sc.nextInt();
			if(cc==1){
				aa=true;
			}else if(cc==2){
				aa=false;
			}

		}
		caiDan();
	}
	public static void deleteStudents(){
	}
	public static void updateStudents(){
	}
	public static void selectStudents(){
		/**for(int j=0;j<suibian.length;j++){
			suibian[j].say();
		}*/
		
		Boolean bb=true;
		while(bb){
		int rr=0;
		System.out.println("请输入你要查询的姓名");
		String a = sc.next();
		for(int k=0;k<suibian.length;k++){
			if(a.equals(suibian[k].name) && suibian[k]!=null){
				rr=1;
				suibian[k].say();
				
				break;
			}
		}
		if(rr==1){
			System.out.println("查询成功，是否继续？ 1：继续；2：返回菜单");
				int cc=sc.nextInt();
				if(cc==1){
					bb=true;
				}else if(cc==2){
					caiDan();
				}
			

			}else{
				System.out.print("对不起，查无此人！");
			}
					
		
		
		}
	}
	public static void exit(){
		System.exit(0);
	}
}
