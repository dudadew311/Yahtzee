package controllers.pages;

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

public class GamePlayController {

	@FXML private CheckBox acesP1;
	@FXML private CheckBox acesP2;
	@FXML private CheckBox acesP3;
	@FXML private CheckBox acesP4;
	@FXML private CheckBox chanceP1;
	@FXML private CheckBox chanceP2;
	@FXML private CheckBox chanceP3;
	@FXML private CheckBox chanceP4;
	@FXML private ImageView dieV1;
	@FXML private ImageView dieV2;
	@FXML private ImageView dieV3;
	@FXML private ImageView dieV4;
	@FXML private ImageView dieV5;
	@FXML private CheckBox fivesP1;
	@FXML private CheckBox fivesP2;
	@FXML private CheckBox fivesP3;
	@FXML private CheckBox fivesP4;
	@FXML private CheckBox foursP1;
	@FXML private CheckBox foursP2;
	@FXML private CheckBox foursP3;
	@FXML private CheckBox foursP4;
	@FXML private CheckBox fullHouseP1;
	@FXML private CheckBox fullHouseP2;
	@FXML private CheckBox fullHouseP3;
	@FXML private CheckBox fullHouseP4;
	@FXML private CheckBox l3oKP1;
	@FXML private CheckBox l3oKP2;
	@FXML private CheckBox l3oKP3;
	@FXML private CheckBox l3oKP4;
	@FXML private CheckBox l4oKP1;
	@FXML private CheckBox l4oKP2;
	@FXML private CheckBox l4oKP3;
	@FXML private CheckBox l4oKP4;
	@FXML private ToggleButton lockButton1;
	@FXML private ToggleButton lockButton2;
	@FXML private ToggleButton lockButton3;
	@FXML private ToggleButton lockButton4;
	@FXML private ToggleButton lockButton5;
	@FXML private CheckBox lrgStrP1;
	@FXML private CheckBox lrgStrP2;
	@FXML private CheckBox lrgStrP3;
	@FXML private CheckBox lrgStrP4;
	@FXML private Label player1name;
	@FXML private Label player2name;
	@FXML private Label player3name;
	@FXML private Label player4name;
	@FXML private Label player1score;
	@FXML private Label player2score;
	@FXML private Label player3score;
	@FXML private Label player4score;
	@FXML private Tab player1tab;
	@FXML private Tab player2tab;
	@FXML private Tab player3tab;
	@FXML private Tab player4tab;
	@FXML private Text playerUpLbl;
	@FXML private Button rollButton;
	@FXML private Text roundsLbl;
	@FXML private CheckBox sixesP1;
	@FXML private CheckBox sixesP2;
	@FXML private CheckBox sixesP3;
	@FXML private CheckBox sixesP4;
	@FXML private CheckBox smStrP1;
	@FXML private CheckBox smStrP2;
	@FXML private CheckBox smStrP3;
	@FXML private CheckBox smStrP4;
	@FXML private CheckBox threesP1;
	@FXML private CheckBox threesP2;
	@FXML private CheckBox threesP3;
	@FXML private CheckBox threesP4;
	@FXML private CheckBox twosP1;
	@FXML private CheckBox twosP2;
	@FXML private CheckBox twosP3;
	@FXML private CheckBox twosP4;
	@FXML private CheckBox yahtzee1P1;
	@FXML private CheckBox yahtzee1P2;
	@FXML private CheckBox yahtzee1P3;
	@FXML private CheckBox yahtzee1P4;
	@FXML private CheckBox yahtzee2P1;
	@FXML private CheckBox yahtzee2P2;
	@FXML private CheckBox yahtzee2P3;
	@FXML private CheckBox yahtzee2P4;
	@FXML private CheckBox yahtzee3P1;
	@FXML private CheckBox yahtzee3P2;
	@FXML private CheckBox yahtzee3P3;
	@FXML private CheckBox yahtzee3P4;
	@FXML private CheckBox yahtzee4P1;
	@FXML private CheckBox yahtzee4P2;
	@FXML private CheckBox yahtzee4P3;
	@FXML private CheckBox yahtzee4P4;
	@FXML private TabPane playerTabPane;
	@FXML private Button score; // temp button to simulate scoring
	private int roundNum = 0;
	private int rollNum = 3;
	private Player []players = {
		Main.player1,
		Main.player2,
		Main.player3,
		Main.player4,
	};
	private MainController main;
	private int playerUp = 0;
	Die die1 = new Die();
	Die die2 = new Die();
	Die die3 = new Die();
	Die die4 = new Die();
	Die die5 = new Die();
	
	public void init(MainController mainController) {
		main = mainController;	
	}
	
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
	
