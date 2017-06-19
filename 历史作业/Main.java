package com.student;

public class Main {

	public static void main(String[] args) {
		//创建三个窗户
		Chuangkou chuangkou1 = new Chuangkou("窗口1");
		Chuangkou chuangkou2 = new Chuangkou("窗口2");
		Chuangkou chuangkou3 = new Chuangkou("窗口3");
		//创建三个线程
		Chuangkouthread chuangkouthread1 = new Chuangkouthread(chuangkou1);
		Chuangkouthread chuangkouthread2 = new Chuangkouthread(chuangkou2);
		Chuangkouthread chuangkouthread3 = new Chuangkouthread(chuangkou3);
		//启动
		chuangkouthread1.start();
		chuangkouthread2.start();
		chuangkouthread3.start();
	}

}
