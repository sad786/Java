import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.DepthTest;
import javafx.stage.Stage;

public class RectangleTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//Red Rectangle
		Rectangle rect1 = new Rectangle(100,100);
		rect1.setTranslateX(100.0D);
		rect1.setTranslateY(100.0D);
		rect1.setTranslateZ(400.0D);
		rect1.setFill(Color.RED);
		
		//Green Rectangle
		Rectangle rect2 = new Rectangle(100,100);
		rect2.setTranslateX(150.0D);
		rect2.setTranslateY(150.0D);
		rect2.setTranslateZ(300.0D);
		rect2.setFill(Color.GREEN);
		
		Group group = new Group(rect2,rect1);
		
		// Check Box
		CheckBox box = new CheckBox("Depth Test Enable");
		box.setSelected(true);
		box.selectedProperty().addListener(
		(p,oldValue,newValue) ->
		{
			if(newValue)
			{
				
				rect2.setDepthTest(DepthTest.ENABLE);
				rect1.setDepthTest(DepthTest.ENABLE);
			}else
			{
				
				rect2.setDepthTest(DepthTest.DISABLE);
				rect1.setDepthTest(DepthTest.DISABLE);
			}
		});
		
		BorderPane root = new BorderPane();
		root.setTop(box);
		root.setCenter(group);
		root.setStyle(
					  "-fx-background-color:transparent;");
		Scene scene = new Scene(root,200,200,true);
		scene.setCamera(new PerspectiveCamera());
		
		stage.setScene(scene);
		stage.setTitle("Using Rectangle");
		stage.show();
	}
}