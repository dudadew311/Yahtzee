/**
 * @author 	Raul Diaz <dudadewe311@gmail.com>
 * @date 	Created on: Feb 8, 2017
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



/**
 * The Class Main.
 */
public class Main extends Application {
	
	/** The primary stage. */
	private Stage primaryStage;
	
	/** The player 1. */
	public static ScoreCard player1 = new ScoreCard();
	
	/** The player 2. */
	public static ScoreCard player2 = new ScoreCard();
	
	/** The player 3. */
	public static ScoreCard player3 = new ScoreCard();
	
	/** The player 4. */
	public static ScoreCard player4 = new ScoreCard();
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Yahtzee");
		
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("at the load there is an error");
		}
	}
	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
