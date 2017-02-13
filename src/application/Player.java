

package application;

/**
 * @author 	Raul Diaz <dudadew311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

/**
 * The Class Player.
 */
public class Player {
	
	/** The name. */
	private String name;
	
	/** The valid. */
	private boolean valid = false;
	
	/** The score. */
	private int score;
	
	/**
	 * Instantiates a new player.
	 *
	 * @param name the name
	 */
	public Player(String name, int score){
		this.name = name;
		this.score = score;
		if(name.compareTo("")>0){
			this.valid = true;
		}
	}
	
	/**
	 * Instantiates a new player.
	 */
	public Player (){
		this.name = " ";
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Sets the score.
	 *
	 * @param score the new score
	 */
	public void setScore(int score) {
		this.score += score;
	}

	/**
	 * Checks if is valid.
	 *
	 * @return true, if is valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * Sets the valid.
	 *
	 * @param valid the new valid
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
}

