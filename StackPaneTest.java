import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;

public class StackPaneTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		StackPane textOverRect = createStackPane("Hello",1.0,true);
		StackPane rectOverText = createStackPane("Hello",0.5,false);
		StackPane rectOver = createStackPane("JavaFx",1.0,false);
		StackPane rectOver2 = createStackPane("Hello I am Javafx And Who are You",1.0,false);
		StackPane textOver = createStackPane("Hello I am Javafx And Who are You",0.5,true);
		
		HBox root = new HBox();
		root.setSpacing(10);
		root.setPadding(new Insets(5));
		root.getChildren().addAll(textOverRect,rectOverText,rectOver,rectOver2,textOver);
		//root.setBorderWidth(5);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Stack Pane Example");
		stage.show();
	}
	
	public StackPane createStackPane(String title,double opacity, boolean rectFirst)
	{
		StackPane stack = new StackPane();
		Rectangle rect = new Rectangle(60,65);
		rect.setStyle("-fx-fill:lavender;-fx-opacity:"+opacity+";");
		rect.setMaxWidth(Double.MAX_VALUE);
		stack.setStyle("-fx-border-width:2px; -fx-border-color:blue; -fx-border-style:solid inside; -fx-padding:5px; -fx-border-radius:4px;");
		Text text = new Text(title);
		if(rectFirst)
		{
			stack.getChildren().addAll(rect,text);
		}else
		{
			stack.getChildren().addAll(text,rect);
		}
		
		return stack;
	}
}