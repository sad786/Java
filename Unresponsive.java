import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Platform;
public class Unresponsive extends Application
{
	public static void main(String args[]){Application.launch(args);}
	Label statusLabel = new Label("Not Started....");
	@Override
	public void start(Stage stage)
	{
		var startBtn = new Button("Start");
		startBtn.setOnAction(e ->{
			Runnable runnable = () -> runTask();
			var thread = new Thread(runnable);
			thread.setDaemon(true);
			thread.start();
		});
		
		var closeBtn = new Button("Close");
		closeBtn.setOnAction(e -> stage.close());
		
		var hBox = new HBox(5,startBtn,closeBtn);
		var vBox = new VBox(5,statusLabel,hBox);
		
		var scene =new Scene(vBox);
		stage.setScene(scene);
		stage.setTitle("Unresponsive UI");
		stage.show();
	}
	
	public void runTask()
	{
		for(int i=1;i<=10; i++)
			{
				String status = "Processing "+ i+" completed";
				System.out.println(status);
				Platform.runLater(() -> statusLabel.setText(status));
				try{Thread.sleep(1000);}catch(InterruptedException ex){}
			}
	}
}