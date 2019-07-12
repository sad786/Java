import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ToggleExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		String str = "Your Selection";
		Label label1 = new Label();
		Label label2 = new Label("Choose one of the Weather");
		
		ToggleButton summer = new ToggleButton("Summer");
		ToggleButton spring = new ToggleButton("Spring");
		ToggleButton winter = new ToggleButton("Winter");
		ToggleButton fall  = new ToggleButton("Fall");
		
		
		ToggleGroup group = new ToggleGroup();
		group.addChangeListener(this::changed);
		group.getToggles().addAll(summer,spring,fall,winter);
		
		
		HBox hbox = new HBox(winter,summer,fall,spring);
		hbox.setSpacing(5);
		//hbox.getChildren().addAll(summer,winter,fall,group);
		
		VBox root = new VBox();
		root.setSpacing(10);
		root.getChildren().addAll(label1,label2,hbox);
		root.setStyle("-fx-border-color:blue;"+
						"-fx-broder-width:3px;"+
						"-fx-border-radius:5px;"+
						"-fx-border-style:solid inside;");
							
							
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Toggle Example");
		stage.show();
			
	}
	
	
	public void changed(StateChangeEvent e)
	{
		
	}
}