public class B {
	public static void main (String[] args){
		String[] arr = new String[]{"a","b"};
		System.out.println(find(arr,"c"));
	}
	public static int find(String[] arr,String str){
		boolean flag = false;
		for (int i=0;i<arr.length ;i++ ){
			if(arr[i].equals(str)){
				flag=true;
				return i;
			} 
		}
		if(flag==false){
			return -1;
		}
		return -1;
	}
}
