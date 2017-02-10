
package application;


/**
 * The Class ScoreCard. keeps track of each players score card.
 *
 * @author 	Raul Diaz <dudadew311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */
public class ScoreCard extends Player{
	
	/** The aces score. */
	private int acesScore = 0;
	
	/** The aces used. */
	private boolean acesUsed = false;
	
	/** The twos score. */
	private int twosScore = 0;
	
	/** The twos used. */
	private boolean twosUsed = false;
	
	/** The threes score. */
	private int threesScore = 0;
	
	/** The threes used. */
	private boolean threesUsed = false;
	
	/** The fours score. */
	private int foursScore = 0;
	
	/** The fours used. */
	private boolean foursUsed = false;
	
	/** The l 3 o K score. */
	private int l3oKScore = 0;
	
	/** The l 3 o K used. */
	private boolean l3oKUsed = false;
	
	/** The l 4 o K score. */
	private int l4oKScore= 0;
	
	/** The l 4 o K used. */
	private boolean l4oKUsed = false;
	
	/** The full house score. */
	private int fullHouseScore = 0;
	
	/** The full house used. */
	private boolean fullHouseUsed = false;
	
	/** The small str score. */
	private int smallStrScore = 0;
	
	/** The small str used. */
	private boolean smallStrUsed = false;
	
	/** The lrg str score. */
	private int lrgStrScore = 0;
	
	/** The lrg str used. */
	private boolean lrgStrUsed = false;
	
	/** The yahtzee score. */
	private int yahtzeeScore = 0;
	
	/** The yahtzee used. */
	private boolean yahtzeeUsed = false;
	
	/** The yahtzee bonus 1 used. */
	private boolean yahtzeeBonus1Used = false;
	
	/** The yahtzee bonus 2 used. */
	private boolean yahtzeeBonus2Used = false;
	
	/** The yahtzee bonus 3 used. */
	private boolean yahtzeeBonus3Used = false;
	
	/**
	 * Instantiates a new score card.
	 */
	public ScoreCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new score card.
	 *
	 * @param name the name
	 */
	public ScoreCard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the aces score.
	 *
	 * @return the aces score
	 */
	public int getAcesScore() {
		return acesScore;
	}
	
	/**
	 * Sets the aces score.
	 *
	 * @param acesScore the new aces score
	 */
	public void setAcesScore(int acesScore) {
		this.acesScore = acesScore;
	}
	
	/**
	 * Checks if is aces used.
	 *
	 * @return true, if is aces used
	 */
	public boolean isAcesUsed() {
		return acesUsed;
	}
	
	/**
	 * Sets the aces used.
	 *
	 * @param acesUsed the new aces used
	 */
	public void setAcesUsed(boolean acesUsed) {
		this.acesUsed = acesUsed;
	}
	
	/**
	 * Gets the twos score.
	 *
	 * @return the twos score
	 */
	public int getTwosScore() {
		return twosScore;
	}
	
	/**
	 * Sets the twos score.
	 *
	 * @param twosScore the new twos score
	 */
	public void setTwosScore(int twosScore) {
		this.twosScore = twosScore;
	}
	
	/**
	 * Checks if is twos used.
	 *
	 * @return true, if is twos used
	 */
	public boolean isTwosUsed() {
		return twosUsed;
	}
	
	/**
	 * Sets the twos used.
	 *
	 * @param twosUsed the new twos used
	 */
	public void setTwosUsed(boolean twosUsed) {
		this.twosUsed = twosUsed;
	}
	
	/**
	 * Gets the threes score.
	 *
	 * @return the threes score
	 */
	public int getThreesScore() {
		return threesScore;
	}
	
	/**
	 * Sets the threes score.
	 *
	 * @param threesScore the new threes score
	 */
	public void setThreesScore(int threesScore) {
		this.threesScore = threesScore;
	}
	
	/**
	 * Checks if is threes used.
	 *
	 * @return true, if is threes used
	 */
	public boolean isThreesUsed() {
		return threesUsed;
	}
	
