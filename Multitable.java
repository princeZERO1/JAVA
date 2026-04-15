import java.util.Scanner;
public class Multitable{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		multi (n);
		
	}
	public static void multi(int n){
		for (int i=1;i<=10;i++){
			System.out.println(n+"x"+i+"="+(n*i) );
		}
	}
}