import java.util.Scanner;
public class Reversestr{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the string: ");
	    String str = s.nextLine();
	    reverse(str);
	}
	public static void reverse(String str){
		String rev="";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			 rev = ch + rev;
			 
		}
		System.out.print("Reverse string: " +rev);//String is acts as class so it not consider as datatype thats why we didn't use "==" in loop, Object is a unknown value both rev and str objects 		
		System.out.println();
		if(str.equals(rev)){//you can write as also --> rev.equals(str)
			System.out.print("The String is Palindrome: " +str);
		}
		else{
			System.out.print("The String is not Palindrome: " +str + " = " + rev);
		}
	}
}