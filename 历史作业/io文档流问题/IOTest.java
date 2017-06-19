import java.io.*;
class  IOTest{
	public static void main(String[] args) {
	
	}
	public static void loop(String path){
		File file = new File (path);
		String s[] = null;
		if(file.isDirectory()){
			s = file.list();
			for(int i=0; i<s.lenth; i++){
				loop(path+file.separator+s[i]);
			}
		}else{
			System.out.println(path);
		}
	}
}