	private void lockRollButton(){
		rollButton.setDisable(true);
	}
	
	private void unlockRollButton(){
		rollButton.setDisable(false);
	}
	
	private void unlockScoreButton(){
		score.setDisable(false);
	}
		
	
	
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
	
	private void selectScore(){
		System.out.println("This is when player would select score");
		System.out.println("Die show: "+die1.getSide()+":"+die2.getSide() +":"+die3.getSide()+":"+die4.getSide()+":"+die5.getSide());
//		try {
//		    Thread.sleep(5000);
//		} catch(InterruptedException ex) {
//		    Thread.currentThread().interrupt();
//		}
	}
	
	private void setDie1(){
		die1.setSide();
	
		Image one1Roll = new Image("die1.png");
		Image two2Roll = new Image("die2.png");
		Image three3Roll = new Image("die3.png");
		Image four4Roll = new Image("die4.png");
		Image five5Roll = new Image("die5.png");
		Image six6Roll = new Image("die6.png");
		
		
		switch(die1.getSide()){
		case 1:
			dieV1.setImage(one1Roll);
			break;
		case 2:
			dieV1.setImage(two2Roll);
			break;
		case 3:
			dieV1.setImage(three3Roll);
			break;
		case 4:
			dieV1.setImage(four4Roll);
			break;
		case 5:
			dieV1.setImage(five5Roll);
			break;
		case 6:
			dieV1.setImage(six6Roll);
			break;
		}
	}

	private void setDie2(){
		die2.setSide();
		
		Image one1Roll = new Image("die1.png");
		Image two2Roll = new Image("die2.png");
		Image three3Roll = new Image("die3.png");
		Image four4Roll = new Image("die4.png");
		Image five5Roll = new Image("die5.png");
		Image six6Roll = new Image("die6.png");
		
		
		switch(die2.getSide()){
		case 1:
			dieV2.setImage(one1Roll);
			break;
		case 2:
			dieV2.setImage(two2Roll);
			break;
		case 3:
			dieV2.setImage(three3Roll);
			break;
		case 4:
			dieV2.setImage(four4Roll);
			break;
		case 5:
			dieV2.setImage(five5Roll);
			break;
		case 6:
			dieV2.setImage(six6Roll);
			break;
		}
	}
	
	private void setDie3(){
		die3.setSide();
		
		Image one1Roll = new Image("die1.png");
		Image two2Roll = new Image("die2.png");
		Image three3Roll = new Image("die3.png");
		Image four4Roll = new Image("die4.png");
		Image five5Roll = new Image("die5.png");
		Image six6Roll = new Image("die6.png");
		
		
		switch(die3.getSide()){
		case 1:
			dieV3.setImage(one1Roll);
			break;
		case 2:
			dieV3.setImage(two2Roll);
			break;
		case 3:
			dieV3.setImage(three3Roll);
			break;
		case 4:
			dieV3.setImage(four4Roll);
			break;
		case 5:
			dieV3.setImage(five5Roll);
			break;
		case 6:
			dieV3.setImage(six6Roll);
			break;
		}
	}
	
	private void setDie4(){
		die4.setSide();
		
		Image one1Roll = new Image("die1.png");
		Image two2Roll = new Image("die2.png");
		Image three3Roll = new Image("die3.png");
		Image four4Roll = new Image("die4.png");
		Image five5Roll = new Image("die5.png");
		Image six6Roll = new Image("die6.png");
		
		
		switch(die4.getSide()){
		case 1:
			dieV4.setImage(one1Roll);
			break;
		case 2:
			dieV4.setImage(two2Roll);
			break;
		case 3:
			dieV4.setImage(three3Roll);
			break;
		case 4:
			dieV4.setImage(four4Roll);
			break;
		case 5:
			dieV4.setImage(five5Roll);
			break;
		case 6:
			dieV4.setImage(six6Roll);
			break;
		}
	}
	
	private void setDie5(){
		die5.setSide();
		
		Image one1Roll = new Image("die1.png");
		Image two2Roll = new Image("die2.png");
		Image three3Roll = new Image("die3.png");
		Image four4Roll = new Image("die4.png");
		Image five5Roll = new Image("die5.png");
		Image six6Roll = new Image("die6.png");
		
		
		switch(die5.getSide()){
		case 1:
			dieV5.setImage(one1Roll);
			break;
		case 2:
			dieV5.setImage(two2Roll);
			break;
		case 3:
			dieV5.setImage(three3Roll);
			break;
		case 4:
			dieV5.setImage(four4Roll);
			break;
		case 5:
			dieV5.setImage(five5Roll);
			break;
		case 6:
			dieV5.setImage(six6Roll);
			break;
		}
	}
	
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


