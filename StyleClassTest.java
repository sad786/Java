import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StyleClassTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Label nameLabel = new Label("Name :");
		
		TextField tf = new TextField();
		tf.setPrefWidth(200.0D);
		
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e ->System.exit(1));
		
		HBox root = new HBox();
		root.getChildren().addAll(nameLabel,tf,closeButton);
		root.setStyle(
					"-fx-spacing:10px;"+
					"-fx-background-color:gray;"+
					"-fx-border-radius:5px;"+
					"-fx-border-width:5px;"+
					"-fx-border-inset:5px;"+
					"-fx-padding:10px;"+
					"-fx-border-color:blue;"
					
					);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Style Class With CSS");
		stage.show();
		
	}
}