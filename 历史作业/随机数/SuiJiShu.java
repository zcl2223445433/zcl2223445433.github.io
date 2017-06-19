package com.sy1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SuiJiShu extends Frame{
	boolean flag = true;
	public SuiJiShu(){
		this.setLayout(null);
		JPasswordField jf = new JPasswordField();
		jf.setText("");
		jf.setBounds(250,100,100,35);
		this.add(jf);
		JLabel jl = new JLabel();
		jl.setText("");
		jl.setBounds(200,200,200,40);
		this.add(jl);
		JLabel jl2 = new JLabel();
		jl2.setText("");
		jl2.setBounds(200,230,100,40);
		this.add(jl2);
		//输入框
		JTextArea jta = new JTextArea();
		jta.setText("请输入1-10：");
		jta.setBounds(170,110,200,50);
		jta.getBorder();
		this.add(jta);
		JTextArea jta2 = new JTextArea();
		jta2.setText("随机数为："+"");
		jta2.setBounds(200,180,120,50);
		jta2.getBorder();
		this.add(jta2);
		//开始按钮
		JButton jb = new JButton();
		jb.setText("开始");
		jb.setBounds(400,200,85,30);
		//随机数
		jb.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){
						if(jb.getText().equals("开始")){
							flag = true;
						}else if(jb.getText().equals("停止")){
							flag = false;
						}
						jb.setText("停止");
						while(flag){
							try {
								Thread.sleep(0);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							jta2.setText((int)(Math.random()*10+1)+"");
						}
						String i = jf.getText();
						String t = jta2.getText();
						if(i.equals(t)){
							jl.setText("是否与输入的数相同:"+"YES");
							jl2.setText("这次随机的随机数为:"+jta2.getText());
							
						}else if(!i.equals(t)){
							jl.setText("是否与输入的数相同:"+"NO");
							jl2.setText("随机数为"+jta2.getText());
						}
					}
				}).start();
			}
		});
		this.add(jb);
		this.setBounds(300,300,550,550);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new SuiJiShu();
	}
}
