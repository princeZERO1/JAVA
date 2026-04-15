public class Recursiondemo{
	public static void main(String[] args){
		System.out.println(display(10,10));
	}
	public static int display(int a, int b){
		if(a>0 && b>0){
			return 3+display(2,0)+display(0,b-5);
		}
		return a+b;
	}
}