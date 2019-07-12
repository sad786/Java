import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class BorderPaneExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button    top = new Button("Top");
		Button  right = new Button("Right");
		Button   left = new Button("Left");
		Button bottom = new Button("Bottom");
		Button center = new Button("Center");
		
		//setting the color to the button
		top.setStyle("-fx-background-color:CYAN;");
		center.setStyle("-fx-background-color:blue;");
		left.setStyle("-fx-background-color:yellow;");
		right.setStyle("-fx-background-color:green");
		bottom.setStyle("-fx-background-color:red;");
		
		BorderPane pane = new BorderPane();
		HBox leftBox = new HBox();
		leftBox.getChildren().add(left);
		
		HBox rightBox = new HBox();
		rightBox.getChildren().add(right);
		
		HBox bottomBox = new HBox();
		bottomBox.getChildren().add(bottom);
		pane.setLeft(leftBox);
		pane.setRight(rightBox);
		pane.setBottom(bottomBox);
		pane.setCenter(center);
		pane.setTop(top);
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Border Pane Example");
		stage.show();
	}
}