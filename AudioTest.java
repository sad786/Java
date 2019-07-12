import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import java.net.URL;

import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.binding.Bindings;

public class AudioTest extends Application
{
	private AudioClip audio = null;
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button playBtn = new Button("Play");
		Button stopBtn = new Button("Stop");
		
		playBtn.setOnAction(e -> {
			if(!audio.isPlaying())
				audio.play();
		});
		stopBtn.setOnAction(e -> audio.stop());
		
		Slider volumeSlider = new Slider(0,100,20);
		audio.volumeProperty().bind(volumeSlider.valueProperty().divide(100));
		volumeSlider.setOnAction( e -> this.changed());
		
		Slider rateSlider = new Slider(0.125,8.0,1.0);
		audio.rateProperty().bind(rateSlider.valueProperty());
		
		Slider balanceSlider = new Slider(0.0,1.0,0.1);
		audio.balanceProperty().bind(balanceSlider.valueProperty());
		
		Slider panSlider = new Slider(0.0,1.0,0.1);
		audio.panProperty().bind(panSlider.valueProperty());
		
		HBox hbox = new HBox(5.0,playBtn,stopBtn);
		VBox box = new VBox(5.0,new HBox(new Label("Volume:"),volumeSlider),
							new HBox(new Label("Rate:"),rateSlider),
							new HBox(new Label("Balance:"),balanceSlider),
							new HBox(new Label("Pan:"),panSlider));
							
		BorderPane root = new BorderPane();
		root.setTop(hbox);
		root.setCenter(box);
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-padding:5px;");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using Audio Clip");
		stage.show();
	}

	@Override
	public void init()
	{
		
		try {
			URL url = this.getClass()
					  .getClassLoader()
					  .getResource("Ambulance.mp3");
				  
		audio = new AudioClip(url.toExternalForm());
		audio.setCycleCount(AudioClip.INDEFINITE);
		}catch(Exception e){System.out.println("File not Found...");}	
	}
	
	private void changed()
	{
		
	}
}