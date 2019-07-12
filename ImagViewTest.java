import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;

public class ImagViewTest extends Application
{
	private static final double HEIGHT = 300.0D;
	private static final double WIDTH = 300.0D;
	private double startX;
	private double startY;
	private ImageView imgView;
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//Image path;
		String path = "Saddam.jpg";
		
		Image img = new Image(path);
		imgView = new ImageView(img);
		
		Rectangle2D viewPort = new Rectangle2D(0,0,WIDTH,HEIGHT);
		imgView.setViewport(viewPort);
		
		imgView.setOnMousePressed(this::handleMousePressed);
		imgView.setOnMouseDragged(this::handleMouseDragged);
		
		HBox root = new HBox(imgView);
		Scene scene =new Scene(root);
		stage.setScene(scene);
		stage.setTitle("ImageView Example");
		stage.show();
	}
	
	private void handleMousePressed(MouseEvent e)
	{
		startX = e.getX();
		startY = e.getY();
	}
	
	private void handleMouseDragged(MouseEvent e)
	{
		double d1 = startX-e.getX();
		double d2 = startY-e.getY();
		
		startX = e.getX();
		startY = e.getY();
		
		//current minimum 
		double curX = imgView.getViewport().getMinX();
		double curY = imgView.getViewport().getMinY();
		
		//
		double newMin = curX+d1;
		double newMax = curY+d2;
		
		newMin = this.clamp(newMin,0,imgView.getImage().getWidth()-WIDTH);
		newMax = this.clamp(newMax,0,imgView.getImage().getHeight()-HEIGHT);
		
		imgView.setViewport(new Rectangle2D(newMin,newMax,WIDTH,HEIGHT));
	}
	private double clamp(double value,double min,double max)
	{
		if(value<min)
			return min;
		else if(value>max)
			return max;
		
		return value;
	}
}