import java.util.Scanner;
public class Sumofdigit{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		sum(n);
	}
	public static void sum(int n){
		int count = 0;
		while(n>0){
			int con = n%10;//extract the last digit
			count+=con;// store and add last to first digit
			n=n/10;// now the last digit is delete and goes to the loop again and again it will do for the remaining value till '0'
			
		}
		System.out.println(count);
	}
}