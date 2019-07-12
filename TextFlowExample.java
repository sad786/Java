import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.TextFlow;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
public class TextFlowExample extends Application
{
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Text text1 = new Text("I,");
		RadioButton rd1 = new RadioButton("Mr.");
		RadioButton rd2 = new RadioButton("Ms.");
		
		TextField tf = new TextField();
		
		Text text2 = new Text(", acknowledge the receipt of this letter.....\n Sincerely\n");
		
		Button btn = new Button("Submit Form");
		
		TextFlow pane = new TextFlow();
		pane.getChildren().addAll(text1,rd1,rd2,tf,text2,btn);
		pane.setPrefWidth(270.0D);
		pane.setLineSpacing(5.0D);
		pane.setStyle("-fx-border-width:2px;"+
				      "-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:10px;");
					  
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("JavaFx Text Flow Pane");
		stage.show();
	}
}