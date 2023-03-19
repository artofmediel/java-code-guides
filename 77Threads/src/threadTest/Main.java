package threadTest;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * thread = a thread of execution in a program (kind of like a virtual CPU)
		 * The JVM allows an application to have multiple threads running concurrently
		 * Each thread can execute parts of your code in parallel with the main thread
		 * each thread has a priority
		 * Threads with higher priority are executed in preference compared to threads with a lower priority
		 * 
		 * the Java Virtual Machine continues to execute threads until either of the following occurs
		 * 	1. the exit method of class Runtime has been called
		 * 	2. All user threads have died
		 * 
		 * When a JVM starts up, there is a thread which calls the main method
		 * This thread is called "main"
		 * 
		 * Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
		 * JVM terminates itself when all user threads (non-daemon threads) finish their execution
		 */
		
		//System.out.println(Thread.activeCount());						//shows thread count thats is currently running
		//Thread.currentThread().setName("MainWIRUTHREADLOLOLOL");		//set name for thread
		//System.out.println(Thread.currentThread().getName());			//returns the name of thread
		
		//Thread.currentThread().setPriority(10);						//setting thread priority
		//System.out.println(Thread.currentThread().getPriority());		// 5 is default ; scaling of priority is 1 - 10 ; 10 being the highest
		
		//System.out.println(Thread.currentThread().isAlive());			//checks if thread is alive
		
		/*for(int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("You are done.");
		*/
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(false);
		System.out.println(thread2.isDaemon());
		
		thread2.start();
		
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("wiru 2nd thread");
		//System.out.println(thread2.getName());
		
		//Thread.currentThread().setPriority(5);
		//thread2.setPriority(5);
		//System.out.println(thread2.getPriority());						//this also inherits the priority of the thread that created it
		
		//System.out.println(Thread.activeCount());	
	}

}
