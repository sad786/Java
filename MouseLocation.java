import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class MouseLocation extends Application
{
	@Override
	public void start(Stage stage)
	{
		EventHandler<MouseEvent> handler = e -> handleEvent(e);
		Scene scene = new Scene(new Group(),300,300);
		stage.setScene(scene);
		stage.setTitle("Mouse Event Handler ");
		stage.addEventHandler(MouseEvent.MOUSE_CLICKED,handler);
		stage.show();
	}
	public void handleEvent(MouseEvent e)
	{
		String source = e.getSource().getClass().getSimpleName();
		String target = e.getTarget().getClass().getSimpleName();
		
		double screenX = e.getScreenX();
		double screenY = e.getScreenY();
		
		double sceneX  = e.getSceneX();
		double sceneY  = e.getSceneY();
		
		double x = e.getX();
		double y = e.getY();
		
		System.out.println("Target : "+target+"\nSource : "+source+
							"\nLocation From Node : x="+x+":y="+y+
							"\n
Location from Scene : x="+sceneX+":y="+y+
							"\nLocation from Screen : x"+screenX+":y="+screenY);
	}
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
}