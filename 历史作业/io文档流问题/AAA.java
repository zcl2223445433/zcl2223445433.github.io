import java.io.*;
public class AAA {
	public static void main(String[] args) throws IOException {
		String  f1 = "D:/Java"+File.separator+"text.txt";
		File file = new File(f1);
		OutputStream out = new FileOutputStream(file,true);
		String str = "222";
		byte [] b = str.getBytes();
		out.write(b);
		for(int i=0;i<b.length;i++){
			out.write(b[i]);	
		}
		out.close();
	}

}
