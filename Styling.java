import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;

public class Styling extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button okButton = new  Button("OK");
		Button cancelButton = new Button("Cancel");
		
		HBox root =new HBox(10);  // spacing will be 10
		root.getChildren().addAll(okButton,cancelButton);
		root.setStyle("-fx-cursor: hand; -fx-border-color: blue;-fx-border-width: 5px;-fx-font: normal bold 20px 'serif';");
		okButton.setStyle("-fx-border-width: inherit; -fx-effect: dropshadow(gaussian, gray, 10, 0.6, 10, 10); ");
		cancelButton.setStyle("-fx-effect:innershadow(three-pass-box,darkseagreen,10.0,0.6,10,10);");
		//System.out.println("Width of Cancel Button: "+cancelButton.getSize());
		
	
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("CSS Styling");
		stage.show();
	}
}