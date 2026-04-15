import java.util.*;
public class Lab2{
	public static void main(String[] args){//we using generic term <> we defining the datatype
		ArrayList<Integer> a = new ArrayList<>();//right side this symbol is optional <>
		a.add(10);
		a.add(20);
		a.add(30);
		//a.add("students"); //if i give string value instead of integer the error will come
		System.out.println(a);
		for(Integer i :a){//for each loop
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("for loop");
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i)+" ");
		}
		System.out.println();
		System.out.println("Iteration");//(interface)
		Iterator it = a.iterator(); //Iterator = interface, iterator = method 
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}
}
// for remove the square brackets from the output
// we using 3 methods
//for each loop
// with the help of index (for loop)
//Iteration(interface) 