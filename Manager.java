class Employee{
	int salary;  //variable
	public Employee(int salary){  //constructor // default accessmodifier is = void getBonus there is no keyword in front of the defining
		this.salary=salary;
	}
	public void getBonus(){   //function    , if you want to put final keyword format is put in front of the return type like this = public Final void getBonus()
		System.out.println("Employee bonus:"+0.10*salary);
	}

}
public class Manager extends Employee{
	int salary;   //variable	public Manager(int empsalary, int salary){   //constructor
		super(empsalary);
		this.salary=salary;
	}   
	public void getBonus(){   // overridden method (funcyion)
		super.getBonus(); //super() only use in non-static method  cannot use static even in main function -- super() of means it calls the constructor, super calls the data in super class method
		System.out.println("Manager bonus:"+0.20*salary);
	}
	public static void main(String[] args){  //main function
		Manager ob = new Manager(50900,70500);
		ob.getBonus();
	}

}
// for method overloading we also called it as --> compile time polymorptison
// for method overridden we also called it as --> run time polymorptison