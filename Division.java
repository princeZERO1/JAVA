//unchecked to  the uncheckeds
public class Division{
	public static void main(String[] args){
		try{
			new Division().divide(10,0);
		}
		catch (Exception e){
			System.out.println("caught "+e);
		}
	}
	public void divide(int a, int b) throws ArithmeticException{
		if(b==0){
			System.out.println("can't divide by zero");
			throw new ArithmeticException();
		}
		else{
			System.out.println(a/b);
		}
	}

}