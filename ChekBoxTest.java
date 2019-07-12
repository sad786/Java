import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.beans.value.ObservableValue;

public class ChekBoxTest extends Application
{
	private Label msg = new Label("Do You Agree: None");
	private CheckBox agree,hungry;
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	
	@Override
	public void start(Stage stage)
	{
		 hungry = new CheckBox("Hungry");
		hungry.selectedProperty().addListener(this::changed);
		
		 agree = new CheckBox("I agree");
		agree.setAllowIndeterminate(true);
		agree.indeterminateProperty().addListener(this::changed);
		
		VBox root = new VBox(msg,hungry,agree);
		root.setSpacing(10);
		root.setStyle("-fx-padding:10px;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;");
					  
		Scene scene = new Scene(root,250,130);
		stage.setScene(scene);
		stage.setTitle("Check Box Test");
		stage.show();
	}
	
	public void changed(ObservableValue<? extends Boolean> observ,Boolean oldValue,Boolean newValue)
	{
		String state = "";
		if(hungry.isSelected())
		{
			state = "Checked";
		}else if(agree.isIndeterminate())
		{
			state = "Undefined";
		}else{
			state = "Unchecked";
		}
		msg.setText("Do You agree: "+state);
	}
}