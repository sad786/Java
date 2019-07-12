import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;

public class ProgressExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		ProgressIndicator pd1 = new ProgressIndicator();
		ProgressIndicator pd2 = new ProgressIndicator(0);
		
		ProgressBar pb1 = new ProgressBar();
		ProgressBar pb2 = new ProgressBar(0);
		
		Button indButton = new Button("Complete Task");
		indButton.setOnAction(e -> pd1.setProgress(1.0));
		
		Button barButton = new Button("Complete Bar");
		barButton.setOnAction(e -> pb1.setProgress(1.0));
		
		Button pbButton = new Button("Make Progress");
		pbButton.setOnAction(e -> makeProgress(pb2));
		
		Button pdButton = new Button("Make Progress");
		pdButton.setOnAction(e -> makeProgress(pd2));
		
		GridPane gd = new GridPane();
		gd.setHgap(5.0D);
		gd.setVgap(5.0D);
		gd.addRow(0,new Label("Progress Indicator"),pd1,pd2,indButton,pdButton);
		gd.addRow(1,new Label("Progress Bar"),pb1,pb2,barButton,pbButton);
		gd.setStyle("-fx-border-width:3px;"+
					"-fx-border-color:blue;"+
					"-fx-border-style:solid inside;"+
					"-fx-border-radius:3px;"+
					"-fx-border-insets:5px;"+
					"-fx-padding:5px;");
					
		Scene scene = new Scene(gd);
		stage.setScene(scene);
		stage.setTitle("Progress Indicator Example");
		stage.show();
		
	}
	
	public void makeProgress(ProgressIndicator p)
	{
		double d = p.getProgress();
		
		if(d<=0)
			d = 0.1;
		else
		{
			d+=0.1;
			if(d>=1.0)
				d = 0.0;
		}
		p.setProgress(d);
	}
}