
/**
* This is a Priority interface. This is implemented by Process and Task classes
* 
*
* @author Andrew Gordon
* @version 1.0
* CS 131-ON Programming Project Module 2 Program 2
* 1st semester/2021
*/

public interface Priority {

	final int MED_PRIORITY = 5;
	final int MAX_PRIORITY = 10;
	final int MIN_PRIORITY = 1;
	
	public void setPriority(int x);
	
	public int getPriority ();
	
}
