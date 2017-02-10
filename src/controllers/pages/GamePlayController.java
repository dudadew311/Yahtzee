package controllers.pages;

/**
 * @author 	Raul Diaz <dudadew311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

import java.io.IOException;

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
	
	private Die []dice = {
			die1,
			die2,
			die3,
			die4,
			die5
	};
	
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
	
	/** The players. */
	private ScoreCard []players = {
		MainController.player1,
		MainController.player2,
		MainController.player3,
		MainController.player4,
	};
	
	/** The main. */
	@SuppressWarnings("unused")
	private MainController main;
	
	/** The player up. */
	private int playerUp = 0;
	
	/**
	 * Inits the player names.
	 */
	public void initPlayerName(){
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
	}
	
	/**
	 * Sets the names on score card.
	 */
	public void setNames() {
		initPlayerName();
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

	}
}


