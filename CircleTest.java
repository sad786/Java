import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CircleTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Circle c1 = new Circle(50,50,50);
		c1.setFill(Color.CYAN);
		
		//Second circle
		Circle c2 = new Circle(50,50,50);
		c2.setFill(Color.CYAN);
		c2.setStroke(Color.BLACK);
		c2.setStrokeWidth(5.0D);
		
		HBox root = new HBox(10,c1,c2);
		root.setStyle("-fx-border-color:blue;"+
				      "-fx-border-insets:5px;"+
					  "-fx-border-sytle:solid inside;"+
					  "-fx-border-width:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Circle Test");
		stage.show();
	}
}