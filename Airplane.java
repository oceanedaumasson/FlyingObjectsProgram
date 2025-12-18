package airplane;
import flyingObject.FlyingObject;

public class Airplane extends FlyingObject {
	protected String brand;
	protected double price;
	protected int horsePower;
	
	/**
	 * Default constructor to initialize brand, price and horsepower to generic values. 
	 */
	public Airplane() {
		brand = "Airline";
		price = 500000.0;
		horsePower = 200;
	}
	
	/**
	 * Parameterized constructor to create object and initialize brand, price and horsepower from user input.
	 * 
	 * @param brand the brand of the Airplane
	 * @param price the price of the Airplane
	 * @param horsePower the horsepower of the Airplane
	 */
	public Airplane (String brand, double price, int horsePower) {
		this.brand = brand;
		this.price = price;
		this.horsePower = horsePower;
	}
	
	/**
	 * Copy constructor to create object with same brand, price and horsepower as passed object
	 * 
	 * @param other another Airplane object
	 */
	public Airplane(Airplane other) {
		this.brand = other.brand;
		this.price = other.price;
		this.horsePower = other.horsePower;
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	/**
	 * Prints object details
	 * 
	 * @return a string displaying the airplane's information
	 */
	public String toString() {
		return "This airplane is manufactured by " + brand + ". It costs $" + price + " and has " + horsePower + " horsepower.\n";
	}
	
	/**
	 * Compares one airplane to another object. Returns false if passed object is not an instance of Airplane, true if brand, price and horsepower are equal.
	 * 
	 * @param other another object to compare to this Airplane
	 * @return true if the airplanes are equal
	 */
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Airplane))
			return false;
		Airplane otherPlane = (Airplane) other;
		return this.brand.equals(otherPlane.brand) && this.price==otherPlane.price && this.horsePower==otherPlane.horsePower;
	}
}
