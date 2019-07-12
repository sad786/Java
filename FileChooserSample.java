import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;

public class FileChooserSample extends Application
{
	private Desktop desktop  = Desktop.getDesktop();
	public static void main(String args[])
	{	
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Button picture = new Button("Open Picture");
		Button pictures = new Button("Open Multiple Pictures");
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Pictures");
		GridPane pane = new GridPane();
		pane.setConstraints(pictures,0,0);
		pane.setConstraints(picture,1,0);
		pane.setHgap(6);
		pane.setVgap(6);
		pane.getChildren().addAll(picture,pictures);
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.getChildren().addAll(pane);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Opening Multiple Files");
		stage.show();
		
		pictures.setOnAction(e ->{
			List<File> list=null;
			list = fileChooser.showOpenMultipleDialog(stage);
			for(File file:list)
				//if(file!=null)
					openFile(file);
		});
		picture.setOnAction(e ->{
			File file = null;
			file = fileChooser.showOpenDialog(stage);
			if(file!=null)
				openFile(file);
		});
	}
	
	public void openFile(File file)
	{
		try{
		desktop.open(file);
		
		}catch(IOException ex){
			Logger.getLogger(
                FileChooserSample.class.getName()).log(
                    Level.SEVERE, null, ex
                );
		}
	}
}

