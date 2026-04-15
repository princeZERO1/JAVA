import java.util.*;
public class Map3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str  = s.nextLine();
		LinkedHashMap <Character,Integer> sp = new LinkedHashMap<>();
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if (sp.containsKey(ch)){
				sp.put(ch,sp.get(ch)+1);
			}
			else{
				sp.put(ch,1);
			}
		}
		System.out.println(sp);
		System.out.println(" ");
		for (Map.Entry<Character,Integer>entry:sp.entrySet()){
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		for(Map.Entry<Character,Integer>entry:sp.entrySet()){
			if(entry.getValue()==1){
				System.out.print(" The first non repeating caharcter: "+entry.getKey());
				break; // we use break because to only  get first non repeating value , if want next value don't give break
			}
		}
	}
}