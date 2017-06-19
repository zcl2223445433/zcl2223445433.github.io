package com.student;

import java.awt.*;  
import java.util.*;  
import javax.swing.*;
  
public class WZQ extends JFrame { 

public WZQ(){ 
	this.setLayout(null);
	this.setTitle("Îå×ÓÆå");
	
	WuFrame w=new WuFrame();
	w.setBounds(60,60,440,440);
	this.add(w);
	
	this.setBounds(0,0,600,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
public static void main(String args[]){ 
	new WZQ();   
}

}