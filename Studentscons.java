//create student class  with name,markand age object and add display()method
public class Studentscons{
	String name;
	int age;
	float marks;
	public Studentscons(String name,int age,float marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void display(){
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Marks: " +marks);
	}
	public static void main(String[] args){
		Studentscons s1 = new Studentscons("Raj",21,70.7f);
		Studentscons s2 = new Studentscons("Rave",21,76.7f);
		Studentscons s3 = new Studentscons("Ravi",21,79.7f);
		s1.display();
		s2.display();
		s3.display();
	}
	
}