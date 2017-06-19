package com.dazhi;
import java.io.Serializable;
//获取对象的父类与实现的接口
public class FanShe2 implements Serializable {
	private static final long serialVersionUID = -2862585049955236662L;
	
	public static void main(String[] args) throws Exception {
		Class<?> cla = Class.forName("com.dazhi.FanShe2");
		//取得父类
		Class<?> parentClass = cla.getSuperclass();
		System.out.println("cla的父类为："+parentClass.getName());
		//获取所有接口
		Class<?> intes[] = cla.getInterfaces();
		System.out.println("cla实现的接口有：");
		for(int i=0;i<intes.length;i++){
			System.out.println(intes[i].getName()+"\t");
		}
	}

}
