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

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameOverController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="winnerName"
    private Label winnerName; // Value injected by FXMLLoader

    @FXML // fx:id="closeGameButton"
    private Button closeGameButton; // Value injected by FXMLLoader

    @FXML // fx:id="newGameButton"
    private Button newGameButton; // Value injected by FXMLLoader

	
	public void initialize(/*URL location, ResourceBundle resources*/) {
		System.out.println("Initizaling Game Over");
		winnerName.setText(GamePlayController.winner);
		
	}
}