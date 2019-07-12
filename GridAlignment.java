import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.scene.control.Button;

public class GridAlignment extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button btn1 = new Button("One");
		btn1.setMaxWidth(Double.MAX_VALUE);
		Button btn2 = new Button("Two");
		btn2.setMaxWidth(Double.MAX_VALUE);
		Button btn3 = new Button("Three");
		btn3.setMaxWidth(Double.MAX_VALUE);
		
		//creating the Grid Pane root 
		GridPane root = new GridPane();
		root.setGridLinesVisible(true);
		root.setStyle("-fx-padding:10px");
		root.addColumn(0,btn1,btn2,btn3);
		
		//creating the constarints
		RowConstraints rc1 = new RowConstraints(50);
		rc1.setValignment(VPos.TOP);
		
		RowConstraints rc2 = new RowConstraints(30);
		rc2.setValignment(VPos.TOP);
		
		RowConstraints rc3 = new RowConstraints(40);
		
		root.getRowConstraints().addAll(rc1,rc2,rc3);
		
		ColumnConstraints cc1 = new ColumnConstraints();
		cc1.setPercentWidth(100.0D);
		cc1.setHalignment(HPos.RIGHT);
		root.getColumnConstraints().addAll(cc1);
		
		//Override the settng for alignment
		GridPane.setHalignment(btn1,HPos.CENTER);
		GridPane.setValignment(btn3,VPos.BOTTOM);
		GridPane.setValignment(btn2,VPos.CENTER);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("JavaFx Grid Pane Alignment");
		stage.show();
	}
}