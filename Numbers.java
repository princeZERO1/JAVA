abstract class Mathematics{ // overloading the parameters are same and fpr overridden the parameters are different
	public void add(int a,int b){  // normal method
		System.out.println(a+b);
	}
	public abstract int multiply(int a,int b); // Abstract method // if we put definition the abstract it come error so just declare
}
//public class Numbers { 
public class Numbers extends Mathematics { // Inheritanca method
    public int multiply(int a,int b){  // overridden method 
	
		return a*b;
	}
	public static void main(String[] args){
		//Mathematics ob = new Mathematics(); if you create a object for a abstract class this line gives error thats why we use inheritance
		Numbers ob = new Numbers();
		System.out.println(ob.multiply(7,7));
		ob.add(7,7);
	}
}