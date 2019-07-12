import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Hyperlink;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class HyperlinkTest extends Application
{
	private WebView webView;
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	public void start(Stage stage)
	{
		webView = new WebView();
		
		
		Hyperlink mysirg = new Hyperlink("MySirG.com");
		mysirg.setOnAction(e -> {openPage("www.mysirg.com");mysirg.setVisited(false);});
		
		
		Hyperlink bing = new Hyperlink("Bing");
		bing.setOnAction(e -> {openPage("www.bing.com");bing.setVisited(false);});
		
		Hyperlink google = new Hyperlink("Google");
		google.setOnAction(e -> {openPage("www.google.com");google.setVisited(false);});
		
		Hyperlink yahoo = new Hyperlink("Yahoo!");
		yahoo.setOnAction(e -> {openPage("www.yahoo.com");yahoo.setVisited(false);});
		
		HBox links = new HBox();
		links.setSpacing(10);
		links.getChildren().addAll(mysirg,bing,google,yahoo);
		
		BorderPane bd = new BorderPane();
		bd.setTop(links);
		bd.setCenter(webView);
		
		Scene scene = new Scene(bd);
		stage.setScene(scene);
		stage.setTitle("Hyperlink Example with web view");
		stage.show();
	}
	
	public void openPage(String link)
	{
		webView.getEngine().load(link);
	}
}