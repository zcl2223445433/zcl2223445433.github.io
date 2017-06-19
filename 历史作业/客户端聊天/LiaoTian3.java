package com.dazhi;
import java.io.*;
import java.net.Socket;
import java.sql.PreparedStatement;
import java.util.*;

import com.mysql.jdbc.Connection;

public class LiaoTian3 implements Runnable {
	List<Socket> list1;
	Socket socket = null;
	Map<String,Socket> map = new HashMap<String,Socket>();
	public Fb1(Socket socket,List<Socket> list1,Map<String,Socket> map){
		this.socket = socket;
		this.list1 = list1;
		this.map = map;
	}
	public void run(){
		while(true){
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));//getInputStream返回此套接字的输入流
				String s = null;
				s = br.readLine();
				//查
				Set <String> set = map.keySet();
				String name = "";
				for(String s1: set){
					Socket so = map.get(s1);
					if(soc==so){
						name = s1;
					}
				}
				String s2 = name+"说："+s;
				System.out.println(s2);
				//历史记录
				Connection con = (Connection) Mysqldl.getCon();
				try {
					PreparedStatement psql = con.prepareStatement("insert into Xiaoxi (xx)"
							+"values(?)");
					psql.setString(1,s2);
					psql.executeUpdate();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 				
				//
				//向用户返回消息
				PrintWriter pw;
				for(Socket soc1: li){
					pw = new PrintWriter(soc1.getOutputStream());
					pw.write(s2+"\n");
					pw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
