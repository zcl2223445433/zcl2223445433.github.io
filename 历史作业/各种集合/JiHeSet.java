import java.util.*;
public class JiHeSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Bernadine");
		set.add("Elzabeth");
		set.add("Gene");
		set.add("Elizabeth");
		set.add("Clara");
		set.add("Gene");
		set.add("Clara");
		System.out.println(set);
		Set<String> a = new TreeSet<String>(set);
		System.out.println(a);
	}
}
