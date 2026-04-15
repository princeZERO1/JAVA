//Final Keyword 
// final class count be inherited
// final variable maens it can't able to reassign the values
//final method count be overridden

//final class Students{
class Students{
	public void add(int a, int b){
		System.out.println(a+b);
    }
}
public class Departmentece extends Students {
	public static void main(String[] args){
		Departmentece ob = new Departmentece();
		ob.add(7,7);
	}
}