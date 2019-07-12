import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class ArcTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//Arc 1
		Arc arc1 = new Arc(0,0,50,100,0,90);
		arc1.setFill(Color.LIGHTGRAY);
		
		Arc arc2 = new Arc(0,0,50,100,0,90);
		arc2.setFill(Color.TRANSPARENT);
		arc2.setStroke(Color.BLACK);
		arc2.setStrokeWidth(3.0D);
		
		Arc arc3 = new Arc(0,0,50,100,0,90);
		arc3.setFill(Color.TRANSPARENT);
		arc3.setStroke(Color.BLACK);
		arc3.setStrokeWidth(3.0D);
		arc3.setType(ArcType.CHORD);
		
		Arc arc4 = new Arc(0,0,50,100,0,90);
		arc4.setFill(Color.TRANSPARENT);
		arc4.setStroke(Color.BLACK);
		arc4.setStrokeWidth(3.0D);
		arc4.setType(ArcType.ROUND);
		
		Arc arc5 = new Arc(0,0,50,100,0,90);
		arc5.setFill(Color.GRAY);
		arc5.setStroke(Color.BLACK);
		arc5.setStrokeWidth(3.0D);
		arc5.setType(ArcType.ROUND);
		
		HBox root = new HBox(arc1,arc2,arc3,arc4,arc5);
		root.setStyle("-fx-border-width:3px;"+
					 "-fx-border-color:blue;"+
					 "-fx-border-insets:5px;"+
					 "-fx-border-style:solid inside;"+
					 "-fx-padding:5px;"+
					 "-fx-border-radius:3px;");
					 
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Arc Test ");
		stage.show();
		
		
	}
}
