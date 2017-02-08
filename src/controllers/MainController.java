/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

package controllers;

import application.Main;
import controllers.pages.GamePlayController;
import controllers.pages.PlayerSelectController;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
public class MainController {
	
	
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

	/**
	 * Sets the players.
	 */
	public void setPlayers(){
		System.out.println("in MainController with " + Main.player1.getName());
		gamePlayController.setP1(Main.player1.getName());
		gamePlayController.setP2(Main.player2.getName());
		gamePlayController.setP3(Main.player3.getName());
		gamePlayController.setP4(Main.player4.getName());
		gamePlayController.newGame();
		gamePlayController.resetLocks();
	
	}


	
}
