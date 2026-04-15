//multiple inheritance , extends only access only one class but implements can access n number of classes
interface Additon{
	public abstract int add(int a,int b);
}
interface Subtraction{
	public abstract int sub(int a,int b);
}
public class Calculator implements Additon,Subtraction{
	public int add(int a,int b){  //overridden method
		return a+b;
	}
	public int sub(int a,int b){  //overridden
		return a-b;
	}
	public static void main(String[] args){
		Calculator ob = new Calculator();
		System.out.println(ob.add(10,10));
		System.out.println(ob.sub(100,10));
	}
}