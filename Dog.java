class Animal{// members--> is variable and method // This is a Superclass
	public void makeSound(){
		System.out.println("Animal makes noise");
	}
}
public class Dog extends Animal{//This is a Subclass // first main check subclass and it goes to supercalss , it not directly goes to superclass
	public void bark(){
		System.out.println("Barking");
	}
	public static void main(String[] args){//subclass object can be access to superclass
		Dog d =new Dog();
		d.makeSound();	
		d.bark();
	}
}