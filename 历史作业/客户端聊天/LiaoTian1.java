package com.dazhi;

import java.io.*;
import java.net.*;
import java.sql.*;

import javax.swing.JTextArea;
import com.mysql.jdbc.Connection;
public class LiaoTian1 implements Runnable {
	Socket socket;
	JTextArea jTextArea;

	public LiaoTian1(Socket socket,JTextArea jTextArea){
		this.soc = socket;
		this.jta = jTextArea;
	}
	String s;
	public void run(){
		//接受服务器返回的内容 
		while(true) throws Exception {
				BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				s = br.readLine();
				jta.setText(jta.getText()+"\t"+s);
				System.out.println(s);
		}
	}
}













