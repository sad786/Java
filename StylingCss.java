import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class StylingCss extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button button1 = new Button("Yes");
		Button button2 = new Button("No");
		Button button3 = new Button("Cancel");
		
		HBox root = new HBox();
		root.getChildren().addAll(button1,button2,button3);
		
		Scene scene = new Scene(root,400,300);
		scene.getStylesheets().add("ButtonStyle.css");
		stage.setScene(scene);
		stage.setTitle("Button With Colors");
		stage.show();
	}
}