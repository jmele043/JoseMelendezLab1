/**
 * 
 */
package edu.fiu.rover;

/**
 * @author josey
 *
 */
public class myrover {

	private static Object leavedockstation();

	public static void missionacknoledged() {
		// TODO Auto-generated method stub
		myrover.performsystemcheck();
	}

	private static void performsystemcheck() {
		// TODO Auto-generated method stub
		myrover.selfdrivingmodeactivated();
	}

	private static void selfdrivingmodeactivated() {
		// TODO Auto-generated method stub
		myrover.leavedockstation();
		mysensor.activateobstacleavoidance();
	}

}
