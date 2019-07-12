import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ImageExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//image url
		String url = "Saddam.jpg";
		double requestedWidth = 200.0D;
		double requestedHeight = 100.0D;
		boolean preserveRatio = false;
		boolean smooth = true;
		Image image = new Image(url,
								requestedHeight,
								requestedHeight,
								preserveRatio,
								smooth);
								
		WritableImage darkerImage = new WritableImage((int)requestedWidth,
													  (int)requestedHeight);
													  
		WritableImage brighterImage = new WritableImage((int)requestedWidth,
														(int)requestedHeight);
														
		WritableImage semiImage = new WritableImage((int)requestedWidth,
													(int)requestedHeight);
		
		ImageView imageView = new ImageView(image);
		ImageView darkerView = new ImageView(darkerImage);
		ImageView brighterView = new ImageView(brighterImage);
		ImageView semiView = new ImageView(semiImage);
		
				this.createImage(image,
									darkerImage,
									brighterImage,
									semiImage);
		HBox root = new HBox(10.0D);
		root.getChildren().addAll(new VBox(5.0,imageView,new Text("Original Image")),
								   new VBox(5.0,darkerView,new Text("DarkerImage")),
								   new VBox(5.0,brighterView,new Text("BrighterImage")),
								   new VBox(5.0,semiView,new Text("Semi-Transparent Image")));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Image Example");
		stage.show();
	}
	
	private void createImage(Image image,
							WritableImage darkerImage,
							WritableImage brighterImage,
							WritableImage semiImage)
	{
		double width = image.getWidth();
		double height = image.getHeight();
		//Creating Reader from Image
		PixelReader reader = image.getPixelReader();
		if(reader==null)
		{
			System.out.println("This Image is not readable");
			return;
		}
		
		PixelWriter darkWriter = darkerImage.getPixelWriter();
		PixelWriter brightWriter = brighterImage.getPixelWriter();
		PixelWriter semiWriter = semiImage.getPixelWriter();
		
		for(int x=0; x<height; x++)
		{
			for(int y=0; y<width; y++)
			{
				Color color = reader.getColor(x,y);
				darkWriter.setColor(x,y,color.darker());
				brightWriter.setColor(x,y,color.brighter());
				
				semiWriter.setColor(x,y,Color.color(color.getRed(),
									color.getGreen(),
									color.getBlue(),
									0.50));
			}
		}
	}
}