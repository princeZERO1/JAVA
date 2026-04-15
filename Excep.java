//multiline exception 
// top -- subclass
//bottom -- super class
// in both the same block can applicable
// from Runtime Excetion --> unchecked Exception
//from IOException --> checked Exception
public class Excep{
	public static void main(String[] args){
		System.out.println("multi-catch block");
		try{
			int a = 10/0;
		}
		catch(IndexOutOfBoundsException e){    
			System.out.println("1"+e);           
		}
		catch(NullPointerException e){ //RuntimeException if i give this line the error comes this line rather than goes to last exception , now if i replace this line now the catch block is = subclass -->(Superclass)subclass --> Superclass
			System.out.println("2"+e);
		}
		catch(Exception e){
			System.out.println("3 "+e);
		}
		System.out.println("complete");
	}
}
// in this catch block the first 2 is same and last is superclass

//throw
// keyword , it is uaed to create manual exception(custom exception)

//throws
// keyword , it is used in the method signature