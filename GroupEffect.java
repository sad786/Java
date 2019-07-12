import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class GroupEffect extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		Button okButton = new Button("OK");
		Button cancelButton = new Button("Cancel");
		
		//Set the location of the button
		okButton.setLayoutX(10.0D);
		cancelButton.setLayoutY(10.0D);
		okButton.setLayoutY(10.0D);
		cancelButton.setLayoutX(80.0D);
		
		Group root = new Group(okButton,cancelButton);
		
		root.setEffect(new DropShadow());  //setting the dropshadow
		root.setRotate(10);
		root.setStyle("-fx-background-color:blue;");
		root.setOpacity(0.30);  // set the opacity to 50%
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Group Effect Example");
		stage.show();
	}
}