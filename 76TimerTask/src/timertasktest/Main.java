package timertasktest;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {

		//Timer - A facility for threads to schedule tasks
		//			for future execution in a background thread
		
		//TimerTask - A task that can be scheduled for one-time
		//			or repeated execution by a timer
		
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			
			@Override
			public void run() {
				if(counter>0) {
					
					System.out.println(counter + " seconds");
					counter--;
				} else {
		
					System.out.println("Task Complete!");
					timer.cancel();	//stops the clock
				}
			}
		};
		
		
		//setup date
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2023);
		date.set(Calendar.MONTH,Calendar.MARCH);
		date.set(Calendar.DAY_OF_MONTH,19);
		date.set(Calendar.HOUR_OF_DAY,16);	//24 hour format
		date.set(Calendar.MINUTE,29);
		date.set(Calendar.SECOND,20);
		date.set(Calendar.MILLISECOND,0);
		
		//timer.schedule(task, 0); 									// 0 is milliseconds; can also be a date
		//timer.schedule(task, date.getTime());						// task will run on the set date
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);		// task will start running on set date every 1000 millisecond
		//timer.scheduleAtFixedRate(task, 0, 1000);					// task will run every 1000 millisecond
	}

}
