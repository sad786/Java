
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.VBox;
public class SceneExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		VBox root = new VBox();
		root.setSpacing(10);
		root.setStyle("-fx-border-wdith:5px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-insets:5px;"+
					  "-fx-border-radius:5px;"+
					  "-fx-padding:5px;"+
					  "-fx-border-style:solid inside;");
					  
		
		Label label1 = new Label("Use ALT + 1 to click to button");
		Label label2 = new Label("User ALT +X to close the window");
		
		
		Button btn1 = new Button("Button _1");
		btn1.setOnAction(e -> label1.setText("Button 1 Clicked!"));
		Button btn2 = new Button("Button2");
		btn2.setOnAction(e -> label2.setText("Button 2 Clicked!"));
		
		KeyCombination kc = new KeyCodeCombination(KeyCode.DIGIT2,KeyCombination.ALT_DOWN);
		
		Mnemonic mn = new Mnemonic(btn2,kc);
		root.getChildren().addAll(label1,label2,btn1,btn2);
		root.setPrefWidth(Double.MAX_VALUE);
		root.setPrefHeight(Double.MAX_VALUE);
		
		Scene scene = new Scene(root,200,200);
		scene.addMnemonic(mn);
		KeyCombination kc4 =
		new KeyCodeCombination(KeyCode.X, KeyCombination.SHORTCUT_DOWN);
		Runnable task = () -> scene.getWindow().hide();
		scene.getAccelerators().put(kc4, task);
		stage.setScene(scene);
		stage.setTitle("Scene Example");
		stage.show();
	}
}