import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PerspectiveExample extends Application
{
	@Override
	public void start(Stage stage)
	{
		// Simple Text
		Text text1 = new Text("Window");
		text1.setFont(Font.font("Arial",FontWeight.BOLD,40));
		text1.setFill(Color.RED);
		
		Rectangle rect1 = new Rectangle(180.0D,50.0D,Color.GRAY);
		
		
		// Text with Perspective effect
		Text text2 = new Text("Window");
		text2.setFill(Color.RED);
		text2.setFont(Font.font("Arial",FontWeight.BOLD,40));
		Rectangle rect2 = new Rectangle(180.0D,50.0D,Color.GRAY);
		
		PerspectiveTransform pp = new PerspectiveTransform(0.0D,0.0D,180.0D,20.0D,210.0D,50.0D,10.0D,50.0D);
		rect2.setEffect(pp);
	
		HBox root = new HBox(10.0D,new StackPane(rect1,text1),new StackPane(rect2,text2));
		root.setStyle("-fx-border-style:solid inside;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using Perspective Transform Example");
		stage.show();
	}
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
}