	/**
	 * Sets the threes used.
	 *
	 * @param threesUsed the new threes used
	 */
	public void setThreesUsed(boolean threesUsed) {
		this.threesUsed = threesUsed;
	}
	
	/**
	 * Gets the fours score.
	 *
	 * @return the fours score
	 */
	public int getFoursScore() {
		return foursScore;
	}
	
	/**
	 * Sets the fours score.
	 *
	 * @param foursScore the new fours score
	 */
	public void setFoursScore(int foursScore) {
		this.foursScore = foursScore;
	}
	
	/**
	 * Checks if is fours used.
	 *
	 * @return true, if is fours used
	 */
	public boolean isFoursUsed() {
		return foursUsed;
	}
	
	/**
	 * Sets the fours used.
	 *
	 * @param foursUsed the new fours used
	 */
	public void setFoursUsed(boolean foursUsed) {
		this.foursUsed = foursUsed;
	}
	
	/**
	 * Gets the l 3 o K score.
	 *
	 * @return the l 3 o K score
	 */
	public int getL3oKScore() {
		return l3oKScore;
	}
	
	/**
	 * Sets the l 3 o K score.
	 *
	 * @param l3oKScore the new l 3 o K score
	 */
	public void setL3oKScore(int l3oKScore) {
		this.l3oKScore = l3oKScore;
	}
	
	/**
	 * Checks if is l 3 o K used.
	 *
	 * @return true, if is l 3 o K used
	 */
	public boolean isL3oKUsed() {
		return l3oKUsed;
	}
	
	/**
	 * Sets the l 3 o K used.
	 *
	 * @param l3oKUsed the new l 3 o K used
	 */
	public void setL3oKUsed(boolean l3oKUsed) {
		this.l3oKUsed = l3oKUsed;
	}
	
	/**
	 * Gets the l 4 o K score.
	 *
	 * @return the l 4 o K score
	 */
	public int getL4oKScore() {
		return l4oKScore;
	}
	
	/**
	 * Sets the l 4 o K score.
	 *
	 * @param l4oKScore the new l 4 o K score
	 */
	public void setL4oKScore(int l4oKScore) {
		this.l4oKScore = l4oKScore;
	}
	
	/**
	 * Checks if is l 4 o K used.
	 *
	 * @return true, if is l 4 o K used
	 */
	public boolean isL4oKUsed() {
		return l4oKUsed;
	}
	
	/**
	 * Sets the l 4 o K used.
	 *
	 * @param l4oKUsed the new l 4 o K used
	 */
	public void setL4oKUsed(boolean l4oKUsed) {
		this.l4oKUsed = l4oKUsed;
	}
	
	/**
	 * Gets the full house score.
	 *
	 * @return the full house score
	 */
	public int getFullHouseScore() {
		return fullHouseScore;
	}
	
	/**
	 * Sets the full house score.
	 *
	 * @param fullHouseScore the new full house score
	 */
	public void setFullHouseScore(int fullHouseScore) {
		this.fullHouseScore = fullHouseScore;
	}
	
	/**
	 * Checks if is full house used.
	 *
	 * @return true, if is full house used
	 */
	public boolean isFullHouseUsed() {
		return fullHouseUsed;
	}
	
	/**
	 * Sets the full house used.
	 *
	 * @param fullHouseUsed the new full house used
	 */
	public void setFullHouseUsed(boolean fullHouseUsed) {
		this.fullHouseUsed = fullHouseUsed;
	}
	
	/**
	 * Gets the small str score.
	 *
	 * @return the small str score
	 */
	public int getSmallStrScore() {
		return smallStrScore;
	}
	
	/**
	 * Sets the small str score.
	 *
	 * @param smallStrScore the new small str score
	 */
	public void setSmallStrScore(int smallStrScore) {
		this.smallStrScore = smallStrScore;
	}
	
