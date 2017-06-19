package com.sy1;

import java.io.*;
import java.net.*;

public class SocketServer {

    public static void main(String[] args){
    	// 在端口上创建一个服务器套接字
    	ServerSocket serverSocket = null;
    	Socket socket  = null;
    	try{
			serverSocket = new ServerSocket(9999);
			System.out.println("服务器创建成功");
			socket = serverSocket.accept();
			System.out.println("正在监听端口");
			while(true){
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String sb = bufferedReader.readLine();
				System.out.println("服务器:你是干什么的");
				System.out.println("客户端："+sb);
				
				String ss = "服务器返回内容"+sb;
				PrintWriter w = new PrintWriter(socket.getOutputStream());
				w.write(ss+"\n");
				w.flush();
			}
		}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}