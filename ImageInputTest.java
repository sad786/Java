import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ImageInputTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		String path = "Saddam.jpg";
		URL url = this.getClass().getClassLoader().getResource(path);
		
		Node node = null;
		if(url==null)
		{
			node = new Text("Missing Image file "+path+" in classpath.");
		}else
		{
			ImageInput imageInputEffect = new ImageInput();
			double requestWidth = 100;
			double requestHeight = 50;
			boolean preserveRatio = false;
			boolean smooth = true;
			Image image = new Image(url.toExternalForm(),
									requestWidth,
									requestHeight,
									preserveRatio,
									smooth);
									
			imageInputEffect.setSource(image);
			
			node = new Rectangle(100,50);
			GaussianBlur dsEffect = new GaussianBlur();
			dsEffect.setInput(imageInputEffect);
			node.setEffect(dsEffect);
		}
		HBox root = new HBox(node);
		root.setStyle("-fx-padding:10px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-width:2px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-color:blue;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Applying the ImageInput Effect");
		stage.show();
	}
}