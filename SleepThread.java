public class SleepThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(5000);// show the output 5 sec delay
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			Thread t = Thread.currentThread();
			String s =t.getName();
			System.out.println(s+" "+i);
		}
	}
	public static void main(String[] args){
		SleepThread st1 =new SleepThread();
		SleepThread st2 =new SleepThread();
		SleepThread st3 =new SleepThread();
		st1.start();
		try{
			st1.join(25000);// join method is used to set a one to do first and hold the rest of the thread. join method can have time also that means we can delay or modify
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		st2.start();
		st3.start();
	}
}
// if i give 15 sec the st 1 only give first 3 values and will give rest the unorder because in sleep we give rach unit have to display 5 sec , if i give jain = 25 sec the first 5 will come without the thread complex