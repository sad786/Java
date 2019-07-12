import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.effect.MotionBlur;
import javafx.stage.Stage;
public class MotionEffect extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//Creating Text
		Text text = new Text("Motion Blur");
		text.setFont(Font.font(null,FontWeight.BOLD,50));
		text.setFill(Color.GREEN);
		
		MotionBlur mb = new MotionBlur();
		text.setEffect(mb);
		HBox slider = this.getSlider(mb);
		
		BorderPane root = new BorderPane();
		root.setCenter(text);
		root.setBottom(slider);
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Applying MotionBlur Effect");
		stage.show();
	}
	
	private HBox getSlider(MotionBlur mb)
	{
		Slider sliderRadius = new Slider(0,63,10.0D);
		sliderRadius.setMajorTickUnit(10.0D);
		mb.radiusProperty().bind(sliderRadius.valueProperty());
		sliderRadius.setShowTickLabels(true);
		Slider slider2 = new Slider(0,360,0.0);
		slider2.setShowTickLabels(true);
		mb.angleProperty().bind(slider2.valueProperty());
		HBox box = new HBox(5.0D,new Label("Radius:"),sliderRadius,new Label("Angle:"),slider2);
		
		return box;
	}
}