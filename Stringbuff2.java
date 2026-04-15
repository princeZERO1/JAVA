import java.util.Scanner;//example of StringBuffer is mutable
public class Stringbuff2{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("students");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String s ="ECE";// example of String is immutable it gives output as ECE 2 times not concat the students
		System.out.println(s);
		s.concat(" Students");// concat is non static
		System.out.println(s);
	}
}