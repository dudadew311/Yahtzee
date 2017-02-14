/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

package controllers;

import application.Player;
import controllers.pages.GamePlayController;
import controllers.pages.PlayerSelectController;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

/**
 * The Class MainController.
 */
public class MainController {
	
	/** The player 1. */
	public static Player player1 = new Player();
	
	/** The player 2. */
	public static Player player2 = new Player();
	
	/** The player 3. */
	public static Player player3 = new Player();
	
	/** The player 4. */
	public static Player player4 = new Player();
	
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
		
	}
	
	
	
	public void newGameTab() {
		tabPane.getSelectionModel().select(0);
	}

	/**
	 * Sets the players.
	 */
	public void setPlayers(){
		System.out.println("in MainController with " + player1.getName());
		gamePlayController.createPlayers();
		gamePlayController.setNames();
		gamePlayController.initiateArrays();
		gamePlayController.newGame();
	}
}
