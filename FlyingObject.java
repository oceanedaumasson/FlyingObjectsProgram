package flyingObject;

public abstract class FlyingObject {
	/**
	 * Default constructor 
	 */
	public FlyingObject() {
    }
	
	/**
	 * Copy constructor
	 * @param other another flyingObject
	 */
	public FlyingObject(FlyingObject other) {
	}
	
	/**
	 * Print object details
	 */
	public abstract String toString();

	/**
	 * Compares on flying object to another
	 */
	public abstract boolean equals(Object obj);

}
