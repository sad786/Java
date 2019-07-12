import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.time.LocalTime;
import javafx.concurrent.Task;
import javafx.concurrent.ScheduledService;
import javafx.util.Duration;
public class DigitalWatch extends Application
{
	public static void main(String args[]){Application.launch();}
	Button time =null;
	@Override
	public void start(Stage stage)
	{
		time = new Button("");
		time.setFont(Font.font(null,FontWeight.BOLD,30));
		TimeTeller tt = new TimeTeller();
		time.textProperty().bind(tt.messageProperty());
		tt.start();
		
		var root = new BorderPane();
		root.setCenter(time);
		var scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Time");
		stage.show();
	}
	
}

class TimeTeller extends ScheduledService<Void>
{
	@Override
	public Task<Void> createTask(){
		return new Task<Void>(){
			@Override
			public Void call()
			{
				var time = LocalTime.now();
				var hour = time.getHour();
				var minute = time.getMinute();
				var seconds = time.getSecond();
				
				if(hour>12)hour -=12;
				this.updateMessage(hour+" : "+minute+" : "+seconds);
				
				//try{Thread.sleep(900);}catch(InterruptedException ie){};
				return null;
			}
		};
	}
}