import  javafx.application.Application;
import  javafx.scene.Scene;
import  javafx.stage.Stage;
import  javafx.scene.layout.HBox;
import  javafx.scene.text.Text;
import  javafx.scene.text.FontWeight;
import  javafx.scene.text.Font;
import  javafx.scene.effect.Reflection;
import  javafx.scene.effect.DropShadow;
import  javafx.scene.paint.Color;
import  javafx.geometry.Insets;

public class ReflectionTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Text text = new Text("Welcome!");
		text.setFont(Font.font("Arial",FontWeight.BOLD,50));
		text.setFill(Color.RED);
		DropShadow dp = new DropShadow();
		dp.setInput(new Reflection());
		text.setEffect(dp);
		
		Text text2 = new Text("Welcome!");
		text2.setFont(Font.font("Arial",FontWeight.BOLD,50));
		text2.setFill(Color.RED);
		
		Reflection rf = new Reflection();
		rf.setInput(new DropShadow());
		text2.setEffect(rf);
		
		HBox root = new HBox(text,text2);
		root.setPadding(new Insets(10.0D));
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Reflection Effect Test");
		stage.show();
		
	}
}