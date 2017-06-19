package com.student;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HLD1 extends JFrame {
	public static void main(String[] args) {
		new HLD1();
	}
	boolean flag = true;
	public HLD1(){
		this.setLayout(null);
		this.setBounds(250,250,500,500);
		this.setVisible(true);
		JLabel jLable = new JLabel();
		boolean falg = true;
		jLable.setOpaque(falg);
		jLable.setBounds(250,250,100,100);
		jLable.setBackground(Color.red);
		//开始
		JButton jButton = new JButton();
		jButton.setText("滴");
		jButton.setBounds(50,50,50,50);
		this.add(jButton);
		this.add(jLable);
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){		
						//颜色循环
						while(falg){
						try {
							jLable.setBackground(Color.red);
								Thread.sleep(1000);
							jLable.setBackground(Color.yellow);
								Thread.sleep(1000);
							jLable.setBackground(Color.green);
								Thread.sleep(1000);
						} catch (Exception e) {
								e.printStackTrace();
						}
						}
						
					}
				}).start();;
			}
		});
	}
}
