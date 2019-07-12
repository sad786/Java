import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class FillHight extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Label dis = new Label("Description");
		
		TextField tf = new TextField();
		//tf.setPrefColumnCount(10);
		//tf.setPrefRowCount(10);
		
		CheckBox cb = new CheckBox("Fill Height");
		cb.setSelected(true);
		
		Button ok = new Button("OK");
		Button cancel = new Button("Cancel");
		cancel.setMaxHeight(Double.MAX_VALUE);
		
		HBox root = new HBox();
		root.getChildren().addAll(dis,tf,cb,ok,cancel);
		root.setHgrow(tf,Priority.ALWAYS);
		cb.setOnAction( e -> {if(!cb.isSelected()){root.setHgrow(tf,null);}else{root.setHgrow(tf,Priority.ALWAYS);}});
		root.setStyle("-fx-border-width:2px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:2px;"+
					  "-fx-padding:10px;"+
					  "-fx-border-insets:10px;"+
					  "-fx-border-style:solid inside;"
					);
		Insets insets = new Insets(10,2,10,2);
		//root.setMargin(dis,insets);
		//root.setMargin(tf,insets);
		//root.setMargin(cb,insets);
		//root.setMargin(ok,insets);
		//root.setMargin(cancel,insets);
		
		root.setSpacing(10.0D);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Fill Height Example");
		stage.show();
	}
}