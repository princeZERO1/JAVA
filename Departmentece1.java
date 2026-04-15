public class Departmentece1{
	public static final int a=10;
	public static void main(String[] args){
		System.out.println(a);
		a=10;
		System.out.println(a);
	}
}
// error will come due to reassign from final so just delete the void the output come 
// immutable class is cannot change the final data
// ---Abstract---
// Abstract is a keyword, it used in front of class keyword
// we cannot able to create an object for abstract claas, so abstract class must be inherited
// Abstract class can have normal method as well as abstract method 
// static and final keyword never comes with abstract keyword
// If abstract class have abstract method, those abstract method must be overridden
// abstract method must be declared but not defined
// concrete=(normal class)class cannot have abstract method

//---Interface---
//Interface is a keyword, it used instead of class keyword
//we cannot able to create an object for interfaec, so interfaec must be inherited 
//interface can have only abstract method alone 
// In interface,all variables by default public static fianl
//In interface, all methods by defaultpublic abstract
//All the methods from an in terface must be overridden

//===Inheritance rule===
//class to claas ---> extends
//interface to interface ---> extends
//class to interface--> implements