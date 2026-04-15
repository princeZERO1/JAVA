import java.util.*;
public class Map1{
	public static void main(String[] args){
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"C");
		hm.put(2,"C++");
		hm.put(3,"Java");
		hm.put(4,"Python"); //if there is duplicate key with different value in run time the previous value is overwrite or deleted
		hm.put(4,"Javascript"); 
		hm.put(null,"CSS"); // if there is null key as more than one it overwrites the previous data
		hm.put(null,"HTML");
		System.out.println(hm);
		System.out.println(hm.get(1)); // if we give out of key value it gives 'null' as output
		System.out.println(hm.get(5));
		if(hm.containsKey(5)){
			System.out.println("Key is present");
		}
		else{
			System.out.println("Key is not presented");
		}
		//display data
		for(Map.Entry<Integer,String>entry:hm.entrySet()){
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		LinkedHashMap<Integer,String> h = new LinkedHashMap<>();//it only cares insertion order
		h.put(1,"C");
		h.put(3,"Java");
		h.put(2,"C++");
		h.put(4,"Python"); //if there is duplicate key with different value in run time the previous value is overwrite or deleted
		h.put(null,"CSS");
		h.put(null,"HTMl");
		System.out.println(h);
		
		TreeMap<Integer,String> m = new TreeMap<>();//it sort the key in ascend order
		m.put(1,"C");
		m.put(2,"C++");
		m.put(3,"Java");
		m.put(4,"Python"); //if there is duplicate key with different value in run time the previous value is overwrite or deleted
		//m.put(null,"CSS");//this give error only for treemap
		System.out.println(m);
		
		Hashtable<Integer,String> hm1 = new Hashtable<>();
		hm1.put(1,"C");
		hm1.put(2,"C++");
		hm1.put(3,"Java");
		hm1.put(4,"Python");
		//hm1.put(null,"CSS");//this gives error null pointer exception same as tree 
		System.out.println(hm);
	}
	
}