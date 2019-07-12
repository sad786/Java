import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class LinearDemo extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	private boolean status = true;
	@Override
	public void start(Stage stage)
	{
		Stop stops[] = new Stop[]{new Stop(0.0,Color.BLUE),new Stop(0.25,Color.WHITE),new Stop(0.50,Color.CYAN),new Stop(0.75,Color.ORANGE),new Stop(1.0,Color.RED)};
		LinearGradient lg = new LinearGradient(0.0,0.0,1,0,true,CycleMethod.REPEAT,stops);
		Circle circle = new Circle(100.0D,150.0D,100.0D);
		circle.setFill(lg);
		
		RadialGradient rd =new RadialGradient(0,0,0.5,0.5,0.5,true,CycleMethod.REPEAT,stops);
		Text text = new Text("Linear Gradient Color");
		text.setX(150.0);
		text.setY(30.0);
		text.setFont(new Font(25));
		text.setFill(Color.BLUE);
		
		Button button =new Button("Change");
		
		button.setOnAction(e -> {
			if(status){
				status = false;
				circle.setFill(rd);
				text.setText("Radial Gradient Color");
			}
			else{
				status = true;
				circle.setFill(lg);
				text.setText("Linear Gradient Color");
			}
			
		});
		
		Group root =new Group(button,text,circle);
		Scene scene =new Scene(root,400,300);
		stage.setScene(scene);
		stage.setTitle("Gradient Color With Event Handler");
		stage.show();
	}
}