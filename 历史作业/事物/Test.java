package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 事务的基本用法
 *
 */
public class Test{
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;

        try{
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javause","root","jung");
            
            conn.setAutoCommit(false); //JDBC中默认是true，我们改成false，然后在后面手动提交
            
            ps1 = conn.prepareStatement("insert into student (sid,sname,sex) values (?,?,?)");//?是占位符
            ps1.setObject(1, "1");
            ps1.setObject(2, "张三");
            ps1.setObject(3, "男");
            ps1.execute();
            System.out.println("插入一个用户张三");
            
            try{
                Thread.sleep(3000);
            } 
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
            ps2 = conn.prepareStatement("insert into student (sid,sname,sex) values (?,?,?)");
            ps2.setObject(1, "2");
            ps2.setObject(2, "李四");
            ps2.setObject(3, "男");
            ps2.execute();            
            System.out.println("插入一个用户李四");
          
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            ps3 = conn.prepareStatement("insert into student (sid,sname,sex) values (?,?,?)");//?是占位符
            ps3.setObject(1, "3");
            ps3.setObject(2, "王五");
            ps3.setObject(3, "男");
            ps3.execute();
            System.out.println("插入一个用户王五");
            
            conn.commit();//提交事务
         }catch (ClassNotFoundException e){
            e.printStackTrace();
            try{
                conn.rollback();//某一条数据添加失败时，回滚
            } 
            catch (SQLException e1){
                e1.printStackTrace();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(ps1!=null){
                    ps1.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if(conn!=null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
