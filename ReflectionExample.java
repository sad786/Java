import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;

public class ReflectionExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//Creating text node
		Text text = new Text("Reflection!");
		text.setFill(Color.RED);
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		
		Reflection rf = new Reflection(5.0D,0.70,0.50D,1.0D);
		text.setEffect(rf);
		
		HBox root = new HBox(text);
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Applying Reflection Effect ");
		stage.show();
		
		System.out.println("topOffset = "+rf.getTopOffset()+
						   "\nfraction = "+rf.getFraction()+
						   "\ntopopacity = "+rf.getTopOpacity()+
						   "\nbottomopacity = "+rf.getBottomOpacity());
	}
}