//create student class  with name,markand age object and add display()method
public class Studentsobject{
	String name;
	int age;
	float marks;
	static int count=0;
	public Studentsobject(String name,int age,float marks){
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
		Studentsobject s1 = new Studentsobject("Raj",21,70.7f);
		Studentsobject s2 = new Studentsobject("Rave",21,76.7f);
		Studentsobject s3 = new Studentsobject("Ravi",21,79.7f);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("Number of objects created:" + count);
	}
	
}