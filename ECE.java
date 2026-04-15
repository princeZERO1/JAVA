//----Exception Handling----
//Exception --> during runtime occurs
// Exception is also predefined class
public class ECE{
public static void main(String[] args){
	System.out.println("Students");
//	int k = 7/0;  //Exception  ----> it gives error
	try {
		int k = 7/0;  // if we put int k 7/2; there is no exception , it there is no exception in try block it will never go to the catch
	}
	catch(Exception e){
		System.out.println("Caught"+e); 
	}
	finally{ // finally is a optional
		System.out.println("Hello");
	}
	System.out.println("college"); // due to exception previous line in line 7 so this line didnt print, thats why we use try and catch
	}
}
//try
//it is a keyword
//inside the try block, exception must be written 

//catch(Exception e)
//* whatecer exception i will get inside the try block , that exception must be caught inside catch block


//Object <---- Throwable <---- Exception <----RuntimeException <----Arithmetic <--- NullPointsException <---IndexOutofBoundsException <---- ArrayIndexOutofBoundsException<--- StringIndexOutofBoundsException
                                   //^
								   //|
								   //IOException
								   //^
								   //|
								   //FileNotFoundException
								   