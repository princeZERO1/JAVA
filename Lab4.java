import java.util.*;
public class Lab4{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<>(); // if i didn't give the capacity value in the last '()' the default value it take it as 10
		System.out.println(v.capacity()); //10
		System.out.println(v.size()); // the initial size value is 0
		for(int i=1;i<=10;i++){
			v.add(i);
		}
		System.out.println(v.capacity());  //10
		System.out.println(v.size()); //10
		v.add(11);
		System.out.println("after update: "+v.capacity()); //20
		System.out.println(v.size()); //11
	}
}