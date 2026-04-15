class Student{
	public void add(int a,int b){
		System.out.println(a+b);
	}
}
public class Multiprocess4 extends Student implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++){
			Thread t = Thread.currentThread();
			String str = t.getName();
			System.out.println(str+" "+i);
		}
	}
	public static void main(String[] args){
		Multiprocess4 ob = new Multiprocess4();
		Multiprocess4 ob2 = new Multiprocess4();
		Multiprocess4 ob3 = new Multiprocess4();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);
		t1.start();
		t2.start();
		t3.start();
		
    }
}                          
