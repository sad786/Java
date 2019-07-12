import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.BlurType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ShadowEffect extends Application
{
	private Rectangle rect = new Rectangle(100,50,Color.GRAY);
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Slider s1 = new Slider(0,10,100);
		Slider s2 = new Slider(0,10,50);
		Slider s3 = new Slider(0,0.1,1.0);
		Slider s4 = new Slider(0,0.01,1.0);
		
		ObservableList<String> list = FXCollections<String>.ObservableArrayList.addAll("Black","Cyan",
																"Orange",
																"Red",
																"Blue",
																"Yellow",
																"Gray",
																"Pink",
																"Green",
																"White",
																"Voilet");
																
		ComboBox colorBox = new ComboBox(list);
		
											
		
		
	}
}