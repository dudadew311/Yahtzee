/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

package controllers;

import application.ScoreCard;
import controllers.pages.GamePlayController;
import controllers.pages.PlayerSelectController;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
public class MainController {
	
	/** The player 1. */
	public static ScoreCard player1 = new ScoreCard();
	
	/** The player 2. */
	public static ScoreCard player2 = new ScoreCard();
	
	/** The player 3. */
	public static ScoreCard player3 = new ScoreCard();
	
	/** The player 4. */
	public static ScoreCard player4 = new ScoreCard();
	
	/** The tab pane. */
	@FXML public TabPane tabPane;
	
	/** The player select controller. */
	@FXML private PlayerSelectController playerSelectController;
	
	/** The game play controller. */
	@FXML private GamePlayController gamePlayController;
	
	/**
	 * Initialize.
	 */
	@FXML public void initialize(){
		System.out.println("Game Started");
		playerSelectController.init(this);
		gamePlayController.init(this);
		gamePlayController.initPlayerName();
		
	}

	/**
	 * Sets the players.
	 */
	public void setPlayers(){
		System.out.println("in MainController with " + player1.getName());
		gamePlayController.setNames();
		gamePlayController.newGame();
//		gamePlayController.setP1(player1.getName());
//		gamePlayController.setP2(player2.getName());
//		gamePlayController.setP3(player3.getName());
//		gamePlayController.setP4(player4.getName());
//		gamePlayController.newGame();
//		gamePlayController.resetLocks();
//	
	}


	
}
