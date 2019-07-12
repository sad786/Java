import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class TextEffect extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		DropShadow dp = new DropShadow();
		dp.setBlurType(BlurType.TWO_PASS_BOX);
		// Drop Shadow Effect Text
		Text t1 = new Text("Drop Shadow");
		t1.setFont(new Font(24));
		t1.setEffect(dp);
		
		//Blur Effect
		Text t2 = new Text("Blur!");
		t2.setFont(new Font(24));
		t2.setEffect(new BoxBlur());
		
		//Glow Effect
		Text t3 = new Text("Glow!");
		t3.setFill(Color.RED);
		t3.setFont(new Font(24));
		t3.setEffect(new Glow(0.5));
		
		//Bloom Effect
		Text t4 = new Text("Bloom!");
		t4.setEffect(new Bloom(0.10));
		t4.setFont(new Font(24));
		t4.setFill(Color.WHITE);
		
		Rectangle r = new Rectangle(80,30);
		r.setFill(Color.RED);
		StackPane st = new StackPane(r,t4);
		
		HBox root = new HBox(t1,t2,t3,st);
		root.setSpacing(10);
		root.setStyle("-fx-border-width:5px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:5px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;");
					  
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using Text Effect ");
		stage.show();
	}
}