import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.BlurType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class InnerShadowTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		InnerShadow is1 = new InnerShadow();
		is1.setOffsetX(3.0D);
		is1.setOffsetY(6.0D);
		
		Text txt = new Text("Inner Shadow");
		txt.setFont(Font.font("Arial",FontWeight.BOLD,40));
		txt.setFill(Color.RED);
		txt.setEffect(is1);
		VBox textBox = new VBox(txt,new Label("offsetX=3.0"),new Label("offsetY=6.0"));
//textBox.setSpacing(5.0D);
		textBox.setAlignment(Pos.CENTER);
		
		InnerShadow is2 = new InnerShadow();
		is2.setOffsetX(3.0D);
		is2.setOffsetY(3.0D);
		
		Rectangle rect1 = new Rectangle(100,50);
		rect1.setEffect(is2);
		rect1.setFill(Color.GRAY);
		
		VBox rBox = new VBox(rect1,new Label("offsetX=3.0"),new Label("offsetY=3.0"));
		//rBox.setSpacing(5.0D);
		rBox.setAlignment(Pos.CENTER);
		
		
		InnerShadow is3 = new InnerShadow();
		is3.setOffsetX(-3.0D);
		is3.setOffsetY(-3.0D);
		Rectangle rect2 = new Rectangle(100.0D,50.D);
		rect2.setFill(Color.GRAY);
		rect2.setEffect(is3);
		
		VBox rb = new VBox(rect2,new Label("offsetX=-3.0"),new Label("offsetY=-3.0"));
		rb.setAlignment(Pos.CENTER);
		//rb.setSpacing(5.0D);
		
		HBox root = new HBox(textBox,rBox,rb);
		root.setSpacing(10.0D);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-width:3px;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-sytle:solid inside;"+
					  "-fx-padding:10px;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using Inner Shadow Effect");
		stage.show();
	}
}