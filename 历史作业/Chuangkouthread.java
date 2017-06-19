package com.student;

public class Chuangkouthread extends Thread{
	Chuangkou chuangkou;
	public Chuangkouthread(Chuangkou chuangkou){
		this.chuangkou=chuangkou;
	}

	@Override
	public void run() {
		chuangkou.sale();
	}
	
}
