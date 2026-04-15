public class Multiprocess1 extends Thread{
	public void run(){       // runnable and running state
		for(int i=1;i<=5;i++){
			Thread t = Thread.currentThread();
			String str = t.getName();  // getName = is to give which thread is execute it automatically take from thread 0 to thread n it only works if not put setName , if you give setName it goes to getNameof user defined
			System.out.println(str+" "+i);
		}
	}
	public static void main(String[] args){
		Multiprocess1 ob = new Multiprocess1();//Thread , singlelevel thread more than one is called multithread
		Multiprocess1 ob2 = new Multiprocess1();//from this line is called Multithread
		Multiprocess1 ob3 = new Multiprocess1();
		ob.setName("C");
		ob2.setName("Java");
		ob3.setName("Python");
		ob.start();// start state calls run method
		ob2.start();
		ob3.start();
	}
}
