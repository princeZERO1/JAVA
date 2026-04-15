//Nullpoints exception
public class Nullexcep{
	int a =10;
	public static void main(String[] args){
		Nullexcep ob = new Nullexcep();
		System.out.println(ob.a);
		ob = null;
		//System.out.println(ob.a); // this line give error 
		try{
			System.out.println(ob.a);
		}
		catch (Exception e){
			System.out.println("caugth:"+e);
		}
		System.out.println("complete");
	}
}