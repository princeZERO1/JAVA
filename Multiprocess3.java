public class Multiprocess3 implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++){
			Thread t = Thread.currentThread();
			String str = t.getName();
			System.out.println(str+" "+i);
		}
	}
	public static void main(String[] args){
		Multiprocess3 ob = new Multiprocess3();
		Multiprocess3 ob2 = new Multiprocess3();
		Multiprocess3 ob3 = new Multiprocess3();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);
		t1.start();
		t2.start();
		t3.start();
    }
}                         
