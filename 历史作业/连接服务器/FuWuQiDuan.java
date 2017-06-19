package com.student;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FuWuQiDuan {

	public static void main(String[] args) {
		try {
			//创建服务端  并开通注册端口
			ServerSocket serverSocket = new ServerSocket(8989);
			//监听对应端口
			Socket sockect = serverSocket.accept();
			//String address = socket
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
