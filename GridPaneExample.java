
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class GridPaneExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		Label name = new Label("First Name:");
		Label last = new Label("Last Name:");
		
		TextField nameField = new TextField();
		TextField lastField = new TextField();
		
		Button okButton = new Button("OK");
		Button canButton = new  Button("Cancel");
		
		//setting the button to their maximum width
		okButton.setMaxWidth(Double.MAX_VALUE);
		canButton.setMaxWidth(Double.MAX_VALUE);
		
		GridPane root = new GridPane();
		root.setGridLinesVisible(true);  //setting the grid lines visible
		root.setHgap(10.0D);  //hgap = 10px;
		root.setVgap(10.0D);  //vgap = 10px;
		root.setHgrow(canButton,Priority.ALWAYS);
		
		root.setStyle("-fx-background-color:lightgray; -fx-padding:5px;");
		root.addRow(1,name,nameField,okButton);
		root.addRow(2,last,lastField,canButton);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Grid Pane Example");
		stage.show();
	}
}
