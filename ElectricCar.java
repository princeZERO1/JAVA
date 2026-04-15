//default inheritance --> object==> root class acts as superclass for first class in the program
class Vehicle{
	String brand;      //variable
	public Vehicle(String brand){  //constructor
		this.brand=brand;
	}
	public void getBrand(){    //function
		System.out.println(brand);
	}
}
class Car extends Vehicle{
	String fueltype;           //variable 
	public Car(String brand,String fueltype){       //constructor
		super(brand);
		this.fueltype=fueltype;
		
	}
	public void getFuelType(){      //function
		System.out.println(fueltype);
	}
}
public class ElectricCar extends Car{
	int battery;        //variable
	public ElectricCar(String brand,String fueltype,int battery){   //constructor
		super(brand,fueltype);
		this.battery=battery;
	}
	public void getBattery(){      //function
		System.out.println(battery+"kvh");
	}
	public static void main(String[] args){
		ElectricCar ob =new ElectricCar("FORD","ELECTRIC",18);
		ob.getBrand();
		ob.getFuelType();
		ob.getBattery();
	}
}