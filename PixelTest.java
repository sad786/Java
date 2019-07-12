import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PixelTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		String path = "Saddam.jpg";
		Image img = new Image(path);
		ImageView imgView = new ImageView(img);
		imgView.setPreserveRatio(true);
		HBox root = new HBox(imgView);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Pixel Test");
		stage.show();
		
		showPixelInfo(img);
	}
	
	private void showPixelInfo(Image img)
	{
		PixelReader pix = img.getPixelReader();
		int x =0;
		int y = 0;
		while(x<=img.getWidth())
		{
			System.out.println("Color of "+pix.getColor(x,y).toString());
			x++;
			y++;
		}
	}
}
