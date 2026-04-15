import java.util.Scanner;
public class Calcu {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		//Calcu c = new Calcu(); for non static
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Operators:");
		char ch = s.next().charAt(0);
		display(a,b,ch);//c.display(a,b,ch); for non static
		
		
	}
	//public void display(int a, int b,char ch){ //for non static
	public static void display(int a, int b,char ch){
		int output=0;
		if (ch =='+'){
			output = a+b;
		}
		else if (ch =='-'){
			output = a-b;
		}
		else if (ch == '*'){
			output = a*b;
		}
		else if(ch == '%'){
			output = a%b;
		}
		else if (ch == '/'){
			output = a/b;
		}
		System.out.println(output);
		
	}
}