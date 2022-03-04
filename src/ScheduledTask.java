
import java.util.TimerTask;
import java.util.Date;
/**
 * 
 * @author Dhinakaran P.
 */
// Create a class extends with TimerTask
public class ScheduledTask extends TimerTask {

	Date now; // to display current time
    int taskID;
    ScheduledTask(int id) {
        taskID = id;
    }
	// Add your task here
	public void run() {
		now = new Date(); // initialize date
		System.out.println(taskID + " :Time is :" + now); // Display current time
	}
}
