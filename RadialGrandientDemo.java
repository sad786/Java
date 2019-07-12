import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Color;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;
import java.util.List;
import java.util.Arrays;

public class RadialGrandientDemo extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage localStage)
	{
		Circle localCircle = new Circle(200.0D,150.D,100.0D);
		
		List<Stop> stops = Arrays.asList(new Stop(0.0,Color.WHITE),new Stop(1.0,Color.BLACK));
		
		RadialGradient rd = new RadialGradient(-60,-0.2,0.5,0.5,0.20,true,CycleMethod.REPEAT,stops);
		
		localCircle.setFill(rd);
		
		Group root = new Group(localCircle);
		Scene scene= new Scene(root,400,300);
		localStage.setScene(scene);
		localStage.setTitle("Radial Gradient");
		localStage.show();
	}
}