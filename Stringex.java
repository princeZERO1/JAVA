// next=only take the word
// nextLine= it takes both word and sentence
// charAt()--> put in or index value in the oprn bracket
// length() = is used to fint the length of the string , Function=length()--> to find the length of the string,Keywoard=length --> to find the length of the array
import java.util.Scanner;
public class Stringex{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
		//String str = s.next();
		char ch = str.charAt(2);
		String str = str.concat(" ECE"); 
		System.out.print(str);
		System.out.println();
		System.out.print(ch);
	}
}