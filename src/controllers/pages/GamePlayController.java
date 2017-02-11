package controllers.pages;

/**
 * @author 	Raul Diaz <dudadew311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

import java.io.IOException;
import java.util.Arrays;

import application.Die;
import application.ScoreCard;
import controllers.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * The Class GamePlayController.
 */
public class GamePlayController {

	/** The die 1. */
	private Die die1 = new Die();

	/** The die 2. */
	private Die die2 = new Die();

	/** The die 3. */
	private Die die3 = new Die();

	/** The die 4. */
	private Die die4 = new Die();

	/** The die 5. */
	private Die die5 = new Die();

	private Die []dice = {die1,die2,die3,die4,die5};

	private CheckBox[][] scoreCard;

	private ImageView[] diePicture;

	/** The player name array. */
	public Label []playerName;

	/** The player tab array. */
	public Tab []playerTab;

	/** The lock button array. */
	public ToggleButton []locks;

	/** The round num. */
	private int roundNum = 0;

	/** The roll num. */
	private int rollNum = 3;

	
	private int[] rollResult = {
			die1.getSide(),
			die2.getSide(),
			die3.getSide(),
			die4.getSide(),
			die5.getSide()
	};
	
	

	/** The players. */
	private ScoreCard []players = {
			MainController.player1,
			MainController.player2,
			MainController.player3,
			MainController.player4,
	};

	/** The main controller. */
	@SuppressWarnings("unused")
	private MainController main;

	/** The player up. */
	private int playerUp = 0;

	/**
	 * Sets the names on score card.
	 */
	public void setNames() {
		initiateArrays();
		for (int i=0;i<playerName.length;i++){
			if (players[i].getName().compareTo(" ")>0) {
				playerName[i].setText(players[i].getName());
				playerTab[i].setText(players[i].getName());
				playerTab[i].setDisable(false);
				players[i].setValid(true);
			} else {
				playerName[i].setText("");
				playerTab[i].setText("");
				playerTab[i].setDisable(true);
				players[i].setValid(false);
			}
		}
	}

	/**
	 * Initializes the main controller if needed.
	 *
	 * @param mainController the main controller
	 */
	public void init(MainController mainController) {
		this.main = mainController;	

	}

	/**
	 * Sets up a New game.
	 * Cleans the board.
	 */
	public void newGame(){
		playerUp = 0;
		roundNum = 0;
		rollNum = 3;
		lockPossibles();
		int flag = 0;
		rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
		roundsLbl.setText(String.valueOf(roundNum+1));

		for(int i=0;i<players.length;i++){
			if(players[i].isValid()){
				playerUpLbl.setText(players[i].getName());
				playerTabPane.getSelectionModel().select(i);
				unlockRollButton();
				unlockScoreButton();
				flag++;
				break;
			} else {
				
			}
		}
		if (flag == 0){
			playerUpLbl.setText("No one");
			System.out.println("No one is up");
			lockRollButton();
		}
	}

	/**
	 * Lock roll button.
	 */
	private void lockRollButton(){
		rollButton.setDisable(true);
	}

	/**
	 * Unlock roll button.
	 */
	private void unlockRollButton(){
		rollButton.setDisable(false);
	}

	/**
	 * Unlock score button.
	 */
	private void unlockScoreButton(){
		score.setDisable(false);

	}

	/**
	 * Locks die 1.
	 */
	@FXML
	private void lockDie1() {
		if (die1.isRollable()){
			die1.setRollable(false);
			lockButton1.setText("Locked");
		} else {
			die1.setRollable(true);
			lockButton1.setText("LOCK");
		}
	}

	/**
	 * Locks die 2.
	 */
	@FXML
	private void lockDie2() {
		if (die2.isRollable()){
			die2.setRollable(false);
			lockButton2.setText("Locked");
		} else {
			die2.setRollable(true);
			lockButton2.setText("LOCK");
		}
	}

	/**
	 * Locks die 3.
	 */
	@FXML
	private void lockDie3() {
		if (die3.isRollable()){
			die3.setRollable(false);
			lockButton3.setText("Locked");
		} else {
			die3.setRollable(true);
			lockButton3.setText("LOCK");
		}
	}

