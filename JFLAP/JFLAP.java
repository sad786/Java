import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.StageStyle;
import javafx.stage.Modality;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import java.io.File;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class JFLAP extends Application
{
	private final Automation auto = new Automation();
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)throws Exception
	{
		Button btn1 = new Button("Finite Automation");
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn1.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn2 = new Button("Mealy Machine");
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn2.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn3 = new Button("Moore Machine");
		btn3.setMaxWidth(Double.MAX_VALUE);
		btn3.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn4 = new Button("Pushdown Automation");
		btn4.setMaxWidth(Double.MAX_VALUE);
		btn4.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn5 = new Button("Turing Machine");
		btn5.setMaxWidth(Double.MAX_VALUE);
		btn5.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn6 = new Button("Multi-tape Turing Machine");
		btn6.setMaxWidth(Double.MAX_VALUE);
		btn6.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn7 = new Button("Grammar");
		btn7.setMaxWidth(Double.MAX_VALUE);
		btn7.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn8 = new Button("L-System");
		btn8.setMaxWidth(Double.MAX_VALUE);
		btn8.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn9 = new Button("Regular Expression");
		btn9.setMaxWidth(Double.MAX_VALUE);
		btn9.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn10 =new Button("Regular Pumping Lemma");
		btn10.setMaxWidth(Double.MAX_VALUE);
		btn10.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		Button btn11 = new Button("Context-free Pumping Lemma");
		btn11.setMaxWidth(Double.MAX_VALUE);
		btn11.setStyle("-fx-font-weight:bold; -fx-font-size:12px");
		
		//Creating the MenuBar for MenuItems
		MenuBar     mb = new MenuBar();
		Menu  fileMenu = new Menu("File");
		Menu  helpMenu = new Menu("Help");
		Menu batchMenu = new Menu("Batch");
		Menu  prefMenu = new Menu("Preferences");
		
		//adding the menu to menu bar
		mb.getMenus().addAll(fileMenu,helpMenu,batchMenu,prefMenu);
		
		
		//Creating the menu items for menu
		MenuItem open = new MenuItem("Open");
		open.setOnAction(e ->{
			FileChooser file = new FileChooser();
			file.setTitle("Choose File");
			file.setInitialDirectory(new File(System.getProperty("user.home")));
			file.showOpenMultipleDialog(stage);
		});
		MenuItem quit = new MenuItem("Quit");
		quit.setOnAction(e -> System.exit(0));
		
		MenuItem help = new MenuItem("help");
		help.setOnAction(e2 ->{
			Stage prom = new Stage();
			
			prom.initModality(Modality.APPLICATION_MODAL);
			prom.initOwner(stage);
			prom.initStyle(StageStyle.UTILITY);
			Button btn = new Button("OK");
			Label label = new Label("For Help feel free to contact us\n"+
									" or mail us to saddam.ahmad.cs.2016@mitmeerut.ac.in");
			VBox hbox = new VBox(label,btn);
			hbox.setAlignment(Pos.CENTER);
			btn.setOnAction(e1 -> prom.hide());
			Scene scene1 = new Scene(hbox,300,100);
			prom.setScene(scene1);
			prom.showAndWait();
		});
		
		MenuItem about = new MenuItem("About");
		helpMenu.getItems().addAll(help,about);
		
		MenuItem test = new MenuItem("Batch Test");
		batchMenu.getItems().add(test);
		
		MenuItem string = new MenuItem("Set the Empty String Character");
		MenuItem undo = new MenuItem("Set the Undo Amount");
		MenuItem tur  = new MenuItem("Set the Turing Machine Preferences");
		prefMenu.getItems().addAll(string,undo,tur);
		
		fileMenu.getItems().addAll(open,quit);
		
		VBox vbox =new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(5));
		vbox.getChildren().addAll(mb,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11);
		Scene scene = new Scene(vbox);
		
		btn1.setOnAction(e ->{stage.hide();auto.start(stage);});
		
		stage.setScene(scene);
		stage.setTitle("JFLAP");
		stage.setResizable(false);
		stage.show();
	}
}