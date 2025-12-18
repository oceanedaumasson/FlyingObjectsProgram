package helicopter;

public class Quadcopter extends Helicopter {
	protected int maxFlyingSpeed;
	
	/**
	 * Default constructor to initialize max flying speed to generic value. 
	 * Also initializes brand, price, horsepower, num of cylinders, creation year and passenger capacity values from superclass (Helicopter) default constructor.
	 */
	public Quadcopter() {
		super();
		maxFlyingSpeed = 100;
	}
	
	/**
	 * Parameterized constructor to create object and initializes variables from user input. Calls superclass parametized constructor to set inherited attributes.
	 * 
	 * @param brand the brand of the quadcopter
	 * @param price the price of the quadcopter
	 * @param horsePower the horsepower of the quadcopter
	 * @param numOfCylinders the number of cylinders of the quadcopter
	 * @param creationYear the year of creation of the quadcopter
	 * @param passengerCapacity the passenger capacity of the quadcopter
	 * @param maxFlyingSpeed the maximum flying speed of the quadcopter
	 */
	public Quadcopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * Copy constructor to create object with same variables as passed object. Calls superclass copy constructor to set inherited attributes.
	 * 
	 * @param other another Quadcopter object
	 */
	public Quadcopter(Quadcopter other) {
		super(other);
		this.maxFlyingSpeed = other.maxFlyingSpeed;
	}
	
	/**
	 * Accessor and Mutator methods
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the quadcopter's information
	 */
	public String toString() {
		return "This quadcopter is manufactured by " + brand + ". It costs $" + price + " and has " + horsePower + " horsepower."
				+ " It has " + numOfCylinders + " cylinders. It was created in " + creationYear + " and has a capacity of " + passengerCapacity + " passengers."
				+ " It has a maximum flying speed of " + maxFlyingSpeed + " mph.\n";
	}
	
	/**
	 * Compares one quadcopter to another object. Returns false if passed object is not an instance of Quadcopter, true if all values are equal.
	 * 
	 * @param other another object to compare to this Quadcopter
	 * @return true if the quadcopters are equal
	 */
	public boolean equals(Object other ) {
		if (other == null || !(other instanceof Quadcopter))
			return false;
		Quadcopter otherQuadcopter = (Quadcopter) other;
		return this.brand.equals(otherQuadcopter.brand) && this.price==otherQuadcopter.price && this.horsePower==otherQuadcopter.horsePower
				&& this.numOfCylinders==otherQuadcopter.numOfCylinders && this.creationYear==otherQuadcopter.creationYear 
				&& this.passengerCapacity==otherQuadcopter.passengerCapacity && this.maxFlyingSpeed==otherQuadcopter.maxFlyingSpeed;
	}
}