	/**
	 * Lock die 4.
	 */
	@FXML
	private void lockDie4() {
		if (die4.isRollable()){
			die4.setRollable(false);
			lockButton4.setText("Locked");
		} else {
			die4.setRollable(true);
			lockButton4.setText("LOCK");
		}
	}

	/**
	 * Lock die 5.
	 */
	@FXML
	private void lockDie5() {
		if (die5.isRollable()){
			die5.setRollable(false);
			lockButton5.setText("Locked");
		} else {
			die5.setRollable(true);
			lockButton5.setText("LOCK");
		}
	}

	/**
	 * Reset locks.
	 */
	public void resetLocks(){
		for(int i=0;i<dice.length;i++){
			dice[i].setRollable(true);			
			locks[i].setText("LOCK");
			locks[i].setSelected(false);
		}

	}

	/**
	 * Roll button click.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void rollButtonClick() {
		if(rollNum == 3){
			resetLocks();
		}
		for(int i=0;i<dice.length;i++){
			dice[i].setSide();
			diePicture[i].setImage(dice[i].getDiePicture());
		}
		checkRolls();
	}

	/**
	 * Check rolls.
	 */
	private void checkRolls(){
		rollNum--;
		if (rollNum == 0){
			lockRollButton();
			selectScore();
			rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
			System.out.println(players[playerUp].getName() +" Rolls Left " + rollNum);
		} else {
			rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
			System.out.println(players[playerUp].getName() +" Rolls Left " + rollNum);
		}	
	}

	/**
	 * Check player.
	 */
	private void checkPlayer(){	
		if (playerUp < 4){
			if(players[playerUp].isValid()){

				playerUpLbl.setText(players[playerUp].getName());
				playerTabPane.getSelectionModel().select(playerUp);
			} else{
				playerUp++;	
				checkPlayer();	
				rollNum = 3;
			}

		} else {
			playerUp = 0;
			roundsLbl.setText(String.valueOf(++roundNum + 1));
			playerUpLbl.setText(players[playerUp].getName());
			playerTabPane.getSelectionModel().select(playerUp);
		}
	}

	/**
	 * Select score click.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void selectScoreClick() {
		lockPossibles();
		System.out.println("things should lcok here");
		selectScore();
		rollNum = 3;
		rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
		++playerUp;	
		checkPlayer();
		rollButton.setDisable(false);
		resetLocks();
	}
	

	/**
	 * Select score.
	 */
	private void selectScore(){
		unlockPossibles();
		System.out.println("This is when player would select score");
		System.out.println("Die show: "+die1.getSide()+":"+die2.getSide() +":"+die3.getSide()+":"+die4.getSide()+":"+die5.getSide());

	}



