package multirotor;
import helicopter.Helicopter;

public class Multirotor extends Helicopter{
	protected int numOfRotors;
	
	/**
	 * Default constructor to initialize number of rotors to generic value. 
	 * Also initializes brand, price, horsepower, num of cylinders, creation year and passenger capacity values from superclass (Helicopter) default constructor.
	 */
	public Multirotor() {
		super();
		numOfRotors = 6;
	}
	
	/**
	 * Parameterized constructor to create object and initializes variables from user input. Calls superclass parametized constructor to set inherited attributes.
	 * 
	 * @param brand the brand of the multirotor
	 * @param price the price of the multirotor
	 * @param horsePower the horsepower of the multirotor
	 * @param numOfCylinders the number of cylinders of the multirotor
	 * @param creationYear the year of creation of the multirotor
	 * @param passengerCapacity the passenger capacity of the multirotor
	 * @param numOfRotors the number of rotors of the multirotor
	 */
	public Multirotor(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int numOfRotors) {
		super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.numOfRotors = numOfRotors;
	}
	
	/**
	 * Copy constructor to create object with same variables as passed object. Calls superclass copy constructor to set inherited attributes.
	 * 
	 * @param other another Multirotor object
	 */
	public Multirotor(Multirotor other) {
		super(other);
		this.numOfRotors = other.numOfRotors;
	}

	/**
	 * Accessor and Mutator methods
	 */
	public int getNumOfRotors() {
		return numOfRotors;
	}

	public void setNumOfRotors(int numOfRotors) {
		this.numOfRotors = numOfRotors;
	}

	/**
	 * Prints object details
	 * 
	 * @return a string displaying the multirotor's information
	 */
	public String toString() {
		return "This multirotor is manufactured by " + brand + ". It costs $" + price + " and has " + horsePower + " horsepower."
				+ " It has " + numOfCylinders + " cylinders. It was created in " + creationYear + " and has a capacity of " + passengerCapacity + " passengers."
				+ " It has " + numOfRotors + " rotors.\n";
	}
	
	/**
	 * Compares one multirotor to another object. Returns false if passed object is not an instance of Multirotor, true if all values are equal.
	 * 
	 * @param other another object to compare to this Multirotor
	 * @return true if the multirotors are equal
	 */
	public boolean equals(Object other ) {
		if (other == null || !(other instanceof Multirotor))
			return false;
		Multirotor otherMultirotor = (Multirotor) other;
		return this.brand.equals(otherMultirotor.brand) && this.price==otherMultirotor.price && this.horsePower==otherMultirotor.horsePower
				&& this.numOfCylinders==otherMultirotor.numOfCylinders && this.creationYear==otherMultirotor.creationYear 
				&& this.passengerCapacity==otherMultirotor.passengerCapacity && this.numOfRotors==otherMultirotor.numOfRotors;
	}
}
