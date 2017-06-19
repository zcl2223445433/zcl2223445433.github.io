package com.student;

import java.awt.*;

//棋子类
public class Point {
	
	private int x;//x点坐标
	private int y;//y坐标
	private Color color;//棋子的颜色
	static final int POINT_SIZE = 40;//棋子的大小--直径
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	public Point(int x, int y, Color color){
		this.x=x;
		this.y=y;
		this.color=color;		
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public Color getColor(){
		return color;
	}

	public void setColor(Color color) {
		this.color=color;
	}


}
