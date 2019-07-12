import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.geometry.Insets;
import javafx.stage.WindowEvent;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Group;

public final class Automation
{
	private ToggleButton delete,trans,state,cursor;
	private ToggleGroup group;
	private TabPane tabPane = new Tabpane();
	
	public final void start(Stage stage1)
	{
		VBox tool = createToolBar();
		createTab();
		BorderPane root = new BorderPane();
		root.setTop(tool);
		root.setCenter(tabPane);
		
		Scene scene = new Scene(root,500,500);
		Stage stage= new Stage();
		stage.setScene(scene);
		stage.setTitle("Finite Automation");
		stage.show();
		
		stage.setOnCloseRequest(e -> {
			stage1.show();
			stage.hide();
		});
	}
	
	public void draw(ContextGraphics2D gd)
	{
		if(cursor.isSelected())
		{
			
		}else if(delete.isSelected())
		{
			
		}else if(trans.isSelected())
		{
			
		}else if(state.isSelected())
		{
			double x = e.getX();
			double y = e.getY();
			
			x = x-5.0;
			y = y-5.0;
			gd.fillOval(x,y,x,y);
		}
			
	}

	private VBox createToolBar()
	{
		Menu     file = new Menu("File");
		Menu     test = new Menu("Test");
		Menu    input = new Menu("Input");
		Menu     view = new Menu("View");
		Menu  convert = new Menu("Convert");
		Menu     help = new Menu("Help");
		Menu   saveAs = new Menu("SaveAs");
		
		MenuItem  newItem = new MenuItem("New");
		MenuItem     open = new MenuItem("Open");
		MenuItem     save = new MenuItem("Save");
		MenuItem graphJPG = new MenuItem("Save Graph As JPG");
		MenuItem graphPNG = new MenuItem("Save Graph As PNG");
		MenuItem graphGIF = new MenuItem("Save Graph As GIF");
		MenuItem graphBMP = new MenuItem("Save Graph As BMP");
		MenuItem graphSVG = new MenuItem("Save Graph As SVG");
		MenuItem     quit = new MenuItem("Quit");
		MenuItem    close = new MenuItem("Close");
		MenuItem    print = new MenuItem("Print");
		
		// adding the menuitem to the menu
		file.getItems().addAll(newItem,open,save,saveAs,close,print,quit);
		saveAs.getItems().addAll(graphJPG,graphPNG,graphGIF,graphBMP,graphSVG);
		
		//creating the Menu Bar
		final MenuBar mb = new MenuBar();
		mb.getMenus().addAll(file,input,test,view,convert,help);
		
		group = new ToggleGroup();
		cursor = new ToggleButton("  ");
		trans  = new ToggleButton("  ");
		delete = new ToggleButton("  ");
		state = new ToggleButton("  ");
		group.getToggles().addAll(cursor,trans,delete,state);
		
		ToolBar tool = new ToolBar();
		tool.getItems().addAll(cursor,trans,delete,state);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(mb,tool);
		
		return vBox;
	}
	
	
	public void createTab()
	{
		Tab tab = new Tab();
		tab.setTitle("New Tab");
		Canvas canvas = setCanvas();
		tab.setContent(canvas);
	}
	
	public Canvas setCanvas()
	{
		Canvas canvas = new Canvas();
		ContextGraphics2D gd = canvas.getContextGraphics();
		gd.clearRect(0,0,200,200);
		gd.setOnAction(e -> draw(gd));
	}
}


