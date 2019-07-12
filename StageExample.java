import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class StageExample extends Application
{
	private Stage lastOpenStage;
	private static int counter=0;
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		VBox root = new VBox();
		Button openButton = new Button("Open");
		openButton.setOnAction(e ->open(++counter));
		root.getChildren().add(openButton);
		Scene scene = new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("The Primary Stage");
		stage.show();
		
		this.lastOpenStage = stage;
	}
	
	private void open(int stageNumber)
	{
		Stage stage = new Stage();
		stage.setTitle("# "+stageNumber);
		Button sayHelloButton = new Button("Say Hello");
		sayHelloButton.setOnAction(e ->System.out.println("Hello from #"+stageNumber));
		
		Button openButton = new Button("Open");
		openButton.setOnAction(e ->open(++counter));
		
		VBox root = new VBox();
		root.getChildren().addAll(sayHelloButton, openButton);
		Scene scene = new Scene(root,200,200);
		stage.setScene(scene);
		stage.setX(this.lastOpenStage.getX()+50);
		stage.setY(this.lastOpenStage.getY()+50);
		this.lastOpenStage = stage;
		
		System.out.println("Before Stage.showAndWait():"+stageNumber);
		
		// Show and Stage and wait for it to close
		stage.showAndWait();
		
		System.out.println("After Stage.showAndWait(): "+stageNumber);
	}
}