import java.net.URL;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorInputTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		ColorAdjust effect = new ColorAdjust();
		effect.setHeight(400);
		effect.setWidth(400);
		Node node = this.getImageNode();
		node.setEffect(effect);
		
		GridPane controller = this.getController(effect);
		
		BorderPane root = new BorderPane();
		root.setCenter(node);
		root.setBottom(controller);
		root.setStyle("-fx-padding:10px;"+
					  "-fx-border-width:2px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-radius:3px;"
					  );
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Applying ColorAdjust Effect");
		stage.show();
	}
	
	public GridPane getController(ColorAdjust effect)
	{
		Slider hueSlider = new Slider(-1.0,1.0,0.0);
		effect.hueProperty().bind(hueSlider.valueProperty());
		
		Slider satSlider = new Slider(-1.0,1.0,0.0);
		effect.saturationProperty().bind(satSlider.valueProperty());
		
		Slider brSlider = new Slider(-1.0,1.0,0.0);
		effect.brightnessProperty().bind(brSlider.valueProperty());
		
		Slider conSlider = new Slider(-1.0,1.0,0.0);
		effect.contrastProperty().bind(conSlider.valueProperty());
		
		GridPane pane = new GridPane();
		pane.setHgap(5.0D);
		pane.setVgap(10.0D);
			
		Slider[] sl = new Slider[]{hueSlider,satSlider,brSlider,conSlider};
		for(Slider s:sl)
		{
			s.setPrefWidth(300);
			s.setShowTickMarks(true);
			s.setMajorTickUnit(0.10);
			s.setShowTickLabels(true);
		}
		pane.addRow(0,new Label("Hue:"),hueSlider);
		pane.addRow(1,new Label("Saturation:"),satSlider);
		pane.addRow(2,new Label("Birghtness:"),brSlider);
		pane.addRow(3,new Label("Contrast:"),conSlider);
	
		
		return pane;
	}
	
	public Node getImageNode()
	{
		Node node = null;
		String path = "Saddam.jpg";
		URL url = this.getClass().getClassLoader().getResource(path);
		if(url!=null)
		{
			node = new ImageView(url.toExternalForm());
			
		}
		else
		{
			System.out.println("Missing image file "+path);
			node =  new StackPane(new Rectangle(100,50,Color.LIGHTGRAY),new Text("ColorAdjust"));
		}
		return node;
	}
}