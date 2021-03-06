/**
 * @author 	Raul Diaz <dudadew311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */
package application;

import javafx.scene.image.Image;


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
	private boolean rollable;
	
	/** The die picture. */
	private Image diePicture = null;
	
	/**
	 * Instantiates a new die.
	 */
	public Die(){
		this.side = (int)(Math.random() * 6) + 1;
		rollable = true;
		this.diePicture = setDiePicture(side);
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
	 * Checks if is rollable.
	 *
	 * @return true, if is roll
	 */
	public boolean isRollable() {
		return rollable;
	}

	/**
	 * Sets if the die is rollable or not.
	 *
	 * @param rollable
	 *            the new roll
	 */
	public void setRollable(boolean rollable) {
		this.rollable = rollable;
	}

	/**
	 * Sets the value of the die.
	 */
	public void setSide() {
		if(rollable){
			this.side = (int)(Math.random() * 6) + 1;
			diePicture = setDiePicture(this.side);
		}
	}
	
	/**
	 * Gets the die picture.
	 *
	 * @return the die picture
	 */
	public Image getDiePicture() {
		return diePicture;
	}

	/**
	 * Sets the die picture that will be displayed for each number.
	 *
	 * @param side the side
	 * @return the image
	 */
	private static Image setDiePicture(int side){
		Image picture = null;
		
		switch(side){
			case 1:
				picture = new Image("/images/Die1.png");
				break;
			case 2:
				picture = new Image("/images/Die2.png");
				break;
			case 3:
				picture = new Image("/images/Die3.png");
				break;
			case 4:
				picture = new Image("/images/Die4.png");
				break;
			case 5:
				picture = new Image("/images/Die5.png");
				break;
			case 6:
				picture = new Image("/images/Die6.png");
				break;
			}
		return picture;
	}
	
	/**
	 * Reset die picture to blank.
	 */
	public void resetDiePicture(){
		this.diePicture = new Image("/images/Blank.png");	
	}
}
