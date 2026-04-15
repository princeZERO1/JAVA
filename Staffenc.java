class Manager{// this is a function
	private int Salary=5000;
	public void display(){
		System.out.println(Salary);
	}
}
public class Staffenc{
	public static void main(String[] args){
		Manager ob =new Manager();
		//System.out.println(ob.Salary); cannot get the output because it is in private so we using a indirect method like in 3 line
		ob.display();
	}
}
// THIS IS A ENCAPSULATION --> for Encaosulation we use Setter() & getter()