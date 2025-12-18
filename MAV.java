package drones;
import uav.UAV;

public class MAV extends UAV {
	protected String model;
	protected double size;
	
	/**
	 * Default constructor to initialize model and size to generic values. 
	 * Also initializes weight and price values from superclass (UAV) default constructor.
	 */
	public MAV() {
		super();
		model = "Mini";
		size = 10.0;
	}
	
	/**
	 * Parameterized constructor to create object and initializes variables from user input. Calls superclass parametized constructor to set inherited attributes.
	 * 
	 * @param weight the weight of the MAV
	 * @param price the price of the MAV
	 * @param model the model of the MAV
	 * @param size the size of the MAV
	 */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	/**
	 * Copy constructor to create object with same variables as passed object. Calls superclass copy constructor to set inherited attributes.
	 * 
	 * @param other another MAV object
	 */
	public MAV(MAV other) {
		super(other);
		this.model = other.model;
		this.size = other.size;
	}

	/**
	 * Accessor and Mutator methods
	 */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the MAV's information
	 */
	public String toString() {
		return "This MAV weighs " + weight + " kilograms. It costs $" + price 
				+ ". It is the " + model + " model and has a size of " + size + " centimeters.\n";
	}
	
	/**
	 * Compares one MAV to another object. Returns false if passed object is not an instance of MAV, true if all values are equal.
	 * 
	 * @param other another object to compare to this MAV
	 * @return true if the MAVs are equal
	 */
	public boolean equals(Object other) {
		if (other == null || !(other instanceof MAV))
			return false;
		MAV otherMAV = (MAV) other;
		return this.weight==otherMAV.weight && this.price==otherMAV.price 
				&& this.model.equals(otherMAV.model) && this.size==otherMAV.size;
	}
}

