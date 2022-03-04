import java.util.Timer;
import java.util.*;

/**
 * 
 * @author Dhinakaran P.
 */

//Main class
public class SchedulerMain {
	public static void main(String args[]) throws InterruptedException {
        
		int len = 10;
		List<Timer> timeList = new ArrayList<>();
		for(int i = 0; i < len; i++) {
			Timer time = new Timer();
			timeList.add(time);
		}
		for(int i = 0; i < len; i++) {
			ScheduledTask st = new ScheduledTask(i);
			timeList.get(i).schedule(st, 0, 1000); 
		}
		//Timer time = new Timer(); // Instantiate Timer Object
		 // Instantiate SheduledTask class
		// Create Repetitively task for every 1 secs

		//for demo only.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}