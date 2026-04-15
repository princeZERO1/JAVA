import java.util.Scanner;
public class Armstrongnumb{
	public static void main(String[] args){
		for (int n=1;n<=999;n++){
			if(disp(n))
				System.out.print(n+" ");
		}
	}
	public static boolean disp(int n){
		int sum=0;
		int e=digitcount(n);
		int temp = n;
		while(n>0){
			int b=n%10;
			sum = sum+power(b,e);
			n=n/10;
		}
		return temp==sum;
	}

	public static int digitcount(int n){
		int count=0;
		while(n>0){
			n=n/10;
			count++;
		}
		return count;		
	}
	public static int power(int b, int e){
		int pow =1;
		for(int i=1;i<=e;i++){
			pow = pow*b;
		}
		return pow;
	}
}				  	 	 		  																																																									