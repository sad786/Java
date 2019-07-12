import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer.Status;
import java.net.URL;


public class VideoExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		String path = "file:///E:/Videos/video.mp4";
		URL url = getClass()
					  .getClassLoader()
					  .getResource(path);
					  
		if(url==null)
		{
			System.out.println("File not found!");
			System.exit(0);
		}
		
		Media media = new Media(url.toExternalForm());
		
		 MediaPlayer player = new MediaPlayer(media);
		 MediaView view = new MediaView(player);
		 view.setFitWidth(500);
		 view.setFitHeight(400);
		Button btn1 = new Button("Play");
		btn1.setOnAction(e -> {
			if(player.getStatus()==Status.PLAYING)
			{
				player.pause();
			}
			else
				player.play();
		});
		
		Button btn2 = new Button("Stop");
		btn2.setOnAction(e -> player.stop());
		
		HBox box = new HBox(5,btn1,btn2);
		BorderPane root = new BorderPane();
		root.setCenter(view);
		root.setBottom(box);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Media Player");
		stage.show();
	}
}