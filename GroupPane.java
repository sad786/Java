import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.beans.binding.NumberBinding;
import javafx.stage.Stage;

public class GroupPane extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button oK = new Button("OK");
		Button cancel = new Button("Cancel");
		
		//setting the positioning of the button
		oK.setLayoutX(10.0D);
		oK.setLayoutY(10.0D);
		
		//Setting the position of the cancel button relative to the oK button
		NumberBinding x = oK.layoutXProperty().add(oK.widthProperty().add(10));
		cancel.layoutXProperty().bind(x);
		cancel.layoutYProperty().bind(oK.layoutYProperty());
		
		Group root = new Group(oK, cancel);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Group Pane Example");
		stage.show();
	}
}