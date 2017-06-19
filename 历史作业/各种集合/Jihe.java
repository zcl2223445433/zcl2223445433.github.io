import java.util.*;
public class Jihe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("一");
		set.add("二");
		set.add("三");
		set.add("四");
		set.add("五");
		set.add("四");
		set.add("三");
		for(String s:args){
			if(!set.add(s)){
				System.out.println(s+"为重复存在单词");
			}
		}
		System.out.println(set.size()+"个单独的单词，分别为"+set);
	}
}
