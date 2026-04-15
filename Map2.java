//frequency counting using Mapping
import java.util.*;
public class Map2{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str  = s.nextLine();
		String[] arr=str.split(" ");
		LinkedHashMap <String,Integer> sp = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			if (sp.containsKey(arr[i])){
				sp.put(arr[i],sp.get(arr[i])+1);
			}
			else{
				sp.put(arr[i],1);
			}
		}
		System.out.println(sp);
		System.out.println(" ");
		for (Map.Entry<String,Integer>entry:sp.entrySet()){
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
	}
}
