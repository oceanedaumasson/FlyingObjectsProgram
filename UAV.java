package uav;
import flyingObject.FlyingObject;

public class UAV extends FlyingObject{
	protected double weight;
	protected double price;
	
	/**
	 * Default constructor to initialize weight and price to generic values. 
	 */
	public UAV() {
		weight = 20.0;
		price = 5000.0;
	}
	
	/**
	 * Parameterized constructor to create object and initialize weight and price from user input.
	 * 
	 * @param weight the weight of the UAV
	 * @param price the price of the UAV
	 */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	
	/**
	 * Copy constructor to create object with same weight and price as passed object
	 * 
	 * @param other another UAV object
	 */
	public UAV(UAV other) {
		this.weight = other.weight;
		this.price = other.price;
	}

	/**
	 * Accessor and Mutator methods
	 */
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the UAV's information
	 */
	public String toString() {
		return "This UAV weighs " + weight + " kilograms. It costs $" + price + ".\n";
	}
	
	/**
	 * Compares one UAV to another object. Returns false if passed object is not an instance of UAV, true if weight and price are equal.
	 * 
	 * @param other another object to compare to this UAV
	 * @return true if the UAVs are equal
	 */
	public boolean equals(Object other) {
		if (other == null || !(other instanceof UAV))
			return false;
		UAV otherUAV = (UAV) other;
		return this.weight==otherUAV.weight && this.price==otherUAV.price;
	}
	
}
