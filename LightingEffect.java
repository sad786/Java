
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.GaussianBlur;
import javafx.stage.Stage;

public class LightingEffect extends Application
{
	@Override
	public void start(Stage stage)
	{
		//Creating the Text
		Text text = new Text("Texture");
		text.setFont(Font.font("Arial",FontWeight.BOLD,72));
		text.setBoundsType(TextBoundsType.VISUAL);
		text.setFill(Color.RED);
		
		Lighting light = new Lighting();
		text.setEffect(light);
		
		CheckBox box = new CheckBox("Use a GaussianBlur Bump Input?");
		box.setSelected(true);
		box.selectedProperty().addListener((prop,oldValue,newValue) ->
		{
			if(newValue)
				light.setBumpInput(new GaussianBlur());
			else
				light.setBumpInput(null);
		});
		
		Slider slider = this.createSlider(0.0D,10.0D,2.0D);
		light.surfaceScaleProperty().bind(slider.valueProperty());
		
		Slider specSlider = this.createSlider(0.0D,40.0D,20.0D);
		light.specularExponentProperty().bind(specSlider.valueProperty());
		
		Slider cons = this.createSlider(0.0D,2.0D,0.20D);
		light.specularConstantProperty().bind(cons.valueProperty());
		
		Slider diff = this.createSlider(0.0D,2.0D,0.20D);
		light.diffuseConstantProperty().bind(diff.valueProperty());
		
		VBox root = new VBox(text,box,new HBox(new Label("Surface Scale:"),slider),
								      new HBox(new Label("SpecularExponent:"),specSlider),
									  new HBox(new Label("Specular Constant:"),cons),
									  new HBox(new Label("Diffuse Constant:"),diff));
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-sytle:solid inside;"+
					  "-fx-border-radius:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Lighting Effect");
		stage.show();
	}
	private Slider createSlider(double start,double end, double value)
	{
		Slider slider = new Slider(start,end,value);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(value);
		slider.setShowTickMarks(true);
		
		return slider;
	}
	public static void main(String args[])
	{
		Application.launch(args);
	}
}