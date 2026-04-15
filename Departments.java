class Multiply{
    public synchronized void multiplication(int n){
	    for (int i=1;i<=5;i++){
		    System.out.println(i*n);
		}
	}
} 
class ECE extends Thread{
	Multiply ob;
	public ECE(Multiply ob){
		this.ob=ob;
	}
	public void run(){
		ob.multiplication(5);
	}
}
class CSE extends Thread{
	Multiply ob;
	public CSE(Multiply ob){// constructor
		this.ob=ob;
	}
	public void run(){
		ob.multiplication(100);
	}
}
public class Departments{
	public static void main(String[] args){
		Multiply ob = new Multiply();
		ECE e = new ECE(ob);
		CSE s = new CSE(ob);
		e.start();
		s.start();
	}
}