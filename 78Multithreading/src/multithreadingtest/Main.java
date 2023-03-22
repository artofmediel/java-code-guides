package multithreadingtest;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//multithreading = process of executing multiple threads simultaneously
		//					helps maximum utilization of CPU
		//					Threads are independent, they don't affect the execution of other threads
		//					An exception in one thread will not interrupt other threads.
		//					useful for serving multiple clients, multiplayer games, or other mutually independent tasks 

		//to make a thread
		//create a subclass of thread
		MyThread thread1 = new MyThread();
		
		//or implement runnable interface and pass that instance as an argument to Thread()
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//-----------------------test if Deamon : doesn't seem to work on my machine but still throw the exception at the right time
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		//CHATGPT responded:
		/*
		 * When the main thread is stopped by an unhandled exception, 
		 * all remaining non-daemon threads are stopped as well. However, 
		 * daemon threads are not guaranteed to stop immediately when the
		 * main thread terminates abruptly due to an unhandled exception
		 * or other reasons like System.exit() method. Instead, they 
		 * will stop running as soon as they complete their current task or are interrupted.
		 * 
		 */
		
		
		thread1.start();
		//thread1.join(3000);	//calling thread (ex.main) waits until the specified thread dies or for milliseconds
		thread2.start();

		//try causing and error by dividing a number to 0
		System.out.println(1/0);
		
		
		
	}

}
