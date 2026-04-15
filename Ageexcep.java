class InsufficientAgeException extends Exception{
	public InsufficientAgeException(String str){
		super(str);
	}
}
class Agerange{
	private int age;
	public void setAge(int Age) throws InsufficientAgeException{
		if(Age>0){
			this.age = Age;
			System.out.println("Correct age");
		}
		else
			throw new InsufficientAgeException("Insufficient Age");
	}
	public int getAge(){
		return age;
	}
}
public class Ageexcep{
	public static void main(String[] args){
		Agerange ob = new Agerange();
		
		try{
			ob.setAge(18);
			ob.setAge(-1);
		}
		catch(Exception e){
			System.out.println("caught "+e);
		}
		System.out.println(ob.getAge());
	}
}