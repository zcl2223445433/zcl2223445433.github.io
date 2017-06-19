import java.util.*;
public class JiHeMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s:args) {
			Integer times = map.get(s);
			map.put(s, times == null?new Integer(1):new Integer(tinme.intvalue()+1));
		}

		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> entry : set){
			System.out.println(entry);
		}
	}
}