	private static boolean isAces(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 1) {
				count++;
			}
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isTwos(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 2) count++;
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isThrees(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 3){ 
				count++;
			}
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isFours(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 4) count++;
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isFives(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 5) count++;
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isSixes(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == 6) count++;
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean is3oK(int[] roll) {
		int count = 0;
		//need to figure out 
		
		if(count > 3){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean is4oK(int[] roll) {
		int count = 0;
		//need to figure out
		
		if(count > 4){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isFullHouse(int[] roll) {
		int count = 0;
		// nee to figure out
		
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isSmStr(int[] roll) {
		int count = 0;
		Arrays.sort(roll);
		for(int i=0;i<(roll.length-1);i++){
			if (roll[i] == (roll[i+1])-1) {
				count++;
			}
		}
		if(count > 3){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isLrgStr(int[] roll) {
		int count = 0;
		Arrays.sort(roll);
		for(int i=0;i<(roll.length-1);i++){
			if (roll[i] == (roll[i+1])-1) {
				count++;
			}
		}
		if(count > 4){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isYahtzee(int[] roll) {
		int count = 0;
		for(int i=0;i<roll.length;i++){
			if (roll[i] == roll[0]) {
				count++;
			}
		}
		if(count == 5){
			return true;
		} else {
			return false;
		}
	}
	
	private void unlockPossibles() {
		scoreCard[playerUp][0].setDisable(isAces(rollResult));
		scoreCard[playerUp][1].setDisable(isTwos(rollResult));
		scoreCard[playerUp][2].setDisable(isThrees(rollResult));
		scoreCard[playerUp][3].setDisable(isFours(rollResult));
		scoreCard[playerUp][4].setDisable(isFives(rollResult));
		scoreCard[playerUp][5].setDisable(isSixes(rollResult));
		scoreCard[playerUp][6].setDisable(is3oK(rollResult));
		scoreCard[playerUp][7].setDisable(is4oK(rollResult));
		scoreCard[playerUp][8].setDisable(isFullHouse(rollResult));
		scoreCard[playerUp][9].setDisable(isSmStr(rollResult));
		scoreCard[playerUp][10].setDisable(isLrgStr(rollResult));
		scoreCard[playerUp][11].setDisable(isYahtzee(rollResult));
		scoreCard[playerUp][12].setDisable(true);
		scoreCard[playerUp][13].setDisable(isYahtzee(rollResult));
		scoreCard[playerUp][14].setDisable(isYahtzee(rollResult));
		scoreCard[playerUp][15].setDisable(isYahtzee(rollResult));
		
	}
	
	
	private void lockPossibles() {
		for(int i=0;i<4;i++){
			for(int j=0;j<16;j++)
			scoreCard[i][j].setDisable(true);
			initiateArrays();
		}
	}

	/** The aces P 1. */
	@FXML private CheckBox acesP1;

	/** The aces P 2. */
	@FXML private CheckBox acesP2;

	/** The aces P 3. */
	@FXML private CheckBox acesP3;

	/** The aces P 4. */
	@FXML private CheckBox acesP4;

	/** The chance P 1. */
	@FXML private CheckBox chanceP1;

	/** The chance P 2. */
	@FXML private CheckBox chanceP2;

	/** The chance P 3. */
	@FXML private CheckBox chanceP3;

	/** The chance P 4. */
	@FXML private CheckBox chanceP4;

	/** The die V 1. */
	@FXML private ImageView dieV1;

	/** The die V 2. */
	@FXML private ImageView dieV2;

	/** The die V 3. */
	@FXML private ImageView dieV3;

	/** The die V 4. */
	@FXML private ImageView dieV4;

	/** The die V 5. */
	@FXML private ImageView dieV5;

	/** The fives P 1. */
	@FXML private CheckBox fivesP1;

	/** The fives P 2. */
	@FXML private CheckBox fivesP2;

	/** The fives P 3. */
	@FXML private CheckBox fivesP3;

	/** The fives P 4. */
	@FXML private CheckBox fivesP4;

	/** The fours P 1. */
	@FXML private CheckBox foursP1;

	/** The fours P 2. */
	@FXML private CheckBox foursP2;

	/** The fours P 3. */
	@FXML private CheckBox foursP3;

	/** The fours P 4. */
	@FXML private CheckBox foursP4;

	/** The full house P 1. */
	@FXML private CheckBox fullHouseP1;

	/** The full house P 2. */
	@FXML private CheckBox fullHouseP2;

	/** The full house P 3. */
	@FXML private CheckBox fullHouseP3;

	/** The full house P 4. */
	@FXML private CheckBox fullHouseP4;

	/** The l 3 o KP 1. */
	@FXML private CheckBox l3oKP1;

	/** The l 3 o KP 2. */
	@FXML private CheckBox l3oKP2;

	/** The l 3 o KP 3. */
	@FXML private CheckBox l3oKP3;

	/** The l 3 o KP 4. */
	@FXML private CheckBox l3oKP4;

	/** The l 4 o KP 1. */
	@FXML private CheckBox l4oKP1;

	/** The l 4 o KP 2. */
	@FXML private CheckBox l4oKP2;

	/** The l 4 o KP 3. */
	@FXML private CheckBox l4oKP3;

	/** The l 4 o KP 4. */
	@FXML private CheckBox l4oKP4;

	/** The lock button 1. */
	@FXML private ToggleButton lockButton1;

	/** The lock button 2. */
	@FXML private ToggleButton lockButton2;

	/** The lock button 3. */
	@FXML private ToggleButton lockButton3;

	/** The lock button 4. */
	@FXML private ToggleButton lockButton4;

	/** The lock button 5. */
	@FXML private ToggleButton lockButton5;

	/** The lrg str P 1. */
	@FXML private CheckBox lrgStrP1;

	/** The lrg str P 2. */
	@FXML private CheckBox lrgStrP2;

	/** The lrg str P 3. */
	@FXML private CheckBox lrgStrP3;

	/** The lrg str P 4. */
	@FXML private CheckBox lrgStrP4;

	/** The player 1 name. */
	@FXML private Label player1name;

	/** The player 2 name. */
	@FXML private Label player2name;

	/** The player 3 name. */
	@FXML private Label player3name;

	/** The player 4 name. */
	@FXML private Label player4name;

	/** The player 1 score. */
	@FXML private Label player1score;

	/** The player 2 score. */
	@FXML private Label player2score;

	/** The player 3 score. */
	@FXML private Label player3score;

	/** The player 4 score. */
	@FXML private Label player4score;

	/** The player 1 tab. */
	@FXML private Tab player1tab;

	/** The player 2 tab. */
	@FXML private Tab player2tab;

	/** The player 3 tab. */
	@FXML private Tab player3tab;

	/** The player 4 tab. */
	@FXML private Tab player4tab;

	/** The player up lbl. */
	@FXML private Text playerUpLbl;

	/** The roll button. */
	@FXML private Button rollButton;

	/** The rounds lbl. */
	@FXML private Text roundsLbl;

	/** The sixes P 1. */
	@FXML private CheckBox sixesP1;

	/** The sixes P 2. */
	@FXML private CheckBox sixesP2;

	/** The sixes P 3. */
	@FXML private CheckBox sixesP3;

	/** The sixes P 4. */
	@FXML private CheckBox sixesP4;

	/** The sm str P 1. */
	@FXML private CheckBox smStrP1;

	/** The sm str P 2. */
	@FXML private CheckBox smStrP2;

	/** The sm str P 3. */
	@FXML private CheckBox smStrP3;

	/** The sm str P 4. */
	@FXML private CheckBox smStrP4;

	/** The threes P 1. */
	@FXML private CheckBox threesP1;

	/** The threes P 2. */
	@FXML private CheckBox threesP2;

	/** The threes P 3. */
	@FXML private CheckBox threesP3;

	/** The threes P 4. */
	@FXML private CheckBox threesP4;

	/** The twos P 1. */
	@FXML private CheckBox twosP1;

	/** The twos P 2. */
	@FXML private CheckBox twosP2;

	/** The twos P 3. */
	@FXML private CheckBox twosP3;

	/** The twos P 4. */
	@FXML private CheckBox twosP4;

	/** The yahtzee 1 P 1. */
	@FXML private CheckBox yahtzee1P1;

	/** The yahtzee 1 P 2. */
	@FXML private CheckBox yahtzee1P2;

	/** The yahtzee 1 P 3. */
	@FXML private CheckBox yahtzee1P3;

	/** The yahtzee 1 P 4. */
	@FXML private CheckBox yahtzee1P4;

	/** The yahtzee 2 P 1. */
	@FXML private CheckBox yahtzee2P1;

	/** The yahtzee 2 P 2. */
	@FXML private CheckBox yahtzee2P2;

	/** The yahtzee 2 P 3. */
	@FXML private CheckBox yahtzee2P3;

	/** The yahtzee 2 P 4. */
	@FXML private CheckBox yahtzee2P4;

	/** The yahtzee 3 P 1. */
	@FXML private CheckBox yahtzee3P1;

	/** The yahtzee 3 P 2. */
	@FXML private CheckBox yahtzee3P2;

	/** The yahtzee 3 P 3. */
	@FXML private CheckBox yahtzee3P3;

	/** The yahtzee 3 P 4. */
	@FXML private CheckBox yahtzee3P4;

	/** The yahtzee 4 P 1. */
	@FXML private CheckBox yahtzee4P1;

	/** The yahtzee 4 P 2. */
	@FXML private CheckBox yahtzee4P2;

	/** The yahtzee 4 P 3. */
	@FXML private CheckBox yahtzee4P3;

	/** The yahtzee 4 P 4. */
	@FXML private CheckBox yahtzee4P4;

	/** The player tab pane. */
	@FXML private TabPane playerTabPane;

	/** The score. */
	@FXML private Button score; // temp button to simulate scoring

	/**
	 * Inits the player names.
	 */
	public void initiateArrays(){
		playerName = new Label[4];
		playerName[0] = player1name;
		playerName[1] = player2name;
		playerName[2] = player3name;
		playerName[3] = player4name;
		playerTab = new Tab[4];
		playerTab[0] = player1tab;
		playerTab[1] = player2tab;
		playerTab[2] = player3tab;
		playerTab[3] = player4tab;
		locks = new ToggleButton[5];
		locks[0] = lockButton1;
		locks[1] = lockButton2;
		locks[2] = lockButton3;
		locks[3] = lockButton4;
		locks[4] = lockButton5;
		diePicture = new ImageView[5];
		diePicture[0] = dieV1;
		diePicture[1] = dieV2;
		diePicture[2] = dieV3;
		diePicture[3] = dieV4;
		diePicture[4] = dieV5;
		scoreCard = new CheckBox[4][16];
		scoreCard[0][0] = acesP1;
		scoreCard[0][1] = twosP1;
		scoreCard[0][2] = threesP1;
		scoreCard[0][3] = foursP1;
		scoreCard[0][4] = fivesP1;
		scoreCard[0][5] = sixesP1;
		scoreCard[0][6] = l3oKP1;
		scoreCard[0][7] = l4oKP1;
		scoreCard[0][8] = fullHouseP1;
		scoreCard[0][9] = smStrP1;
		scoreCard[0][10] = lrgStrP1;
		scoreCard[0][11] = yahtzee1P1;
		scoreCard[0][12] = chanceP1;
		scoreCard[0][13] = yahtzee2P1;
		scoreCard[0][14] = yahtzee3P1;
		scoreCard[0][15] = yahtzee4P1;
		scoreCard[1][0] = acesP2;
		scoreCard[1][1] = twosP2;
		scoreCard[1][2] = threesP2;
		scoreCard[1][3] = foursP2;
		scoreCard[1][4] = fivesP2;
		scoreCard[1][5] = sixesP2;
		scoreCard[1][6] = l3oKP2;
		scoreCard[1][7] = l4oKP2;
		scoreCard[1][8] = fullHouseP2;
		scoreCard[1][9] = smStrP2;
		scoreCard[1][10] = lrgStrP2;
		scoreCard[1][11] = yahtzee1P2;
		scoreCard[1][12] = chanceP2;
		scoreCard[1][13] = yahtzee2P2;
		scoreCard[1][14] = yahtzee3P2;
		scoreCard[1][15] = yahtzee4P2;
		scoreCard[2][0] = acesP3;
		scoreCard[2][1] = twosP3;
		scoreCard[2][2] = threesP3;
		scoreCard[2][3] = foursP3;
		scoreCard[2][4] = fivesP3;
		scoreCard[2][5] = sixesP3;
		scoreCard[2][6] = l3oKP3;
		scoreCard[2][7] = l4oKP3;
		scoreCard[2][8] = fullHouseP3;
		scoreCard[2][9] = smStrP3;
		scoreCard[2][10] = lrgStrP3;
		scoreCard[2][11] = yahtzee1P3;
		scoreCard[2][12] = chanceP3;
		scoreCard[2][13] = yahtzee2P3;
		scoreCard[2][14] = yahtzee3P3;
		scoreCard[2][15] = yahtzee4P3;
		scoreCard[3][0] = acesP4;
		scoreCard[3][1] = twosP4;
		scoreCard[3][2] = threesP4;
		scoreCard[3][3] = foursP4;
		scoreCard[3][4] = fivesP4;
		scoreCard[3][5] = sixesP4;
		scoreCard[3][6] = l3oKP4;
		scoreCard[3][7] = l4oKP4;
		scoreCard[3][8] = fullHouseP4;
		scoreCard[3][9] = smStrP4;
		scoreCard[3][10] = lrgStrP4;
		scoreCard[3][11] = yahtzee1P4;
		scoreCard[3][12] = chanceP4;
		scoreCard[3][13] = yahtzee2P4;
		scoreCard[3][14] = yahtzee3P4;
		scoreCard[3][15] = yahtzee4P4;
	}
}


