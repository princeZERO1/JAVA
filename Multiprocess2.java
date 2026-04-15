public class Multiprocess2 extends Thread{
	public void run(){       // runnable and running state
		for(int i=1;i<=5;i++){
			Thread t = Thread.currentThread();
			String str = t.getName();  // getName = is to give which thread is execute it automatically take from thread 0 to thread n it only works if not put setName , if you give setName it goes to getNameof user defined
			System.out.println(str+" "+i);
		}
	}
	public static void main(String[] args){
		Multiprocess2 ob = new Multiprocess2();//Thread , singlelevel thread more than one is called multithread
		Multiprocess2 ob2 = new Multiprocess2();//from this line is called Multithread
		Multiprocess2 ob3 = new Multiprocess2();
		ob.setName("C");
		ob2.setName("Java");
		ob3.setName("Python");
		ob.setPriority(Thread.MAX_PRIORITY); // max priority value is 10
		ob2.setPriority(Thread.MIN_PRIORITY);// min priority value is 1
		ob3.setPriority(Thread.NORM_PRIORITY);// norm priority value is 5
		System.out.println(ob.getPriority());
		System.out.println(ob2.getPriority());
		System.out.println(ob3.getPriority());
		ob.start();// start state calls run method
		ob2.start();
		ob3.start();
	}
}
