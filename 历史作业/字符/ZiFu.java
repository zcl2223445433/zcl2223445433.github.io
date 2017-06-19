import java.util.*;
public class ZiFu {
	public static void main(String[] args) {
		String a = "Kang,Hua,tai";
		//System.out.println(a);
	    String[] aArray = a.split(",");
		for (int i = 0; i < aArray.length; i++) {
            System.out.println(aArray[i]);
        }
/**		int maxSplit = 3;
        aArray = a.split(",", maxSplit);
        for (int i = 0; i < aArray.length; i++) {
            System.out.println(aArray[i]);
        }     */
	}
}
/**public class ZiFu {
    public static void main(String[] args) {
        String sourceStr = "1,2,3,4,5";
        String[] sourceStrArray = sourceStr.split(",");
        for (int i = 0; i < sourceStrArray.length; i++) {
            System.out.println(sourceStrArray[i]);
        }

        // 最多分割出3个字符串
        int maxSplit = 3;
        sourceStrArray = sourceStr.split(",", maxSplit);
        for (int i = 0; i < sourceStrArray.length; i++) {
            System.out.println(sourceStrArray[i]);
        }
    }
}*/