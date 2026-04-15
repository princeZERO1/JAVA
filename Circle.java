interface Shape{
	double area(int radius);// this is abstract , becasue th interface takes the public astract, even if there is no public keyword just void area() it takes as public astract
	int a=10;  //it takes as public static final int a = 10; 
}
public class Circle implements Shape{// if i put final in returntype is final method // if i put final in datatype is final variable
	public double area(int radius){
		return Math.PI*radius*radius;
	}
	public static void main(String[] args){
		//Shape ob = new Shape(); // errr will come for shape because interface dont accept object
		Circle ob = new Circle();
		System.out.println(ob.area(7));
		System.out.println(Shape.a); // interface name . varable name // if didnt give classname=shape just calls 'a' it gives because it user definied variable 
	}
}
//static = calls from class.variable
//non static = calls from class.object