	/**
	 * Checks if is small str used.
	 *
	 * @return true, if is small str used
	 */
	public boolean isSmallStrUsed() {
		return smallStrUsed;
	}
	
	/**
	 * Sets the small str used.
	 *
	 * @param smallStrUsed the new small str used
	 */
	public void setSmallStrUsed(boolean smallStrUsed) {
		this.smallStrUsed = smallStrUsed;
	}
	
	/**
	 * Gets the lrg str score.
	 *
	 * @return the lrg str score
	 */
	public int getLrgStrScore() {
		return lrgStrScore;
	}
	
	/**
	 * Sets the lrg str score.
	 *
	 * @param lrgStrScore the new lrg str score
	 */
	public void setLrgStrScore(int lrgStrScore) {
		this.lrgStrScore = lrgStrScore;
	}
	
	/**
	 * Checks if is lrg str used.
	 *
	 * @return true, if is lrg str used
	 */
	public boolean isLrgStrUsed() {
		return lrgStrUsed;
	}
	
	/**
	 * Sets the lrg str used.
	 *
	 * @param lrgStrUsed the new lrg str used
	 */
	public void setLrgStrUsed(boolean lrgStrUsed) {
		this.lrgStrUsed = lrgStrUsed;
	}
	
	/**
	 * Gets the yahtzee score.
	 *
	 * @return the yahtzee score
	 */
	public int getYahtzeeScore() {
		return yahtzeeScore;
	}
	
	/**
	 * Sets the yahtzee score.
	 *
	 * @param yahtzeeScore the new yahtzee score
	 */
	public void setYahtzeeScore(int yahtzeeScore) {
		this.yahtzeeScore = yahtzeeScore;
	}
	
	/**
	 * Checks if is yahtzee used.
	 *
	 * @return true, if is yahtzee used
	 */
	public boolean isYahtzeeUsed() {
		return yahtzeeUsed;
	}
	
	/**
	 * Sets the yahtzee used.
	 *
	 * @param yahtzeeUsed the new yahtzee used
	 */
	public void setYahtzeeUsed(boolean yahtzeeUsed) {
		this.yahtzeeUsed = yahtzeeUsed;
	}
	
	/**
	 * Checks if is yahtzee bonus 1 used.
	 *
	 * @return true, if is yahtzee bonus 1 used
	 */
	public boolean isYahtzeeBonus1Used() {
		return yahtzeeBonus1Used;
	}
	
	/**
	 * Sets the yahtzee bonus 1 used.
	 *
	 * @param yahtzeeBonus1Used the new yahtzee bonus 1 used
	 */
	public void setYahtzeeBonus1Used(boolean yahtzeeBonus1Used) {
		this.yahtzeeBonus1Used = yahtzeeBonus1Used;
	}
	
	/**
	 * Checks if is yahtzee bonus 2 used.
	 *
	 * @return true, if is yahtzee bonus 2 used
	 */
	public boolean isYahtzeeBonus2Used() {
		return yahtzeeBonus2Used;
	}
	
	/**
	 * Sets the yahtzee bonus 2 used.
	 *
	 * @param yahtzeeBonus2Used the new yahtzee bonus 2 used
	 */
	public void setYahtzeeBonus2Used(boolean yahtzeeBonus2Used) {
		this.yahtzeeBonus2Used = yahtzeeBonus2Used;
	}
	
	/**
	 * Checks if is yahtzee bonus 3 used.
	 *
	 * @return true, if is yahtzee bonus 3 used
	 */
	public boolean isYahtzeeBonus3Used() {
		return yahtzeeBonus3Used;
	}
	
	/**
	 * Sets the yahtzee bonus 3 used.
	 *
	 * @param yahtzeeBonus3Used the new yahtzee bonus 3 used
	 */
	public void setYahtzeeBonus3Used(boolean yahtzeeBonus3Used) {
		this.yahtzeeBonus3Used = yahtzeeBonus3Used;
	}
	
	

}
