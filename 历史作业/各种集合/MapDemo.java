/* 
 Map集合：该集合存储键(K)值(V)对,一对一往里存，而且要保证键的唯一性。 
    1、添加 
        put(K key,V value) 
        putAll(Map<? extends K,? extends V> m) 
    2、删除 
        clear() 
        remove(Object key) 
    3、判断 
        containsValue(Object value) 
        containsKey(Object key) 
        isEmpty() 
    4、获取 
        get(Object key) 
        siza() 
        values() 
         
 Map 
      |---Hashtable:底层是哈希表数据结构，不可以存入null键和null值，该集合是线程同步的，jdk1.0效率低。 
      |---HashMap：底层是哈希表数据结构，允许使用null键和null值，该集合是线程不同步，jdk1.2效率高。 
      |---TreeMap：底层是二叉树数据结构，线程不同步，可以用于给Map集合中的键进行排序。 
 和Set很像，其实Set集合方法底层调用的都是Map集合方法。       
 */  
//import java.util.Collection;   
//import java.util.HashMap;  
//import java.util.Map;
import java.util.*;
public class MapDemo {  
    public static void main(String[] args) {  
        Map<Integer,String> map=new HashMap<Integer,String>();  
          
        //添加元素  
        map.put(2016316, "张一六");  
        map.put(2016314, "李一四");  
        map.put(2016313, "王一三");  
        map.put(2016311, "马一一");  
        //在添加元素时，如果出现相同的键，那么后添加的值会覆盖原有键对应的值（value），  
        //并且put方法会返回被覆盖的值。  
        map.put(2016311, "赵一一");  
        map.put(2016309, "李零九");  
        map.put(2016318, "钱一八");  
          
        System.out.println(map);  
        //获取map集合中所有的值  
        Collection<String> coll=map.values();  
        System.out.println("map集合中的value值为：");  
        System.out.println(coll);  
        int key=2016316;  
        if(map.containsKey(key))  
        System.out.println("存在："+map.get(key));  
        System.out.println("containsKey:"+map.containsKey(2016316));  
        map.put(2016311, "孙一一");  
        System.out.println("添加新元素后，map集合为：");  
        System.out.println(map);  
        System.out.println("get:"+map.get(2016314));  
        //可以通过get()方法的返回值来判断一个键是否存在，通过返回null来判断。  
        System.out.println("get:"+map.get(2016419));  
        System.out.println("remove:"+map.remove(2016311));  
        System.out.println(map);  
    }  
}  
