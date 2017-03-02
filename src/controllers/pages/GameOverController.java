/**
 * 
 */
package controllers.pages;

/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 13, 2017
 */


import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * The Class GameOverController.
 */
public class GameOverController {

    /** The resources. */
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    /** The location. */
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    /** The winner name. */
    @FXML // fx:id="winnerName"
    private Label winnerName; // Value injected by FXMLLoader

    /** The close game button. */
    @FXML // fx:id="closeGameButton"
    private Button closeGameButton; // Value injected by FXMLLoader

    /** The new game button. */
    @FXML // fx:id="newGameButton"
    private Button newGameButton; // Value injected by FXMLLoader
	
	/**
	 * Initialize.
	 */
	public void initialize(/*URL location, ResourceBundle resources*/) {
		System.out.println("Initizaling Game Over");
		winnerName.setText(GamePlayController.winner);
		
	}
	
	/**
	 * New game click.
	 */
	@FXML
	private void newGameClick() {
		Stage stage = (Stage) newGameButton.getScene().getWindow();
		//newGameTab();
		stage.close();
	}
	
	/**
	 * Close game click.
	 */
	@FXML
	private void closeGameClick(){
		Platform.exit();
		System.exit(0);
	}
}