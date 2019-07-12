import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ChoiceBoxTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		ObservableList<String> values= FXCollections.<String>observableArrayList("Summer","Fall","Spring","Winter");
			
		ChoiceBox<String> box = new ChoiceBox<>(values);
		//box.getItems().addAll(values);
		box.getSelectionModel().selectFirst();
		box.getSelectionModel().selectedItemProperty().addListener(this::changed);
		box.getSelectionModel().selectedIndexProperty().addListener(this::indexChanged);
		
		Label choice = new Label("Selct");
		Label msgLabel = new Label("Your Selection :");
		Label select = new Label("None");
		
		select.textProperty().bind(box.valueProperty());
		
		GridPane root = new GridPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setStyle("-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-width:5px;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;"+
					  "-fx-border-style:solid inside;");
					  
		root.addRow(0,choice,box);
		root.addRow(1,msgLabel,select);
		
		Scene scene = new Scene(root,200,130);
		stage.setScene(scene);
		stage.setTitle("Choice Box Example");
		stage.show();
	}
	
	public void changed(ObservableValue<? extends String> value, String oldValue, String newValue)
	{
		System.out.println("Old Value "+oldValue+" New Value :"+newValue);
	}
	public void indexChanged(ObservableValue<? extends Number> value, Number oldValue, Number newValue)
	{
		System.out.println("Old Index :"+oldValue+" New Index: "+newValue);
	} 
}