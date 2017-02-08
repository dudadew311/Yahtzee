package controllers;

import application.Main;
import controllers.pages.GamePlayController;
import controllers.pages.PlayerSelectController;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class MainController {
	
	
	@FXML public TabPane tabPane;
	@FXML private PlayerSelectController playerSelectController;
	@FXML private GamePlayController gamePlayController;
	
	@FXML public void initialize(){
		System.out.println("Game Started");
		playerSelectController.init(this);
		gamePlayController.init(this);
	}

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
