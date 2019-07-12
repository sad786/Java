import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LabelExample extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Label fname = new Label("_First Name");
		TextField tf1 = new TextField();
		fname.setLabelFor(tf1);
		fname.setMnemonicParsing(true);
		
		
		Label lname = new Label("_Last Name");
		TextField tf2 = new TextField();
		lname.setLabelFor(tf2);
		lname.setMnemonicParsing(true);
		
		//creating the button for the submition
		Button submit = new Button("Submit");
		Button cancel = new Button("_Cancel");
		
		submit.setDefaultButton(true);
		submit.setCancelButton(true);
		//cancel.setDefaultButton(true);
		submit.setOnAction(e -> {
			System.out.println("Name is "+tf1.getText()+tf2.getText());}
		);
		
		//setting the nodes to the layout panes
		GridPane root = new GridPane();
		root.addRow(0,fname,tf1,submit);
		root.addRow(1,lname,tf2,cancel);
		
		root.setPrefHeight(Double.MAX_VALUE);
		root.setPrefWidth(Double.MAX_VALUE);
		root.setStyle("-fx-border-widht:3px;"+
					   "-fx-border-color:cyan;"+
					   "-fx-border-radius:5px;"+
					   "-fx-border-style:solid inside;"+
					   "-fx-border-insets:5px;"+
					   "-fx-padding:5px;");
		
		Scene scene = new Scene(root,230,200);
		stage.setScene(scene);
		stage.setTitle("Label Example ");
		stage.show();
		}
}