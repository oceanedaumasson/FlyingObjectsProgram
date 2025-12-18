/**
 * Written by Oceane Daumasson - 40275138
 * COMP249
 * Assignment 1, Part I
 * Due October 17
 * 
 * This program creates and displays multiple flying objects from 7 different classes, some inheriting from each other, some in different packages.
 * It creates an array of objects, fills it with different flying objects (planes and UAVs) and displays their information + checks for equality.
 * Then creates a second array (with no UAVs) and displays it. Then finds least and most expensive UAVs in both arrays using a separate method.
 */

package driver;
import java.util.Scanner;

import flyingObject.FlyingObject;
import airplane.Airplane;
import helicopter.Helicopter;
import helicopter.Quadcopter;
import multirotor.Multirotor;
import uav.UAV;
import drones.AgriculturalDrone;
import drones.MAV;

public class DriverPart1 {
	
	/**
	 * Runs the whole program for part 1, gets user input from scanner and displays desired information.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		
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
		
		for (int i=0; i<flyingObjects.length; i++) {
			System.out.println((i+1) + ".  " + flyingObjects[i]);
		}
		
		if (flyingObjects[1].equals(flyingObjects[2]))
			System.out.println("The two objects (2 and 3) are equal.");
		else 
			System.out.println("The two objects (1 and 3) are not equal.");		
		
		if (flyingObjects[4].equals(flyingObjects[6]))
			System.out.println("The two objects (5 and 7) are equal.");
		else 
			System.out.println("The two objects (5 and 7) are not equal.");		
	
		if (flyingObjects[0].equals(flyingObjects[3]))
			System.out.println("The two objects (1 and 4) are equal.");
		else 
			System.out.println("The two objects (1 and 4) are not equal.");		
		
		if (flyingObjects[5].equals(flyingObjects[12]))
			System.out.println("The two objects (6 and 13) are equal.");
		else 
			System.out.println("The two objects (6 and 13) are not equal.");		
		
		System.out.println();

		FlyingObject[] nonUAVFlyingObjects = new FlyingObject[15];
		nonUAVFlyingObjects[0] = new Airplane();
		nonUAVFlyingObjects[1] = new Airplane("Aer Lingus", 665000.89, 400);
		nonUAVFlyingObjects[2] = new Airplane("Air France", 900000, 400);
		planeToCopy = (Airplane) nonUAVFlyingObjects[2];
		nonUAVFlyingObjects[3] = new Airplane(planeToCopy);
		nonUAVFlyingObjects[4] = new Helicopter();
		nonUAVFlyingObjects[5] = new Helicopter();
		nonUAVFlyingObjects[6] = new Helicopter("Boeing", 349000.99, 215, 4, 2015, 3);
		nonUAVFlyingObjects[7] = new Helicopter("Boeing", 220000, 180, 4, 2013, 2);
		nonUAVFlyingObjects[8] = new Quadcopter();
		nonUAVFlyingObjects[9] = new Quadcopter("DJI", 4999.99, 5, 4, 2022, 3, 156); 
		nonUAVFlyingObjects[10] = new Quadcopter("Parrot", 2500, 2, 2, 2020, 2, 100);
		nonUAVFlyingObjects[11] = new Multirotor();
		nonUAVFlyingObjects[12] = new Multirotor();
		nonUAVFlyingObjects[13] = new Multirotor("TMotor", 89000.99, 140, 4, 2025, 2, 4);
		Multirotor multirotorToCopy = (Multirotor) nonUAVFlyingObjects[13];
		nonUAVFlyingObjects[14] = new Multirotor(multirotorToCopy);
		
		System.out.println("From the first array:");
		findLeastAndMostExpensiveUAV(flyingObjects);
		
		System.out.println("\nFrom the second array:");
		findLeastAndMostExpensiveUAV(nonUAVFlyingObjects);
		
		keyIn.close();
	}
	
	/**
	 * Takes an array of objects, looks for the UAV objects and displays the least and most expensive ones. Displays a message if no UAVs are found.
	 * 
	 * @param x an array of objects
	 */
	public static void findLeastAndMostExpensiveUAV(FlyingObject[] x) {
		UAV leastExpensive = null;
		UAV mostExpensive = null;

		for (int i=0; i<x.length; i++) {
			if (x[i] instanceof UAV) {
				UAV thisUAV = (UAV) x[i];
				
				if (leastExpensive == null || mostExpensive == null) {
					leastExpensive = thisUAV;
					mostExpensive = thisUAV;
				}
				else {
					if (thisUAV.getPrice() < leastExpensive.getPrice())
						leastExpensive = thisUAV;
					if (thisUAV.getPrice() > mostExpensive.getPrice())
						mostExpensive = thisUAV;				
				}
			}
		}
		
		if (leastExpensive == null)
			System.out.print("No UAVs found!");
		else 
			System.out.print("Least expensive: " + leastExpensive 
					+ "Most expensive: " + mostExpensive);

	}
}
