package com.student;

import java.sql.*;

public class Mysql {

	public static void main(String[] args) {
		try{
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//1.gerConnection(),连接MySql数据库
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zuoye1","root","jing");
			if(!con.isClosed())	
				System.out.println("sssss!");
			//.创建statement类对象，用来执行SQL语句
			Statement statement = con.createStatement();
			//要执行的SQL语句
			String sql = "select * from dept";
			//ResultSet类，同来存放获取的结果集
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()){
				//获取这列数据
				String cid = rs.getString("dno");
				//获取这列数据
				String cname = rs.getString("city");
				//获取这列数据
				String cbig = rs.getString("area");
				//输出结果
				System.out.println(cid+"\t"+cname+"\t"+cbig);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	//增加
	public void add(String cid, String cname, String cbig){
		String sql = "insert into dept values("+cid+","+cname+","+cbig+")";
		//insert into dept values();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zuoye1","root","jing");
			
			String sql1 = "INSERT INTO 'dept' VALUES(?,?,?)";
			PreparedStatement ps = (PreparedStatement) con.createStatement();
			ps.setString(1,cid);
			ps.setString(2,cname);
			ps.setString(3,cbig);
			boolean isSuccess = ps.execute();
			System.out.println("结果是："+isSuccess);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	//删除
	//更改
	//查询
	
	
}
