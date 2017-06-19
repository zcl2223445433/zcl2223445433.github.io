package com.dazhi;

import java.lang.reflect.Constructor;

public class FanShe3 {
	public static void main(String[] args) throws Exception {
		Class<?> class1 = null;
		class1 = Class.forName("com.dazhi.User");
		//第一种方法，实例化默认构造方法，调用set赋值
		User user = (User) class1.newInstance();
		user.setAge(20);
		user.setName("老张");
		System.out.println(user);
		//第二种方法 取得全部构造函数 使用构造函数赋值
		Constructor<?> cons[] = class1.getConstructors();
		//查看每个构造方法需要的参数
		for (int i=0;i<cons.length;i++){
			Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
		}
			user = (User) cons[0].newInstance(20,"老张");
			System.out.println(user);
		 	user = (User) cons[1].newInstance("老张");
	        System.out.println(user);
	        
	}
}
	class User {
	    private int age;
	    private String name;
	    public User() {
	  
	    }
	    public User(String name) {
	        this.name = name;
	    }
	    public User(int age, String name) {
	        super();
	        this.age = age;
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return "User [age=" + age + ", name=" + name + "]";
	    }
	}

