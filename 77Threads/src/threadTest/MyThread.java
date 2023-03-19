package threadTest;

public class MyThread extends Thread{

	@Override
	public void run() {
		
		if(this.isDaemon()) {
			System.out.println("This thread is a daemon thread that is running.");
		} else {
			System.out.println("This thread is a user thread that is running.");
		}
	}
}
