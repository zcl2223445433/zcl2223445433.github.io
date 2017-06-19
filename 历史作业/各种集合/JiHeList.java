import java.util.*;
public class JiHeList {
	public static void main(String[] args) {
		/**
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(10000));
		a.add(new Integer(200000));
		a.add(new Integer(1000000));
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		*/	
		MyStack ms = new MyStack();
		ms.push("one");
		ms.push("two");
		ms.push("three");

		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.empty());
	}
		static class MyStack{
			private LinkedList<Object> ll = new LinkedList<Object>();
			public void push(Object o){
				ll.addFirst(o);
			}
			public Object pop(){
				return ll.removeFirst();
			}
			public Object empty(){
				return ll.isEmpty();
			}
		}
}

