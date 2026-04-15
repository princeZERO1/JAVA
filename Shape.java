public class Shape{
	public double area(int radius){
		return Math.PI * radius * radius;
	}
	protected double  area(double length,double breadth){
		return length*breadth;
	}
	public static float area(float base, float heigth){
		return 0.5f *base*heigth;
	}
	public static void main(String[] args){
		Shape ob = new Shape();
		System.out.println(ob.area(5));
		System.out.println(ob.area(0.5,1.23));
		System.out.println(ob.area(5.2f,4.7f));
	}
}