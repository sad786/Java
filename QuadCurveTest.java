import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.QuadCurve;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class QuadCurveTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		QuadCurve cv1 = new QuadCurve(0,100,50,50,150,100);
		cv1.setFill(Color.TRANSPARENT);
		cv1.setStroke(Color.BLACK);
		
		QuadCurve cv2 = new QuadCurve(0,100,20,0,150,100);
		cv2.setFill(Color.GRAY);
		
		HBox root = new HBox(cv1,cv2);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Quad Curve Test");
		stage.show();
	}
}