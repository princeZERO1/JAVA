import java.util.Scanner;
public class Fizzbuzz{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		num(n);
	}
	public static void num(int n){
		for (int i =1;i<=n;i++){
			if (i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else if (i%3==0){	
				System.out.println("Fizz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}