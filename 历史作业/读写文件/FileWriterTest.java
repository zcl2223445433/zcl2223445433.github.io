import java.io.*;

public class FileWriterTest {
	// 读写文件
	public static void rwFile(){
		FileWriter fw = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter("D:\\新建文件夹", true);
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream("d:\\1.txt"), "UTF-8"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("文件内容: " + line);
				fw.write(line);
				fw.flush();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		rwFile();
	}
}