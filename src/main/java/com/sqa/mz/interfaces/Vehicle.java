/**
 *   File Name: Vehicle.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.interfaces;

/**
 * Vehicle //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Zhestkov, Michael
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Vehicle implements IVehicle {
	private String name = "Plain Vehicle";

	/**
	 * @see com.sqa.mz.interfaces.IVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @see com.sqa.mz.interfaces.IVehicle#moveVehicle()
	 */
	@Override
	public boolean moveVehicle() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see com.sqa.mz.interfaces.IVehicle#stopVehicle()
	 */
	@Override
	public double stopVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}

}
