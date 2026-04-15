public class Department{
	public Department(){ // constructor // constructor calls only one object at a time 
		System.out.print("ECE");
	}
	public Department(int a){
		System.out.println(a);//parameterised constructor
	}
	public void display(int a,int b){// method
		System.out.println(a+b);
	}
	public static void main(String[] args){
		Department ob = new Department(10);// constructor caling when object is create // when it goes to 5th line because i give the value , if no value it goes to 2 line
		Department ob1 = new Department();
		ob.display(10,3);
	}
}
