package controllers.pages;

/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

import java.io.IOException;

import application.Die;
import application.Main;
import application.Player;
import controllers.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

// TODO: Auto-generated Javadoc
/**
 * The Class GamePlayController.
 */
public class GamePlayController {

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
	
	/** The round num. */
	private int roundNum = 0;
	
	/** The roll num. */
	private int rollNum = 3;
	
	/** The players. */
	private Player []players = {
		Main.player1,
		Main.player2,
		Main.player3,
		Main.player4,
	};
	
	/** The main. */
	private MainController main;
	
	/** The player up. */
	private int playerUp = 0;
	
	/** The die 1. */
	Die die1 = new Die();
	
	/** The die 2. */
	Die die2 = new Die();
	
	/** The die 3. */
	Die die3 = new Die();
	
	/** The die 4. */
	Die die4 = new Die();
	
	/** The die 5. */
	Die die5 = new Die();
	
	
	
	/** The die 1 pic. */
	private Image die1pic = new Image("/images/Die1.png");
	
	/** The die 2 pic. */
	private Image die2pic = new Image("/images/Die2.png");
	
	/** The die 3 pic. */
	private Image die3pic = new Image("/images/Die3.png");
	
	/** The die 4 pic. */
	private Image die4pic = new Image("/images/Die4.png");
	
	/** The die 5 pic. */
	private Image die5pic = new Image("/images/Die5.png");
	
	/** The die 6 pic. */
	private Image die6pic = new Image("/images/Die6.png");
	
	/**
	 * Initializes the Main controller.
	 *
	 * @param mainController the main controller
	 */
	public void init(MainController mainController) {
		main = mainController;	
	}
	
 	/**
	  * Checks to see if player 1 was entered
	  * If true, Sets up the player.
	  *
	  * @param p the new p1
	  */
	 public void setP1(String p) {
	 	if (p.compareTo(" ")>0) {
			player1name.setText(p);
			player1tab.setText(p);	
			player1tab.setDisable(false);
			players[0].setValid(true);
			System.out.println("something");
		} else {
			player1name.setText("");
			player1tab.setText("");
			player1tab.setDisable(true);
			player1score.setText("");
			players[0].setValid(false);
			System.out.println("nothing");
			
		}
	}
	
	/**
	 * Checks to see if player 2 was entered
	 * If true, Sets up the player.
	 *
	 * @param p the new p2
	 */
	public void setP2(String p) {
		if (p.compareTo(" ")>0) {
			player2name.setText(p);
			player2tab.setText(p);	
			player2tab.setDisable(false);
			players[1].setValid(true);
			System.out.println("something");
		} else {
			player2name.setText("");
			player2tab.setText("");
			player2tab.setDisable(true);
			player2score.setText("");
			players[1].setValid(false);
			System.out.println("nothing");
			
		}
	}
	
	/**
	 * Checks to see if player 3 was entered
	 * If true, Sets up the player.
	 *
	 * @param p the new p3
	 */
	public void setP3(String p) {
		if (p.compareTo(" ")>0) {
			player3name.setText(p);
			player3tab.setText(p);	
			player3tab.setDisable(false);
			players[2].setValid(true);
			System.out.println("something");
		} else {
			player3name.setText("");
			player3tab.setText("");
			player3tab.setDisable(true);
			player3score.setText("");
			players[2].setValid(false);
			System.out.println("nothing");
			
		}
	}
	
	/**
	 * Checks to see if player 4 was entered
	 * If true, Sets up the player.
	 *
	 * @param p the new p4
	 */
	public void setP4(String p) {
		if (p.compareTo(" ")>0) {
			player4name.setText(p);
			player4tab.setText(p);	
			player4tab.setDisable(false);
			players[3].setValid(true);
			System.out.println("something");
		} else {
			player4name.setText("");
			player4tab.setText("");
			player4tab.setDisable(true);
			player4score.setText("");
			players[3].setValid(false);
			System.out.println("nothing");
			
		}
	}

