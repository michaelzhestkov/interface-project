/**
 *   File Name: Plane.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.interfaces;

/**
 * Plane //ADDD (description of class)
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
public class Plane implements IVehicle, IFlyingOBJECT {

	private String name = "Plain Plane";

	public Plane() {

	}

	public Plane(String name) {
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
	 * @see com.sqa.mz.interfaces.IFlyingOBJECT#fly()
	 */
	@Override
	public boolean fly() {
		System.out.println("Plane is flying high");
		return false;
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
		System.out.println("Zoooom");
		fly();
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
