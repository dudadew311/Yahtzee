package controllers.pages;



import java.io.IOException;

import application.Main;
import controllers.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PlayerSelectController {
	public GamePlayController gamePlayController;
	private MainController main;
	@FXML private TextField player1input;
	@FXML private TextField player2input;
	@FXML private TextField player3input;
	@FXML private TextField player4input;
	@FXML private Button startButton;
	
	@FXML private AnchorPane anchorPaneMain;
	
	@FXML private void startButtonClick(ActionEvent event) throws IOException{
		System.out.println("Button is clicked");
		
		Main.player1.setName(player1input.getText());
		Main.player2.setName(player2input.getText());
		Main.player3.setName(player3input.getText());
		Main.player4.setName(player4input.getText());
		
		changeNames();
		
		main.tabPane.getSelectionModel().selectNext();
		System.out.println(player1input.getText());
		
	}
	@FXML
	public void changeNames(){
		main.setPlayers();
		
	}
	public void init(MainController mainController) {
		main = mainController;
	}
}
