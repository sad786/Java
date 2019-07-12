import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class PickOnBounds extends Application
{
	private CheckBox pick = new CheckBox("Pick On Bounds");
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Circle circle = new Circle(50.0,50.0,50.0);
		circle.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->System.out.println("Circle Event Called"));
		
		Rectangle rect = new Rectangle(100.0,100.0);
		rect.addEventHandler(MouseEvent.MOUSE_CLICKED,e->System.out.println("Rectangle Event Called"));
		
		circle.setFill(Color.LIGHTGRAY);
		circle.setFill(Color.BLUE);
		
		Group group = new Group(rect,circle);
		HBox root = new HBox();
		root.setPadding(new Insets(20));
		root.setSpacing(20);
		root.getChildren().addAll(group,pick);
		
		pick.setOnMouseClicked(e -> {
			if(pick.isSelected())
				circle.setPickOnBounds(true);
			else
				circle.setPickOnBounds(false);
		});
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Pick On Bounds Example");
		stage.show();
	}
}
