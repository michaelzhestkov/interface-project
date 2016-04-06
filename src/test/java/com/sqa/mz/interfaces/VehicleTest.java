/**
 *   File Name: VehicleTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.interfaces;

import org.junit.*;

/**
 * VehicleTest //ADDD (description of class)
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
public class VehicleTest {

	@Test
	public void test() {
		IVehicle[] vehicles = { new Boat("1"), new Car("2"), new Train("3"), new Plane("4"), new Boat("Master Cruiser"),
				new Car("Spiky Car"), new Train("Thomas"), new Plane("Jet 123") };
		System.out.println("My vechicles: ");
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("Vehicle " + (i + 1) + ": " + vehicles[i]);
			vehicles[i].moveVehicle();

		}

	}
}
