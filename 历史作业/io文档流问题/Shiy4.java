//自然排序先年龄后成绩
import java.util.*;

public class Shiy4  implements Comparable {
	int c;
	int cj;
	Object name;
	public Shiy4(Object name,int c,int cj){
		this.name = name;
		this.c = c;
		this.cj = cj;
	}
	public String toString(){
		return "姓名"+name+"\t年龄"+c+"\t成绩"+cj;
	}
	public int compareTo(Object o) {
		Shiy4 s4 = (Shiy4)o;
		if(this.c>s4.c){
			return 1;
		}else if(this.c == s4.c){
			if(this.cj>s4.cj){
				return 1;
			}else if(this.cj<s4.cj){
				return -1;
			}
			return 0;
		}
		return -1;
	}
}




















/*private float screen;
private float cup;
public int getScreen() {
	return a;
}
public void setScreen(String a) {
	this.screen = screen;
}
public String getCup() {
	return b;
}
public void setCup(int b) {
	this.cup = b;
}
*/