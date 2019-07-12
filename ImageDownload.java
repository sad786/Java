import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.Priority;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.control.Button;

public class ImageDownload extends Application
{
	private HBox root = null;
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		String url = "Saddam.jpg";
		
		Image img = new Image(url,200,100,true,true);
		ImageView view = new ImageView(img);
		
		Button btn = new Button("Download!");
		btn.setOnAction(e -> download(img));
		
		root = new HBox(10,view,btn);
		
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-radius:3px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Image Downloader");
		stage.show();
	}
	
	private void download(Image img)
	{
		PixelReader reader = img.getPixelReader();
		
		int width = (int)img.getWidth();
		int height = (int)img.getHeight();
		WritableImage image = new WritableImage(width,height);
		
		PixelWriter writer = image.getPixelWriter();
		for(int x=0; x<height; x++)
		{
			for(int y=0; y<width; y++)
			{
				Color color = reader.getColor(y,x);
				writer.setColor(y,x,color);
			}
		}
		ImageView imageView = new ImageView(image);
		root.getChildren().add(imageView);
		
	}
}
