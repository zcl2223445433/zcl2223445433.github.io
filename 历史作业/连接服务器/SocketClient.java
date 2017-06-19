package com.sy1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketClient {
	public static void main(String[] args){
    	// 创建一个套接字并将其连接到指定端口号
        Socket socket = null;
        try{
        	System.out.println("正在连接");
        	socket = new Socket("127.0.0.1",8999);
        	PrintWriter w = new PrintWriter(socket.getOutputStream());
        	w.write("张成龙\n"); 
        	w.flush();
        	
        	BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;
        	String s = r.readLine();
        	System.out.println(s);
        	w.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
        
    }
}