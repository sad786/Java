import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LineTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//First Line
		Line l1 = new Line(30,30,80,30);
		
		//Second Line
		Line l2 = new Line(180,30,130,100);
		l2.setStroke(Color.RED);
		l2.setStrokeWidth(3.0D);
		
		//Third Line
		Line l3 = new Line(250,30,300,100);
		l3.setStrokeWidth(5.0D);
		l3.setStroke(Color.BLUE);
		
		HBox root = new HBox(l1,l2,l3);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-width:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-padding:5px;");
					 
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Line Test");
		stage.show();
	}
}