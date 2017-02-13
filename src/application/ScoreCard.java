
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
	
	/**
	 * Gets the fives score.
	 *
	 * @return the fives score
	 */
	public int getFivesScore() {
		return fivesScore;
	}

	/**
	 * Sets the fives score.
	 *
	 * @param roll the new fives score
	 */
	public void setFivesScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 5){
				count++;
			}
		}
		this.fivesScore = count * 5;
		this.setScore(fivesScore);
		fivesUsed = true;
	}

	/**
	 * Checks if is fives used.
	 *
	 * @return true, if is fives used
	 */
	public boolean isFivesUsed() {
		return fivesUsed;
	}

	/**
	 * Sets the fives used.
	 *
	 * @param fivesUsed the new fives used
	 */
	public void setFivesUsed(boolean fivesUsed) {
		this.fivesUsed = fivesUsed;
	}

	/**
	 * Gets the sixes score.
	 *
	 * @return the sixes score
	 */
	public int getSixesScore() {
		return sixesScore;
	}

	/**
	 * Sets the sixes score.
	 *
	 * @param roll the new sixes score
	 */
	public void setSixesScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 6){
				count++;
			}
		}
		this.sixesScore = count * 6;
		this.setScore(sixesScore);
		sixesUsed = true;
	}

	/**
	 * Checks if is sixes used.
	 *
	 * @return true, if is sixes used
	 */
	public boolean isSixesUsed() {
		return sixesUsed;
	}

	/**
	 * Sets the sixes used.
	 *
	 * @param sixesUsed the new sixes used
	 */
	public void setSixesUsed(boolean sixesUsed) {
		this.sixesUsed = sixesUsed;
	}

	/** The fives score. */
	private int fivesScore =  0;
	
	/** The fives used. */
	private boolean fivesUsed = false;
	
	/** The sixes score. */
	private int sixesScore = 0;
	
	/** The sixes used. */
	private boolean sixesUsed = false;
	
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
	
	/** The chance score. */
	private int chanceScore = 0;
	
	/** The chance used. */
	private boolean chanceUsed = false;
	
	/** The yahtzee bonus score. */
	private int yahtzeeBonusScore = 0;
	
	/**
	 * Gets the yahtzee bonus score.
	 *
	 * @return the yahtzee bonus score
	 */
	public int getYahtzeeBonusScore() {
		return yahtzeeBonusScore;
	}

	/**
	 * Sets the yahtzee bonus score.
	 */
	public void setYahtzeeBonusScore() {
		this.yahtzeeBonusScore += 100;
		this.setScore(100);
	}

	/**
	 * Gets the chance score.
	 *
	 * @return the chance score
	 */
	public int getChanceScore() {
		return chanceScore;
	}

	/**
	 * Sets the chance score.
	 *
	 * @param roll the new chance score
	 */
	public void setChanceScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			count += roll[i];
		}
		this.chanceScore = count;
		this.setScore(chanceScore);
		this.chanceUsed = true;
	}
	

	/**
	 * Checks if is chance used.
	 *
	 * @return true, if is chance used
	 */
	public boolean isChanceUsed() {
		return chanceUsed;
	}

	/**
	 * Sets the chance used.
	 *
	 * @param chanceUsed the new chance used
	 */
	public void setChanceUsed(boolean chanceUsed) {
		this.chanceUsed = chanceUsed;
	}

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
	 *
	 * @param name the name
	 * @param valid the valid
	 */
	public ScoreCard(String name, boolean valid) {
		super(name, 0);
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
	 * @param roll the new aces score
	 */
	public void setAcesScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 1){
				count++;
			}
		}
		this.acesScore = count;
		this.setScore(acesScore);
		acesUsed = true;
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
	 * @param roll the new twos score
	 */
	public void setTwosScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 2){
				count++;
			}
		}
		this.twosScore = count * 2;
		this.setScore(twosScore);
		twosUsed = true;
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
	 * @param roll the new threes score
	 */
	public void setThreesScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 3){
				count++;
			}
		}
		this.threesScore = count * 3;
		this.setScore(threesScore);
		threesUsed = true;
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
	 * @param roll the new fours score
	 */
	public void setFoursScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if(roll[i] == 4){
				count++;
			}
		}
		this.foursScore = count * 4;
		this.setScore(foursScore);
		foursUsed = true;
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
	 * @param roll the new l 3 o K score
	 */
	public void setL3oKScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			count += roll[i];
		}
		this.l3oKScore = count;
		this.setScore(l3oKScore);
		this.l3oKUsed = true;
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
	 * @param roll the new l 4 o K score
	 */
	public void setL4oKScore(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			count += roll[i];
		}
		this.l4oKScore = count;
		this.setScore(l4oKScore);
		this.l4oKUsed = true;
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
	 */
	public void setFullHouseScore() {
		this.fullHouseScore = 25;
		this.setScore(fullHouseScore);
		this.fullHouseUsed = true;
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
	 */
	public void setSmallStrScore() {
		this.smallStrScore = 30;
		this.setScore(smallStrScore);
		this.smallStrUsed = true;
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
	 */
	public void setLrgStrScore() {
		this.lrgStrScore = 40;
		this.setScore(lrgStrScore);
		this.lrgStrUsed =  true;
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
	 */
	public void setYahtzeeScore() {
		this.yahtzeeScore = 50;
		this.setScore(yahtzeeScore);
		this.yahtzeeUsed = true;
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
		setYahtzeeBonusScore();
		
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
		setYahtzeeBonusScore();
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
		setYahtzeeBonusScore();
	}
	
	/**
	 * Reset scores.
	 */
	public void resetScores() {
		acesScore = 0;
		twosScore = 0;
		threesScore = 0;
		foursScore = 0;
		fivesScore = 0;
		sixesScore = 0;
		l3oKScore = 0;
		l4oKScore = 0;
		fullHouseScore = 0;
		smallStrScore = 0;
		lrgStrScore = 0;
		yahtzeeScore = 0;
		chanceScore = 0;
		yahtzeeBonusScore = 0;
		super.setScore(0);
		acesUsed = false;
		twosUsed = false;
		threesUsed = false;
		foursUsed = false;
		fivesUsed = false;
		sixesUsed = false;
		l3oKUsed = false;
		l4oKUsed = false;
		fullHouseUsed = false;
		smallStrUsed = false;
		lrgStrUsed = false;
		yahtzeeUsed = false;
		yahtzeeBonus1Used = false;
		yahtzeeBonus2Used = false;
		yahtzeeBonus3Used = false;
	}
	
	/**
	 * Gets the upper score.
	 *
	 * @return the upper score
	 */
	public int getUpperScore() {
		return acesScore + twosScore + threesScore + foursScore + fivesScore + sixesScore;
	}
	
	/**
	 * Gets the upper bonus.
	 *
	 * @return the upper bonus
	 */
	public int getUpperBonus() {
		if(getUpperScore() >= 63) {
			return 35;
		} else {
			return 0;
		}
	}
	
	/**
	 * Gets the upper total.
	 *
	 * @return the upper total
	 */
	public int getUpperTotal() {
		return getUpperScore() + getUpperBonus();
	}
	
	/**
	 * Gets the lower score.
	 *
	 * @return the lower score
	 */
	public int getLowerScore () {
		return l3oKScore + l4oKScore + fullHouseScore + smallStrScore + lrgStrScore + yahtzeeScore + chanceScore + yahtzeeBonusScore;
	}
}
