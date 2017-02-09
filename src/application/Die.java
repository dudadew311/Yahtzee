/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */
package application;

// TODO: Auto-generated Javadoc
/**
 * The Class Die.
 */
public class Die {

	/** The side. This shows the number that is showing on the die.
	 */
	private int side;
	
	/** The roll. This determines whether the die can be rolled or not
	 * die can be rolled if set to true. 
	 */
	private boolean roll;
	
	/**
	 * Instantiates a new die.
	 */
	public Die(){
		this.side = (int)(Math.random() * 6) + 1;
		roll = true;
	}

	/**
	 * Gets the side.
	 *
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * Checks if is roll.
	 *
	 * @return true, if is roll
	 */
	public boolean isRoll() {
		return roll;
	}

	/**
	 * Sets the roll.
	 *
	 * @param roll
	 *            the new roll
	 */
	public void setRoll(boolean roll) {
		this.roll = roll;
	}

	/**
	 * Sets the side.
	 */
	public void setSide() {
		if(this.roll){
			this.side = (int)(Math.random() * 6) + 1;
		}
	}
}
