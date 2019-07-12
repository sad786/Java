import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		String imagPath = "Saddam.jpg";
		double requestedWidth = 200.0D;
		double requestedHeight = 100.0D;
		boolean preserveRatio = false;
		boolean smooth = true;
		
		Image img = new Image(imagPath,
							  requestedWidth,
							  requestedHeight,
							  preserveRatio,
							  smooth);
		ImageView imageView = new ImageView(img);
		System.out.println("Height = "+img.getHeight()+"\nWidth = "+img.getWidth());
		HBox root = new HBox(imageView);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Image Test Example");
		stage.show();
	}
}