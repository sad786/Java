import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javafx.scene.web.WebEvent;

public class JSCommandTest extends Application
{
	private Stage st;
	private final String DEFAULT_HOME_PAGE = "jshandlers.html";
	public static void man(String[] args)
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		st = stage;
		String homePageUrl = getDefaultHomePageUrl();
		BrowserPane root = new BrowserPane(homePageUrl,stage);
		root.getWebView().getEngine().setOnResized(this::resized);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		//stage.setFullScreen(true);
		stage.show();
	}
	public void resized(WebEvent<Rectangle2D> rects)
	{
		st.setFullScreen(true);
	}
	public String getDefaultHomePageUrl()
	{
		String pageUrl = "http://www.google.com";
		URL url = this.getClass().getClassLoader().getResource(DEFAULT_HOME_PAGE);
		if(url==null)
			System.out.println(
							"Courld not find"+DEFAULT_HOME_PAGE+" in CLASSPATH."+
							"Using "+pageUrl+" as the default home page."
								);
		else
		{
			pageUrl = url.toExternalForm();
		}
		return pageUrl;
	}
}