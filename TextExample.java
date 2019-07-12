import javafx.application.Application;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Text t1 = new Text();
		t1.setText("I am Grateful for my Life");
		t1.setFill(Color.BLUE);
		t1.setFont(new Font(20));
		
		
		Text t2 = new Text("I have Limitless Potential");
		t2.setFill(Color.RED);
		t2.setFont(new Font(15));
		
		Text t3 = new Text("I Love My Life");
		t3.setFill(Color.WHITE);
		t3.setStroke(Color.BLACK);
		t3.setFont(new Font(30.0D));
		t3.setEffect(new Reflection());
		//t3.setStrokeWidth(2.0D);
		
		HBox root = new HBox(t1,t2,t3);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Text Example");
		stage.show();
		
	}
}



