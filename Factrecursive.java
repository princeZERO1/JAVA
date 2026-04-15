import java.util.Scanner;
public class Factrecursive{//instead of n!=n*n-1*n-2___n*n==> n*(n-1)!=ex = 4*3! we use in this recursive ===> f(n)=n*f(n-1)
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(num(n));
	}
	public static int num(int n){// we going to return the value ,so not void
		if(n==0 || n==1)
			return 1;
		return n*num(n-1);// recursive call---> 4*num(3)=>3*num(2)=>2*num(1)=>1 now condition is true now value 1 goes from bottom to up 
		
	}// 4*num(3)=>3*num(2)=>2*num(1)=>1 --> 1= 2*1=2-> 2*3=6-> 4*6->24
}