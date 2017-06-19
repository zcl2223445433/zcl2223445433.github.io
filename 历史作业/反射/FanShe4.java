package com.dazhi;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//获取某个类的全部属性
public class FanShe4 {
    private static final long serialVersionUID = -2862585049955236662L;
	public static void main(String[] args) throws Exception {
		Class<?> cla = Class.forName("com.dazhi.FanShe4");
		System.out.println("============本类属性===========");
		//取得本类的全部属性
		Field[] field = cla.getDeclaredFields();
		for(int i=0;i<field.length;i++){
			//权限修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//属性类型
			Class<?> type = field[i].getType();
			System.out.println(priv+""+type.getName());
		}
	}

}
