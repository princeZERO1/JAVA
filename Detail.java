class Nameage{
	private String name;
	private int age;
	public void setName(String name){
		if(name!=null && !name.isEmpty()){
			this.name=name;
		}
		else{
			System.out.println("Invalid data");
		}
	}
	public void setAge(int age){
		if(age>0)
			this.age=age;
		else
			System.out.println("Invalid age");
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class Detail{
	public static void main(String[] args){
		Nameage ob = new Nameage();
		ob.setName("rave");
		ob.setAge(16);
		System.out.println("Student Name: " +ob.getName()+" Age:" +ob.getAge());
	}
}