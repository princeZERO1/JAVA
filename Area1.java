abstract class area{
	public abstract double circle(int radius);
	public abstract double rectangle(int a,int b);
}
public class Area1 extends area{
	public double circle(int radius){
		return Math.PI*radius*radius;
	}
	public double rectangle(int a,int b){
		return a*b;
	}
	public static void main(String[] args){
		Area1 ob = new Area1();
		System.out.println(ob.circle(4));
		System.out.println(ob.rectangle(7,7));
	}
}
