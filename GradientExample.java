import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Color;
import javafx.scene.Node;

public class GradientExample extends Application
{
	public static void main(String paramArrayString)
	{
		Application.launch(paramArrayString);
	}
	
	@Override
	public void start(Stage localStage)
	{
		Circle localCircle = new Circle(200,150,130);
		
		/*Stop[] stops = new Stop[]{
								  new Stop(0.0,Color.GREEN),
								  new Stop(0.25,Color.RED),
								  new Stop(0.50,Color.YELLOW),
								  new Stop(0.75,Color.BLUE),
								  new Stop(1.0,Color.CYAN)
								  };
								  */
		//LinearGradient lg = new LinearGradient(0,0,1,1,true,CycleMethod.REPEAT,stops);
		
		String str = "from 0px 0px to 100px 0px, repeat, white,red,blue,yellow";
		LinearGradient lg = LinearGradient.valueOf(str);
		localCircle.setFill(lg);
		
		Group localGroup = new Group(new Node[]{localCircle});
		Scene localScene = new Scene(localGroup,400,300);
		localStage.setScene(localScene);
		localStage.setTitle("Linear Gradient Color");
		localStage.show();
	}
}