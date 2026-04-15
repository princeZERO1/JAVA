import java.util.*;//in arraylist values also have duplicate values // collection does not store primitive datatypes, in collection method stores data in the form of wrapper class
public class Lab{  //wrapper class means binding the data that means we binding or called as wrapping the object
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(151.22);
		a.add("Java");
		a.add('S');
		a.add(true);
		a.add(1,"python");//this line replace the 1st index and the data in goes to the next index 
		System.out.println(a);
		int len = a.size();
		System.out.println(len);
		System.out.println(a.get(2));
		a.remove(1);
		System.out.println(a);
		if(a.contains("python")){
			System.out.println("present in the list");
		}
		else{
			System.out.println("not present in the list");
		}
		
	}
}
//Datatypes    Classes
// Primitive   Wrapper class
// int -->     Integer
// flaot  -->  Flaot
//double  -->  Double
//char    -->  Character
//boolean -->  Boolean
//String --> String
//In class we store object value