/**
 * This program creates an array of objects, fills its with different flying objects (planes and UAVs) and displays their information.
 * Then uses the copyFlyingObjects() method to create a new array with the same objects as the previous, and displays it. The goal is to 
 * create a new array with new objects, but this program only creates a shallow copy of each.
 */

package driver;

import flyingObject.FlyingObject;
import airplane.Airplane;
import helicopter.Helicopter;
import helicopter.Quadcopter;
import multirotor.Multirotor;
import uav.UAV;
import drones.AgriculturalDrone;
import drones.MAV;

public class DriverPart2 {
	
	/**
	 * Takes an array of objects and creates a shallow copy array 
	 * 
	 * @param x an array of objects
	 * @return the copy array of objects
	 */
	public static FlyingObject[] copyFlyingObjects(FlyingObject[] x) {
		FlyingObject[] newObjects = new FlyingObject[x.length];
		
		for (int i=0; i<newObjects.length; i++) {
			newObjects[i] = x[i];
		}
		return newObjects;
	}

	/**
	 * Runs the whole program for part 2 and displays both array's information.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		FlyingObject[] flyingObjects = new FlyingObject[15];
		flyingObjects[0] = new Airplane();
		flyingObjects[1] = new Airplane ("Air France", 850000, 450);
		Airplane planeToCopy = (Airplane) flyingObjects[1];
		flyingObjects[2] =	new Airplane(planeToCopy);	
		flyingObjects[3] = new Helicopter();
		flyingObjects[4] = new Helicopter("Airbus", 1000000, 800, 6, 2024, 8);
		flyingObjects[5] = new Quadcopter("DJI", 3500.50, 2, 3, 2016, 2, 120);
		Quadcopter quadcopterToCopy = (Quadcopter) flyingObjects[5];
		flyingObjects[6] = new Quadcopter(quadcopterToCopy);
		flyingObjects[7] = new Multirotor();
		flyingObjects[8] = new Multirotor();
		flyingObjects[9] = new UAV();
		flyingObjects[10] = new UAV(35.5, 7700);
		flyingObjects[11] = new AgriculturalDrone(45, 24550.99, "DJI", 40);
		flyingObjects[12] = new AgriculturalDrone(80, 49999, "MavDrones", 100);
		flyingObjects[13] = new MAV();
		flyingObjects[14] = new MAV(0.8, 1200, "MiniPro", 5);
		
		
		System.out.println("First object array:");

		Object[] copyOfFlyingObjects = copyFlyingObjects(flyingObjects);
		for (int i=0; i<flyingObjects.length; i++) {
			System.out.println((i+1) + ".  " + flyingObjects[i]);
		}
		 
		System.out.println("\nSecond object array:");
		
		for (int i=0; i<copyOfFlyingObjects.length; i++) {
			System.out.println((i+1) + ".  " + copyOfFlyingObjects[i]);
		}
		
		Helicopter original = (Helicopter) flyingObjects[3];
		
		Helicopter copy = (Helicopter) copyOfFlyingObjects[3];
		copy.setPrice(9.99);
		
		// To test if the two arrays are independent from each other
		System.out.println("Original object price:\n" + original.getPrice());
		System.out.println("Copy object price:\n" + copy.getPrice());		
	}
	
}
