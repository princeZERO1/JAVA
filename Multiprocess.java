public class Multiprocess extends Thread{
	public void run(){       // runnable and running state
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		Multiprocess ob = new Multiprocess();//Thread , singlelevel thread more than one is called multithread
		Multiprocess ob2 = new Multiprocess();//from this line is called Multithread
		Multiprocess ob3 = new Multiprocess();
		ob.start();// start state calls run method
		ob2.start();
		ob3.start();
	}
}