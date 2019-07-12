

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
public class AnchorPaneExample extends  Application
{
	public static void main(String args)
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button button = new Button("Click me!");
		
		AnchorPane pane = new AnchorPane(button);
		pane.setTopAnchor(button,20.0D);
		pane.setLeftAnchor(button,20.0D);
		pane.setRightAnchor(button,20.0D);
		
		pane.setStyle("-fx-border-width:2px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:10px;");
					  
	    Scene scene = new Scene(pane,100,100);
		
		stage.setScene(scene);
		stage.setTitle("Anchor Pane Constraints");
		stage.show();
	}
}