

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class ConstraintGrid extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		GridPane gd = new GridPane();
		gd.setGridLinesVisible(true);
		gd.setPadding(new Insets(10));
		
		//setting buttons to the grid pane
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				Button btn = new Button(col+" "+row);
				gd.add(btn,col,row);
			}
		}
		
		//creating the coloumn constaraints class
		ColumnConstraints cc1 = new ColumnConstraints(100.0D);  // fixed to 100px
		cc1.setHalignment(HPos.CENTER);
		
		//creating the second 
		ColumnConstraints cc2 = new ColumnConstraints();
		cc2.setPercentWidth(35);
		cc2.setHalignment(HPos.LEFT);
		
		//creating the third
		ColumnConstraints cc3 = new ColumnConstraints();
		cc3.setHalignment(HPos.RIGHT);
		cc3.setPercentWidth(40);
		
		//creating the Row Constarints
		RowConstraints rc1 = new RowConstraints(50);
		rc1.setValignment(VPos.CENTER);
		
		RowConstraints rc2 = new RowConstraints();
		rc2.setPercentHeight(50);
		rc2.setValignment(VPos.TOP);
		
		//adding the constarints to the root 
		gd.getColumnConstraints().addAll(cc1,cc2,cc3);
		
		//adding the row constraints to the root
		gd.getRowConstraints().addAll(rc1,rc2);
		
		Scene scene = new Scene(gd);
		stage.setScene(scene);
		stage.setTitle("Setting the constrint col/row ");
		stage.show();
		
	}
}