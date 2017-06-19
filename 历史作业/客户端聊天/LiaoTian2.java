package com.dazhi;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Connection;

public class LiaoTian2 extends JFrame {
	
	static JTextArea jTextArea=null;
	public LiaoTian2(Socket socket) throws Exception{
		this.setLayout(null);
		JTextArea jTextArea = new JTextArea();
		jTextArea.setBounds(0,270,800,30);
		this.add(jTextArea);
		JButton jButton = new JButton();
		this.add(jButton);
		jButton.setText("发送");
		jButton.setBounds(95,350,70,35);
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				String s = jTextArea.getText();
				if(!"".equals(s)) throws Exception{
						PrintWriter pw = new PrintWriter(soc.getOutputStream());
						pw.write(s+"\n");
						pw.flush();
				}
				jTextArea.setText("");
			}
		});
		//显示框
		jTextArea = new JTextArea();
		jTextArea.setBounds(0,70,850,220);
		this.add(jTextArea);
		jTextArea.setEnabled(false);
		this.setVisible(true);
		this.setBounds(20,100,800,600);
		new Thread(new Ck1(soc,jTextArea)).start();
		/**/
		JScrollPane jsll = new JScrollPane(jTextArea);
		jsll.setBounds(0,60,800,200);
		this.add(jsll);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//清空记录
		JButton jButton = new JButton();
		this.add(jButton);
		jButton.setText("清空历史纪录");
		jButton.setBounds(170,350,70,35);
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jTextArea.setText("");
			}
		});
		

		
	}
	public static JTextArea getJta(){
		return jTextArea;
	}
	
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.199.249",8989);
		PrintWriter pw = new PrintWriter(soc.getOutputStream());
		pw.write("\n");
		pw.flush();
		new LiaoTian2(socket);

		try{
			Connection con = (Connection) Mysqldl.getCon();
			Statement statement = Mysqldl.getCon().createStatement();
			String s2 = "select * from laozhang";
			ResultSet rs = statement.executeQuery(s2);
			while(rs.next()){
				jta.setText(jta.getText()+"\n"+rs.getString("xx"));
			}
	
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}










