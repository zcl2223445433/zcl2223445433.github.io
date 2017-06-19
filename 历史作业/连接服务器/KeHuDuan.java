package com.student;

import java.io.IOException;
import java.net.Socket;

public class KeHuDuan {

	public static void main(String[] args) {
			try {
				Socket socket = new Socket("127.0.0.1",8989);
				
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
