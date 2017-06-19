//排序1
import java.util.*;
public class Shiy41 {
public static void main(String[] args) {
		TreeSet<Shiy4> ts = new TreeSet<Shiy4>();
		ts.add(new Shiy4("a",1,11));
		ts.add(new Shiy4("b",2,22));
		ts.add(new Shiy4("c",3,33));
		ts.add(new Shiy4("d",4,44));
		ts.add(new Shiy4("e",5,55));
		//System.out.println(ts);
		Iterator<Shiy4> i = ts.iterator();
		while(i.hasNext()){//检查是否还有元素
			System.out.println(i.next());//返回迭代的下一个元素
		}
	}
}
