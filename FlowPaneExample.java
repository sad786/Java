import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class FlowPaneExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		//creating the Horizontal flow pane with 5px and 10px gap
		FlowPane root = new FlowPane(5,10);
		
		//setting the button to the root
		for(int i=1; i<=10; i++)
		{
			root.getChildren().add(new Button("Btton"+i));
			
		}
		
		//setting the style of the pane
		root.setStyle("-fx-border-width:2px;"+
					  "-fx-border-radius:3px;"+
					  "-fx-broder-color:red;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Flow Pane Example");
		stage.show();
		
		System.out.println("Scene width is "+scene.getWidth());
	}
}