	/**
	 * New game.
	 */
	public void newGame(){
		playerUp = 0;
		roundNum = 0;
		rollNum = 3;
		rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
		roundsLbl.setText(String.valueOf(roundNum+1));
		
		
		if(players[0].isValid()){
			playerUpLbl.setText(players[0].getName());
			playerTabPane.getSelectionModel().select(0);
			unlockRollButton();
			unlockScoreButton();
		} else if(players[1].isValid()){
			playerUpLbl.setText(players[1].getName());
			playerTabPane.getSelectionModel().select(1);
			unlockRollButton();
			unlockScoreButton();
		} else if(players[2].isValid()){
			playerUpLbl.setText(players[2].getName());
			playerTabPane.getSelectionModel().select(2);
			unlockRollButton();
			unlockScoreButton();
		} else if(players[3].isValid()){
			playerUpLbl.setText(players[3].getName());
			playerTabPane.getSelectionModel().select(3);
			unlockRollButton();
			unlockScoreButton();
		} else {
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
	 * Roll button click.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void rollButtonClick(ActionEvent event) throws IOException{
		if(rollNum == 3){
			resetLocks();
		}
		setDie1();
		setDie2();
		setDie3();
		setDie4();
		setDie5();
		checkRolls();
	}
	
	/**
	 * Check rolls.
	 */
	private void checkRolls(){
		rollNum--;
		if (rollNum == 0){
			lockRollButton();
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
			
		}
	}
	
	/**
	 * Select score click.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void selectScoreClick(ActionEvent event) throws IOException{
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
		System.out.println("This is when player would select score");
		System.out.println("Die show: "+die1.getSide()+":"+die2.getSide() +":"+die3.getSide()+":"+die4.getSide()+":"+die5.getSide());
//		try {
//		    Thread.sleep(5000);
//		} catch(InterruptedException ex) {
//		    Thread.currentThread().interrupt();
//		}
	}
	
	/**
	 * Sets the die 1.
	 */
	private void setDie1(){
		die1.setSide();

		try {
			switch(die1.getSide()){
			case 1:
				dieV1.setImage(die1pic);
				break;
			case 2:
				dieV1.setImage(die2pic);
				break;
			case 3:
				dieV1.setImage(die3pic);
				break;
			case 4:
				dieV1.setImage(die4pic);
				break;
			case 5:
				dieV1.setImage(die5pic);
				break;
			case 6:
				dieV1.setImage(die6pic);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the die 2.
	 */
	private void setDie2(){
		try {
			die2.setSide();
			
			
			switch(die2.getSide()){
			case 1:
				dieV2.setImage(die1pic);
				break;
			case 2:
				dieV2.setImage(die2pic);
				break;
			case 3:
				dieV2.setImage(die3pic);
				break;
			case 4:
				dieV2.setImage(die4pic);
				break;
			case 5:
				dieV2.setImage(die5pic);
				break;
			case 6:
				dieV2.setImage(die6pic);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Sets the die 3.
	 */
	private void setDie3(){
		die3.setSide();

		
		try {
			switch(die3.getSide()){
			case 1:
				dieV3.setImage(die1pic);
				break;
			case 2:
				dieV3.setImage(die2pic);
				break;
			case 3:
				dieV3.setImage(die3pic);
				break;
			case 4:
				dieV3.setImage(die4pic);
				break;
			case 5:
				dieV3.setImage(die5pic);
				break;
			case 6:
				dieV3.setImage(die6pic);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Sets the die 4.
	 */
	private void setDie4(){
		die4.setSide();

		
		try {
			switch(die4.getSide()){
			case 1:
				dieV4.setImage(die1pic);
				break;
			case 2:
				dieV4.setImage(die2pic);
				break;
			case 3:
				dieV4.setImage(die3pic);
				break;
			case 4:
				dieV4.setImage(die4pic);
				break;
			case 5:
				dieV4.setImage(die5pic);
				break;
			case 6:
				dieV4.setImage(die6pic);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Sets the die 5.
	 */
	private void setDie5(){
		die5.setSide();

		
		try {
			switch(die5.getSide()){
			case 1:
				dieV5.setImage(die1pic);
				break;
			case 2:
				dieV5.setImage(die2pic);
				break;
			case 3:
				dieV5.setImage(die3pic);
				break;
			case 4:
				dieV5.setImage(die4pic);
				break;
			case 5:
				dieV5.setImage(die5pic);
				break;
			case 6:
				dieV5.setImage(die6pic);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Lock die 1.
	 */
	@FXML
	private void lockDie1() {
		if (die1.isRoll()){
			die1.setRoll(false);
			lockButton1.setText("Locked");
		} else {
			die1.setRoll(true);
			lockButton1.setText("LOCK");
		}
	}
	
	/**
	 * Lock die 2.
	 */
	@FXML
	private void lockDie2() {
		if (die2.isRoll()){
			die2.setRoll(false);
			lockButton2.setText("Locked");
		} else {
			die2.setRoll(true);
			lockButton2.setText("LOCK");
		}
	}
	
	/**
	 * Lock die 3.
	 */
	@FXML
	private void lockDie3() {
		if (die3.isRoll()){
			die3.setRoll(false);
			lockButton3.setText("Locked");
		} else {
			die3.setRoll(true);
			lockButton3.setText("LOCK");
		}
	}
	
	/**
	 * Lock die 4.
	 */
	@FXML
	private void lockDie4() {
		if (die4.isRoll()){
			die4.setRoll(false);
			lockButton4.setText("Locked");
		} else {
			die4.setRoll(true);
			lockButton4.setText("LOCK");
		}
	}
	
	/**
	 * Lock die 5.
	 */
	@FXML
	private void lockDie5() {
		if (die5.isRoll()){
			die5.setRoll(false);
			lockButton5.setText("Locked");
		} else {
			die5.setRoll(true);
			lockButton5.setText("LOCK");
		}
	}
	
	/**
	 * Reset locks.
	 */
	public void resetLocks(){
		die1.setRoll(true);
		lockButton1.setText("LOCK");
		lockButton1.setSelected(false);
		die2.setRoll(true);
		lockButton2.setText("LOCK");
		lockButton2.setSelected(false);
		die3.setRoll(true);
		lockButton3.setText("LOCK");
		lockButton3.setSelected(false);
		die4.setRoll(true);
		lockButton4.setText("LOCK");
		lockButton4.setSelected(false);
		die5.setRoll(true);
		lockButton5.setText("LOCK");
		lockButton5.setSelected(false);
	}
}


