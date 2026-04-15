import java.util.*;
public class Lab5{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>(
		Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<String> list1 = new ArrayList<>(
		Arrays.asList("ECE","EEE","CSE","IT"));
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.print(list);
		System.out.println();
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		System.out.print(list1);
	}
}