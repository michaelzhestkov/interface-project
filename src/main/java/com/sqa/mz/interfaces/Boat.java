/**
 *   File Name: Boat.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.interfaces;

/**
 * Boat //ADDD (description of class)
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
public class Boat implements IVehicle, ICruise {
	private String name = "Plain Boat";
	private double waterDepth;

	public Boat() {

	}

	public Boat(String name) {
		setName(name);
	}

	/**
	 * @see com.sqa.mz.interfaces.IVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.mz.interfaces.ICruise#cruise()
	 */
	@Override
	public boolean cruise() {
		if (this.waterDepth > .5) {
			System.out.println("The boat is gliding on water.");
		} else {
			System.out.println("This boat is gonna sink!");
		}
		return true;
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
		System.out.println("PutPutPut");
		cruise();
		return true;
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

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass().getSimpleName() + " - \"" + getName() + "\"");
		return stringBuilder.toString();
	}

}
