public class ECEstudents{
	public ECEstudents(String name){
		this();
		System.out.println("parameterized constructor");
		System.out.println(name);
	}
	public ECEstudents(){
		System.out.println("default constructor");
	}
	public static void main(String[] args){
		ECEstudents ob = new ECEstudents("ECE");
	}
}