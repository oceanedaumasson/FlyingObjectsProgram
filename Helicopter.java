package helicopter;
import airplane.Airplane;

public class Helicopter extends Airplane {
	protected int numOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	
	/**
	 * Default constructor to initialize number of cylinders, creation year and passenger capacity to generic values. 
	 * Also initializes brand, price and horsepower values from superclass (Airplane) default constructor.
	 */
	public Helicopter() {
		super();
		numOfCylinders = 4;
		creationYear = 2020;
		passengerCapacity = 4;
	}
	
	/**
	 * Parameterized constructor to create object and initializes variables from user input. Calls superclass parametized constructor to set inherited attributes.
	 * 
	 * @param brand the brand of the helicopter
	 * @param price the price of the helicopter
	 * @param horsePower the horsepower of the helicopter
	 * @param numOfCylinders the number of cylinders of the helicopter
	 * @param creationYear the year of creation of the helicopter
	 * @param passengerCapacity the passenger capacity of the helicopter
	 */
	public Helicopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity) {
		super(brand, price, horsePower);
		this.numOfCylinders = numOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
	
	/**
	 * Copy constructor to create object with same variables as passed object. Calls superclass copy constructor to set inherited attributes.
	 * 
	 * @param other another Helicopter object
	 */
	public Helicopter(Helicopter other) {
		super(other);
		this.numOfCylinders = other.numOfCylinders;
		this.creationYear = other.creationYear;
		this.passengerCapacity = other.passengerCapacity;
	}
	
	/**
	 * Accessor and Mutator methods
	 */
	public int getNumOfCylinders() {
		return numOfCylinders;
	}
	
	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the helicopter's information
	 */
	public String toString() {
		return "This helicopter is manufactured by " + brand + ". It costs $" + price + " and has " + horsePower + " horsepower."
				+ " It has " + numOfCylinders + " cylinders. It was created in " + creationYear + " and has a capacity of " + passengerCapacity + " passengers.\n";
	}
	
	/**
	 * Compares one helicopter to another object. Returns false if passed object is not an instance of Helicopter, true if all values are equal.
	 * 
	 * @param other another object to compare to this Helicopter
	 * @return true if the helicopters are equal
	 */
	public boolean equals(Object other ) {
		if (other == null || !(other instanceof Helicopter))
			return false;
		Helicopter otherHelicopter = (Helicopter) other;
		return this.brand.equals(otherHelicopter.brand) && this.price==otherHelicopter.price && this.horsePower==otherHelicopter.horsePower
				&& this.numOfCylinders==otherHelicopter.numOfCylinders && this.creationYear==otherHelicopter.creationYear && this.passengerCapacity==otherHelicopter.passengerCapacity;
	}
	
}
