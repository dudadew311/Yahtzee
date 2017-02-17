package controllers.pages;

import java.util.ArrayList;
import java.util.Arrays;

import application.Die;
import application.ScoreCard;
import controllers.MainController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


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

	/** The dice. */
	private Die []dice = {die1,die2,die3,die4,die5};

	/** The score card. */
	private CheckBox[][] scoreCard;

	/** The die picture. */
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

	
	/** The roll result. */
	private int[] rollResult = {
			die1.getSide(),
			die2.getSide(),
			die3.getSide(),
			die4.getSide(),
			die5.getSide()
	};
	
	/** The player scores. */
	private Label[] playerScores;

	/** The players. */
	private ScoreCard []players;


	/** The main controller. */
	@SuppressWarnings("unused")
	private MainController main;

	/** The player up. */
	private int playerUp = 0;
	
	/** The winner. */
	public static String winner = "Raul";

	/**
	 * Sets the names on score card.
	 */
	public void setNames() {
		initiateArrays();
		for(int i=0;i<players.length;i++){
			players[i].resetScores();
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<16;j++) {
			scoreCard[i][j].setText("");
			scoreCard[i][j].setSelected(false);
			initiateArrays();
			}
			upperScore[i].setText("0");
			upperBonus[i].setText("0");	
			upperTotal[i].setText("0");
			lowUpperScore[i].setText("0");
			yatzeeBonusScore[i].setText("0");
			lowerScore[i].setText("0");
			grandTotal[i].setText("0");
		}
		for (int i=0;i<playerName.length;i++){
			if (players[i].isValid()) {
				playerName[i].setText(players[i].getName());
				playerScores[i].setText("0");
				playerTab[i].setText(players[i].getName());
				playerTab[i].setDisable(false);	
			} else {
				playerName[i].setText("");
				playerScores[i].setText("");
				playerTab[i].setText("");
				playerTab[i].setDisable(true);
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
		initiateArrays();
		playerUp = 0;
		roundNum = 0;
		rollNum = 3;
		lockPossibles();
		int flag = 0;
		rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
		roundsLbl.setText(String.valueOf(roundNum+1));
		next.setDisable(true);

		for(int i=0;i<players.length;i++){
			if(players[i].isValid()){
				playerUpLbl.setText(players[i].getName());
				playerTabPane.getSelectionModel().select(i);
				unlockRollButton();
				playerUp = i;
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
	private void unlockNextButton(){
		next.setDisable(false);

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
		next.setDisable(true);
		playerTabPane.getSelectionModel().select(playerUp);
		rollNum--;
		if (rollNum == 0){
			lockRollButton();
			unlockNextButton();
			for(int i=0;i<rollResult.length;i++){
				rollResult[i] = dice[i].getSide();
			}
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
			for(int i=0;i<players.length;i++){
				if (players[i].isValid()) {
					playerUp = i;
					break;
				}
			}
			++roundNum;
			if (roundNum >= 13){
				roundsLbl.setText("Game Over");
				doPopup();
			}
			roundsLbl.setText(String.valueOf(roundNum + 1));
			playerUpLbl.setText(players[playerUp].getName());
			playerTabPane.getSelectionModel().select(playerUp);
		}
	}

	/**
	 * Do popup.
	 */
	private void doPopup() {

		try {
			winner = getWinner();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Pages/GameOver.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initOwner(next.getScene().getWindow());
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.showAndWait();
		} catch (Exception e) {
			System.out.println("somthing wrong with loading");
			e.printStackTrace();
		}
	}

	/**
	 * Gets the winner.
	 *
	 * @return the winner
	 */
	private String getWinner() {
		int player = 0, highScore = 0;
		for(int i=0;i<players.length;i++){
			if(players[i].getScore() > highScore){
				highScore = players[i].getScore();
				player = i;
			}
		}
		return players[player].getName();	
	}

	/**
	 * Select score click.
	 */
	@FXML
	private void selectScoreClick() {
		for(int i=0;i<playerScores.length;i++){
			if(players[i].isValid()){
				playerScores[i].setText(Integer.toString(players[i].getScore()));
			} else {
				playerScores[i].setText("");
			}
			
		}
		upperScore[playerUp].setText(Integer.toString(players[playerUp].getUpperScore()));
		upperBonus[playerUp].setText(Integer.toString(players[playerUp].getUpperBonus()));	
		upperTotal[playerUp].setText(Integer.toString(players[playerUp].getUpperTotal()));
		lowUpperScore[playerUp].setText(Integer.toString(players[playerUp].getUpperTotal()));
		yatzeeBonusScore[playerUp].setText(Integer.toString(players[playerUp].getYahtzeeBonusScore()));
		lowerScore[playerUp].setText(Integer.toString(players[playerUp].getLowerScore()));
		grandTotal[playerUp].setText(Integer.toString(players[playerUp].getScore()));
		lockPossibles();	
	}
	
	/**
	 * Next button click.
	 */
	@FXML
	private void nextButtonClick() {
	
		for (int i=0;i<dice.length;i++){
			dice[i].resetDiePicture();
			diePicture[i].setImage(dice[i].getDiePicture());
		}	
		rollNum = 3;
		rollButton.setText("ROLL\n"+ String.valueOf(rollNum) + " Left");
		++playerUp;	
		checkPlayer();
		if(roundNum < 13) {
			rollButton.setDisable(false);
		}
		next.setDisable(true);
		lockPossibles();
		resetLocks();
	}
	

	/**
	 * Select score.
	 */
	private void selectScore(){
		unlockPossibles();
	}

	/**
	 * Creates the players.
	 */
	public void createPlayers(){
		ScoreCard player1 = new ScoreCard(MainController.player1.getName(), true);
		ScoreCard player2 = new ScoreCard(MainController.player2.getName(), true);
		ScoreCard player3 = new ScoreCard(MainController.player3.getName(), true);
		ScoreCard player4 = new ScoreCard(MainController.player4.getName(), true);
		players = new ScoreCard[4];
		players[0] = player1;
		players[1] = player2;
		players[2] = player3;
		players[3] = player4;
		for(int i=0;i<players.length;i++){
			players[i].resetScores();
		}
	}

	/**
	 * Checks if is aces.
	 *
	 * @param roll the roll
	 * @return true, if is aces
	 */
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
	
	/**
	 * Checks if is twos.
	 *
	 * @param roll the roll
	 * @return true, if is twos
	 */
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
	
	/**
	 * Checks if is threes.
	 *
	 * @param roll the roll
	 * @return true, if is threes
	 */
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
	
	/**
	 * Checks if is fours.
	 *
	 * @param roll the roll
	 * @return true, if is fours
	 */
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
	
	/**
	 * Checks if is fives.
	 *
	 * @param roll the roll
	 * @return true, if is fives
	 */
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
	
	/**
	 * Checks if is sixes.
	 *
	 * @param roll the roll
	 * @return true, if is sixes
	 */
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
	
	/**
	 * Checks if is 3 o K.
	 *
	 * @param roll the roll
	 * @return true, if is 3 o K
	 */
	private static boolean is3oK(int[] roll) {
		int count = 0, highestCount = 0;
		for(int i=0;i<(roll.length);i++){
			for(int j=0;j<(roll.length);j++){
				if (roll[i] == roll[j]){
					count++;
				}
			}
			if (count >= highestCount){
				highestCount = count;
			}
			count = 0;
		}
		if(highestCount >= 3){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if is 4 o K.
	 *
	 * @param roll the roll
	 * @return true, if is 4 o K
	 */
	private static boolean is4oK(int[] roll) {
		int count = 0, highestCount = 0;
		for(int i=0;i<(roll.length);i++){
			for (int j = 0; j < (roll.length); j++) {
				if (roll[i] == roll[j]){
					count++;
				}
			}
			if (count >= highestCount){
				highestCount = count;
				
			}
			count =0;
		}
		if(highestCount >= 4){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if is full house.
	 *
	 * @param roll the roll
	 * @return true, if is full house
	 */
	private static boolean isFullHouse(int[] roll) {
		int count1 = 0, count2 = 0;
		Arrays.sort(roll);
		for(int i=0;i<roll.length;i++){
			if(roll[i] == roll[0]){
				count1++;
			}
		}
		for(int i=0;i<roll.length;i++){
			if(roll[i] == roll[4]){
				count2++;
			}
		}
		if(((count1 == 2) && (count2 == 3)) || ((count1 == 3) && (count2 == 2))){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if is sm str.
	 *
	 * @param roll the roll
	 * @return true, if is sm str
	 */
	private static boolean isSmStr(int[] roll) {       
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		Arrays.sort(roll);
		for(int i=0;i<(roll.length-1);i++) {
			if(roll[i] == roll[i+1]) {
				
			}else if(roll[i]+1 == roll[i+1]){
			
				list.add(roll[i]);
			} else {
				list.clear();
			}
		}
		if(list.size()>=3){
			return true;
		} else {
			return false;
		}

	}
	
	/**
	 * Checks if is lrg str.
	 *
	 * @param roll the roll
	 * @return true, if is lrg str
	 */
	private static boolean isLrgStr(int[] roll) {
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
	
	/**
	 * Checks if is yahtzee.
	 *
	 * @param roll the roll
	 * @return true, if is yahtzee
	 */
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
	
	/**
	 * Unlock possibles.
	 */
	private void unlockPossibles() {
		
		if(isAces(rollResult) && !players[playerUp].isAcesUsed()) {
			scoreCard[playerUp][0].setDisable(false);
			scoreCard[playerUp][0].setStyle("-fx-background-color: blue;");
		}
		if(isTwos(rollResult) && !players[playerUp].isTwosUsed()) {
			scoreCard[playerUp][1].setDisable(false);
			scoreCard[playerUp][1].setStyle("-fx-background-color: blue;");
		}
		if(isThrees(rollResult) && !players[playerUp].isThreesUsed()) {
			scoreCard[playerUp][2].setDisable(false);
			scoreCard[playerUp][2].setStyle("-fx-background-color: blue;");
		}
		if(isFours(rollResult) && !players[playerUp].isFoursUsed()) {
			scoreCard[playerUp][3].setDisable(false);
			scoreCard[playerUp][3].setStyle("-fx-background-color: blue;");
		}
		if(isFives(rollResult) && !players[playerUp].isFivesUsed()) {
			scoreCard[playerUp][4].setDisable(false);
			scoreCard[playerUp][4].setStyle("-fx-background-color: blue;");
		}
		if(isSixes(rollResult) && !players[playerUp].isSixesUsed()) {
			scoreCard[playerUp][5].setDisable(false);
			scoreCard[playerUp][5].setStyle("-fx-background-color: blue;");
		}
		if(is3oK(rollResult) && !players[playerUp].isL3oKUsed()) {
			scoreCard[playerUp][6].setDisable(false);
			scoreCard[playerUp][6].setStyle("-fx-background-color: blue;");
		}
		if(is4oK(rollResult) && !players[playerUp].isL4oKUsed()) {
			scoreCard[playerUp][7].setDisable(false);
			scoreCard[playerUp][7].setStyle("-fx-background-color: blue;");
		}
		if(isFullHouse(rollResult) && !players[playerUp].isFullHouseUsed()) {
			scoreCard[playerUp][8].setDisable(false);
			scoreCard[playerUp][8].setStyle("-fx-background-color: blue;");
		}
		if(isSmStr(rollResult) && !players[playerUp].isSmallStrUsed()) {
			scoreCard[playerUp][9].setDisable(false);
			scoreCard[playerUp][9].setStyle("-fx-background-color: blue;");
		}
		if(isLrgStr(rollResult) && !players[playerUp].isLrgStrUsed()) {
			scoreCard[playerUp][10].setDisable(false);
			scoreCard[playerUp][10].setStyle("-fx-background-color: blue;");
		}
		if(isYahtzee(rollResult) && !players[playerUp].isYahtzeeUsed()) {
			scoreCard[playerUp][11].setDisable(false);
			scoreCard[playerUp][11].setStyle("-fx-background-color: blue;");
		}
		if(!players[playerUp].isChanceUsed()) {
			scoreCard[playerUp][12].setDisable(false);
			scoreCard[playerUp][12].setStyle("-fx-background-color: blue;");
		}
		if(isYahtzee(rollResult) && !players[playerUp].isYahtzeeBonus1Used() && players[playerUp].isYahtzeeUsed()) {
			scoreCard[playerUp][13].setDisable(false);
			scoreCard[playerUp][13].setStyle("-fx-background-color: blue;");
		}
		if(isYahtzee(rollResult) && !players[playerUp].isYahtzeeBonus2Used() && players[playerUp].isYahtzeeUsed()){
			scoreCard[playerUp][14].setDisable(false);
			scoreCard[playerUp][14].setStyle("-fx-background-color: blue;");
		}
		if(isYahtzee(rollResult) && !players[playerUp].isYahtzeeBonus3Used() && players[playerUp].isYahtzeeUsed()) {
			scoreCard[playerUp][15].setDisable(false);
			scoreCard[playerUp][15].setStyle("-fx-background-color: blue;");
		}
	}
	
	
	/**
	 * Lock possibles.
	 */
	private void lockPossibles() {
		for(int i=0;i<4;i++){
			for(int j=0;j<16;j++) {
			scoreCard[i][j].setDisable(true);
			scoreCard[i][j].setStyle(null);
			initiateArrays();
			}
		}
	}
	
	/**
	 * Aces button click.
	 */
	@FXML
	private void acesButtonClick() {
		players[playerUp].setAcesScore(rollResult);
		scoreCard[playerUp][0].setText(Integer.toString(players[playerUp].getAcesScore()));
		selectScoreClick();
	}
	
	/**
	 * Twos button click.
	 */
	@FXML
	private void twosButtonClick() {
		players[playerUp].setTwosScore(rollResult);
		scoreCard[playerUp][1].setText(Integer.toString(players[playerUp].getTwosScore()));
		selectScoreClick();
	}
	
	/**
	 * Threes button click.
	 */
	@FXML
	private void threesButtonClick() {
		players[playerUp].setThreesScore(rollResult);
		scoreCard[playerUp][2].setText(Integer.toString(players[playerUp].getThreesScore()));
		selectScoreClick();
	}
	
	/**
	 * Fours button click.
	 */
	@FXML
	private void foursButtonClick() {
		players[playerUp].setFoursScore(rollResult);
		scoreCard[playerUp][3].setText(Integer.toString(players[playerUp].getFoursScore()));
		selectScoreClick();
	}
	
	/**
	 * Fives button click.
	 */
	@FXML
	private void fivesButtonClick() {
		players[playerUp].setFivesScore(rollResult);
		scoreCard[playerUp][4].setText(Integer.toString(players[playerUp].getFivesScore()));
		selectScoreClick();
	}
	
	/**
	 * Sixes button click.
	 */
	@FXML
	private void sixesButtonClick() {
		players[playerUp].setSixesScore(rollResult);
		scoreCard[playerUp][5].setText(Integer.toString(players[playerUp].getSixesScore()));
		selectScoreClick();
	}
	
	/**
	 * L 3 o K button click.
	 */
	@FXML
	private void l3oKButtonClick() {
		players[playerUp].setL3oKScore(rollResult);
		scoreCard[playerUp][6].setText(Integer.toString(players[playerUp].getL3oKScore()));
		selectScoreClick();
	}
	
	/**
	 * L 4 o K button click.
	 */
	@FXML
	private void l4oKButtonClick() {
		players[playerUp].setL4oKScore(rollResult);
		scoreCard[playerUp][7].setText(Integer.toString(players[playerUp].getL4oKScore()));
		selectScoreClick();
	}
	
	/**
	 * Full house button click.
	 */
	@FXML
	private void fullHouseButtonClick() {
		players[playerUp].setFullHouseScore();
		scoreCard[playerUp][8].setText(Integer.toString(players[playerUp].getFullHouseScore()));
		selectScoreClick();
	}
	
	/**
	 * Sm str button click.
	 */
	@FXML
	private void smStrButtonClick() {
		players[playerUp].setSmallStrScore();
		scoreCard[playerUp][9].setText(Integer.toString(players[playerUp].getSmallStrScore()));
		selectScoreClick();
	}
	
	/**
	 * Lrg str button click.
	 */
	@FXML
	private void lrgStrButtonClick() {
		players[playerUp].setLrgStrScore();
		scoreCard[playerUp][10].setText(Integer.toString(players[playerUp].getLrgStrScore()));
		selectScoreClick();
	}
	
	/**
	 * Yahtzee 1 button click.
	 */
	@FXML
	private void yahtzee1ButtonClick() {
		players[playerUp].setYahtzeeScore();
		scoreCard[playerUp][11].setText(Integer.toString(players[playerUp].getYahtzeeScore()));
		selectScoreClick();
	}
	
	/**
	 * Chance button click.
	 */
	@FXML
	private void chanceButtonClick() {
		players[playerUp].setChanceScore(rollResult);
		scoreCard[playerUp][12].setText(Integer.toString(players[playerUp].getChanceScore()));
		selectScoreClick();
	}
	
	/**
	 * Yahtzee 2 button click.
	 */
	@FXML
	private void yahtzee2ButtonClick() {
		players[playerUp].setYahtzeeBonus1Used(true);
		selectScoreClick();
	}
	
	/**
	 * Yahtzee 3 button click.
	 */
	@FXML
	private void yahtzee3ButtonClick() {
		players[playerUp].setYahtzeeBonus2Used(true);
		selectScoreClick();
	}
	
	/**
	 * Yahtzee 4 button click.
	 */
	@FXML
	private void yahtzee4ButtonClick() {
		players[playerUp].setYahtzeeBonus3Used(true);
		selectScoreClick();
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
	@FXML private Button next; 
	
	/** The upper score P 1. */
	@FXML private Label upperScoreP1;
	
	/** The upper score P 2. */
	@FXML private Label upperScoreP2;
	
	/** The upper score P 3. */
	@FXML private Label upperScoreP3;
	
	/** The upper score P 4. */
	@FXML private Label upperScoreP4;
	
	/** The upper score. */
	private Label[] upperScore;
	
	/** The upper bonus P 1. */
	@FXML private Label upperBonusP1;
	
	/** The upper bonus P 2. */
	@FXML private Label upperBonusP2;
	
	/** The upper bonus P 3. */
	@FXML private Label upperBonusP3;
	
	/** The upper bonus P 4. */
	@FXML private Label upperBonusP4;
	
	/** The upper bonus. */
	private Label[] upperBonus;
	
	/** The upper total P 1. */
	@FXML private Label upperTotalP1;
	
	/** The upper total P 2. */
	@FXML private Label upperTotalP2;
	
	/** The upper total P 3. */
	@FXML private Label upperTotalP3;
	
	/** The upper total P 4. */
	@FXML private Label upperTotalP4;
	
	/** The upper total. */
	private Label[] upperTotal;
	
	/** The yatzee bonus score P 1. */
	@FXML private Label yatzeeBonusScoreP1;

	/** The yatzee bonus score P 2. */
	@FXML private Label yatzeeBonusScoreP2;
	
	/** The yatzee bonus score P 3. */
	@FXML private Label yatzeeBonusScoreP3;
	
	/** The yatzee bonus score P 4. */
	@FXML private Label yatzeeBonusScoreP4;
	
	/** The yatzee bonus score. */
	private Label[] yatzeeBonusScore;
	
	/** The lower score P 1. */
	@FXML private Label lowerScoreP1;
	
	/** The lower score P 2. */
	@FXML private Label lowerScoreP2;
	
	/** The lower score P 3. */
	@FXML private Label lowerScoreP3;
	
	/** The lower score P 4. */
	@FXML private Label lowerScoreP4;
	
	/** The lower score. */
	private Label[] lowerScore;
	
	/** The low upper score P 1. */
	@FXML private Label lowUpperScoreP1;
	
	/** The low upper score P 2. */
	@FXML private Label lowUpperScoreP2;
	
	/** The low upper score P 3. */
	@FXML private Label lowUpperScoreP3;
	
	/** The low upper score P 4. */
	@FXML private Label lowUpperScoreP4;
	
	/** The low upper score. */
	private Label[] lowUpperScore;
	
	/** The grand total P 1. */
	@FXML private Label grandTotalP1;
	
	/** The grand total P 2. */
	@FXML private Label grandTotalP2;
	
	/** The grand total P 3. */
	@FXML private Label grandTotalP3;
	
	/** The grand total P 4. */
	@FXML private Label grandTotalP4;
	
	/** The grand total. */
	private Label[] grandTotal;

	/**
	 * Inits the player names.
	 */
	public void initiateArrays(){
		upperScore = new Label[4];
		upperScore[0] = upperScoreP1;
		upperScore[1] = upperScoreP2;
		upperScore[2] = upperScoreP3;
		upperScore[3] = upperScoreP4;
		upperBonus = new Label[4];
		upperBonus[0] = upperBonusP1;
		upperBonus[1] = upperBonusP2;
		upperBonus[2] = upperBonusP3;
		upperBonus[3] = upperBonusP4;
		upperTotal = new Label[4];
		upperTotal[0] = upperTotalP1;
		upperTotal[1] = upperTotalP2;
		upperTotal[2] = upperTotalP3;
		upperTotal[3] = upperTotalP4;
		yatzeeBonusScore = new Label[4];
		yatzeeBonusScore[0] = yatzeeBonusScoreP1;
		yatzeeBonusScore[1] = yatzeeBonusScoreP2;
		yatzeeBonusScore[2] = yatzeeBonusScoreP3;
		yatzeeBonusScore[3] = yatzeeBonusScoreP4;
		lowerScore = new Label[4];
		lowerScore[0] = lowerScoreP1;
		lowerScore[1] = lowerScoreP2;
		lowerScore[2] = lowerScoreP3;
		lowerScore[3] = lowerScoreP4;
		lowUpperScore = new Label[4];
		lowUpperScore[0] = lowUpperScoreP1;
		lowUpperScore[1] = lowUpperScoreP2;
		lowUpperScore[2] = lowUpperScoreP3;
		lowUpperScore[3] = lowUpperScoreP4;
		grandTotal = new Label[4];
		grandTotal[0] = grandTotalP1;
		grandTotal[1] = grandTotalP2;
		grandTotal[2] = grandTotalP3;
		grandTotal[3] = grandTotalP4;
		playerName = new Label[4];
		playerName[0] = player1name;
		playerName[1] = player2name;
		playerName[2] = player3name;
		playerName[3] = player4name;
		playerScores = new Label[4];
		playerScores[0] = player1score;
		playerScores[1] = player2score;
		playerScores[2] = player3score;
		playerScores[3] = player4score;
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


