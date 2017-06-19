package com.sy1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;

public class ShouRunnable implements Runnable {
	Socket socket;
	JLabel jLabel;
	public ShouRunnable(Socket socket,JLabel jLabel){
		this.socket = socket;
		this.jLabel = jLabel;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				//接受服务器端返回的内容
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String neirong = bufferedReader.readLine();
				//显示到Label
				jLabel.setText(jLabel.getText()+neirong);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
