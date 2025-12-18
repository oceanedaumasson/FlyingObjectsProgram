package drones;
import uav.UAV;

public class AgriculturalDrone extends UAV {
	protected String brand;
	protected int carryCapacity;
	
	/**
	 * Default constructor to initialize brand and carry capacity to generic values. 
	 * Also initializes weight and price values from superclass (UAV) default constructor.
	 */
	public AgriculturalDrone() {
		super();
		brand = "AgDrones";
		carryCapacity = 25;
	}
	
	/**
	 * Parameterized constructor to create object and initializes variables from user input. Calls superclass parametized constructor to set inherited attributes.
	 * 
	 * @param weight the weight of the agricultural drone
	 * @param price the price of the agricultural drone
	 * @param brand the brand of the agricultural drone
	 * @param carryCapacity the carry capacity of the agricultural drone
	 */
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	/**
	 * Copy constructor to create object with same variables as passed object. Calls superclass copy constructor to set inherited attributes.
	 * 
	 * @param other another AgriculturalDrone object
	 */
	public AgriculturalDrone(AgriculturalDrone other) {
		super(other);
		this.brand = other.brand;
		this.carryCapacity = other.carryCapacity;
	}

	/**
	 * Accessor and Mutator methods
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the agricultural drone's information
	 */
	public String toString() {
		return "This Agricultural Drone weighs " + weight + " kilograms. It costs $" + price 
				+ ". It is manufactured by " + brand + " and has a carry capacity of " + carryCapacity + " kilograms.\n";
	}
	
	/**
	 * Compares one agricultural drone to another object. Returns false if passed object is not an instance of AgriculturalDrone, true if all values are equal.
	 * 
	 * @param other another object to compare to this AgriculturalDrone
	 * @return true if the agricultural drones are equal
	 */
	public boolean equals(Object other) {
		if (other == null || !(other instanceof AgriculturalDrone))
			return false;
		AgriculturalDrone otherAgriculturalDrone = (AgriculturalDrone) other;
		return this.weight==otherAgriculturalDrone.weight && this.price==otherAgriculturalDrone.price 
				&& this.brand.equals(otherAgriculturalDrone.brand) && this.carryCapacity==otherAgriculturalDrone.carryCapacity;
	}
}
