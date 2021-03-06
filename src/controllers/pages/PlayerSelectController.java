package controllers.pages;

import controllers.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * The Class PlayerSelectController.
 */
public class PlayerSelectController {
	
	/** The game play controller. */
	public GamePlayController gamePlayController;
	
	/** The main. */
	private MainController main;
	
	/** The player 1 input. */
	@FXML
	public TextField player1input;
	
	/** The player 2 input. */
	@FXML private TextField player2input;
	
	/** The player 3 input. */
	@FXML private TextField player3input;
	
	/** The player 4 input. */
	@FXML private TextField player4input;
	
	/** The start button. */
	@FXML private Button startButton;
	
	/** The anchor pane main. */
	@FXML private AnchorPane anchorPaneMain;
	

	
	/**
	 * Start button click.
	 */
	@FXML private void startButtonClick() {
		System.out.println("Button is clicked");
		MainController.player1.setName(player1input.getText());
		MainController.player2.setName(player2input.getText());
		MainController.player3.setName(player3input.getText());
		MainController.player4.setName(player4input.getText());
		changeNames();
		main.tabPane.getSelectionModel().selectNext();
		System.out.println(player1input.getText());
		
	}

	/**
	 * Change names.
	 */
	public void changeNames(){
		main.setPlayers();
		
	}

	/**
	 * Inits the.
	 *
	 * @param mainController the main controller
	 */
	public void init(MainController mainController) {
		main = mainController;
	}
	
}
