/**
 * 
 */
package edu.fiu.rover;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author josey
 *
 */
public class Trexrover implements SelfCheckCapable {

	private static final String Trexrover = null;
	Trexrover myNasa;
	
	public Trexrover() {
		
	}
	@Override 
	public String getComponentName() {
		// TODO Auto-generated method stub
		return Trexrover;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trexrover myrover = new Trexrover();
		myrover.runSelfCheck();
		myrover.missionreceived();
	}
	private void missionreceived() {
		// TODO Auto-generated method stub
		myrover.missionacknoledged();
	}
	private static void Trexrover() {
		// TODO Auto-generated method stub
		
	}

}
