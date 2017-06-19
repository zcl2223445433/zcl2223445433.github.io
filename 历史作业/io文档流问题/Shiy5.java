import java.util.*;
public class Shiy5 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Set<String> set1 = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set1.add("eee");
		System.out.println(set.hashCode());
		System.out.println(set1.hashCode());
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}
}
