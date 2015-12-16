package org.usfirst.frc.team1124.robot.system;

import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class PDP_Monitor {
	private static PowerDistributionPanel pdp;
	
	public PDP_Monitor(){
		pdp = new PowerDistributionPanel();
	}
	
	/**
	 * Get the currents from all ports.
	 * @return Double Array of currents
	 */
	protected double[] getCurrents(){
		double[] currents = new double[16];
		
		for(int i = 0; i < currents.length; i++){
			currents[i] = pdp.getCurrent(i);
		}
		
		return currents;
	}
	
	// power distribution panel statistics
	
	protected double getTemp(){
		return pdp.getTemperature();
	}
	
	protected double getVoltage(){
		return pdp.getVoltage();
	}
	
	// total statistics
	
	protected double totalCurrent(){
		return pdp.getTotalCurrent();
	}
	
	protected double totalEnergy(){
		return pdp.getTotalEnergy();
	}
	
	protected double totalPower(){
		return pdp.getTotalPower();
	}
	
	// resets
	
	protected void resetTotalEnergy(){
		pdp.resetTotalEnergy();
	}
	
	protected void clearFaults(){
		pdp.clearStickyFaults();
	}
}
