import  javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.beans.value.ObservableValue;

public class ListViewTest extends Application
{
	private Label itemLabel = new Label("");
	private Label selectLabel = new Label("");
	private ListView<String> list = null;
	
	public static void main(String args)
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Label seson = new Label("Select Seasons : ");
		
		list = new ListView<>();
		list.setPrefSize(220,220);
		list.getSelectionModel()
			.selectedItemProperty()
			.addListener(this::changed);
		list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		list.getItems().addAll("Spring","Summer","Fall","Winter");
		
		Label chLabel = new Label("Your Selection : ");
		Label lastLabel = new Label("Last : ");
		
		/*VBox vbox1 = new VBox();
		vbox1.setSpacing(5);
		vbox1.setPadding(new Insets(10));
		vbox1.getChildren().addAll(seson,list,chLabel,lastLabel);
		*/
		
		Button first = new Button(" Select First");
		first.setOnAction(e -> list.getSelectionModel().selectFirst());
		first.setMaxWidth(Double.MAX_VALUE);
		Button next  = new Button("Select Next");
		next.setOnAction(e -> list.getSelectionModel().selectNext());
		next.setMaxWidth(Double.MAX_VALUE);
		Button   pre = new Button("Select Previous");
		pre.setMaxWidth(Double.MAX_VALUE);
		pre.setOnAction(e -> list.getSelectionModel().selectPrevious());
		Button  last = new Button("Select Last");
		last.setMaxWidth(Double.MAX_VALUE);
		last.setOnAction(e -> list.getSelectionModel().selectLast());
		
		VBox vbox2 = new VBox();
		vbox2.getChildren().addAll(first,next,pre,last,itemLabel,selectLabel);
		//vbox2.setSpacing(5);
		vbox2.setPadding(new Insets(10));
		
		Button all = new Button("Select All");
		all.setOnAction(e -> list.getSelectionModel().selectAll());
		all.setMaxWidth(Double.MAX_VALUE);
		Button clear = new Button("Clear All");
		clear.setOnAction(e -> list.getSelectionModel().clearSelection());
		clear.setMaxWidth(Double.MAX_VALUE);
		
		VBox vbox3 = new VBox();
		//vbox3.setSpacing(5);
		vbox3.setPadding(new Insets(10));
		vbox3.getChildren().addAll(all,clear);
		
		GridPane root = new GridPane();
		root.addRow(0,seson);
		root.addRow(1,list,vbox2,vbox3);
		root.addRow(2,chLabel,selectLabel);
		root.addRow(3,lastLabel,itemLabel);
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-radius:3px;"+
					  "-fx-border-style:solid inside;"+
					  "-fx-border-insets:5px;"+
					  "-fx-padding:5px;");
	
		Scene scene = new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("Using ListView Selection Model");
		stage.show();
	}

	
	public void changed(ObservableValue<? extends String> value,String oldValue, String newValue)
	{
		String lastItem;
		
		lastItem = (newValue==null)?"[None]":"["+newValue+"]";
		itemLabel.setText(lastItem);
		
		ObservableList<String> selectedItems = list.getSelectionModel().getSelectedItems();
		
		String values = (selectedItems.isEmpty())?"[None]":selectedItems.toString();
		selectLabel.setText(values);
	}
}