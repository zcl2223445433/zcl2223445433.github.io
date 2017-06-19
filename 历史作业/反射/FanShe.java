package com.dazhi;

public class FanShe {
	public static void main(String[] args) throws Exception  {
		FanShe fanshe = new FanShe();
		/**获得包名和类名*/
		System.out.println(fanshe.getClass().getName());
		/**
			实例化class对象
		*/
		Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("com.dazhi.FanShe");
        class2 = new FanShe().getClass();
        class3 = FanShe.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
	}

}
