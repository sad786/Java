import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.beans.value.ObservableValue;

public class WebViewTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		WebView view = new WebView();
		view.setContextMenuEnabled(false);
		view.setFontSmoothingType(FontSmoothingType.GRAY);
		view.setZoom(1.20D);
		
		WebEngine engine = view.getEngine();
		engine.load("http://www.bing.com/");
		engine.titleProperty().addListener((ObservableValue<? extends String> p, String oldTitle, String newTitle) ->
		{
			stage.setTitle(newTitle);
		});
		
		TextField tf = new TextField();
		Button btn = new Button("Search");
		btn.setDefaultButton(true);
		btn.setOnAction(e -> loadPage(engine,tf.getText()));

		MenuButton menu = new MenuOptions(view,"Options");
		HBox box = new HBox(menu,tf,btn);
		box.setHgrow(tf,Priority.ALWAYS);
		
		VBox root = new VBox(box,view);
		root.setVgrow(view,Priority.ALWAYS);
		root.setStyle("-fx-border-width:3px;"+
					  "-fx-border-color:blue;"+
					  "-fx-border-sytle:solid inside;"+
					  "-fx-border-insets:3px;"+
					  "-fx-padding:5px;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using WebView Test");
		stage.show();
	}
	
	private void loadPage(WebEngine en, String url)
	{
		if(url!=null||!url.equals(""))
		{
			en.load("http://"+url);
		}
	}
}