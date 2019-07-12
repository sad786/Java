import javafx.scene.layout.BorderPane;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.Window;

public class BrowserPane extends BorderPane
{
	private static String DEFAULT_HOME_PAGE = "http://www.google.com";
	private WebView webView;
	
	public BrowserPane(Window ownerWindow)
	{
		this(null,ownerWindow);
	}
	
	public BrowserPane(String homePageUrl,Window ownerWindow)
	{
		this(homePageUrl,true,true,true,ownerWindow);
	}
	
	public BrowserPane(String homePageUrl,
						boolean enableNavigationBar,
						boolean enableStatusBar,
						boolean enableJSHandlers,
						Window ownerWindow){
			
			//create the WebView
			webView = new WebView();
			this.setCenter(webView);
			
			if(homePageUrl==null)
				homePageUrl = DEFAULT_HOME_PAGE;
			if(enableNavigationBar)
				this.addNavigationBar(homePageUrl);
			if(enableStatusBar)
				this.addStatusBar();
			if(enableJSHandlers)
				this.addJSHandlers(ownerWindow);
		
	}
	
	private void addNavigationBar(String homePageUrl)
	{
		MenuButton options = new MenuOptions(webView,"Options");
		BrowserHistory historyComponent = new BrowserHistory(webView);
		NavigationBar navBar = new NavigationBar(webView,homePageUrl,true);
		navBar.getChildren().addAll(options,historyComponent);
		this.setTop(navBar);
	}
	
	private void addStatusBar()
	{
		Label statusLbl = new Label();
		
		//Configure the status bar
		statusLbl.setStyle("-fx-background-color:lightgray;");
		statusLbl.prefWidthProperty().bind(webView.widthProperty());
		
		//If the worker object reports a message, display it in the status bar
		webView.getEngine().setOnStatusChanged(e -> statusLbl.setText(e.getData()));
		this.setBottom(statusLbl);
	}
	
	private void addJSHandlers(Window ownerWindow)
	{
		webView.getEngine().setPromptHandler(JSHandlers.getPromptHandler());
		webView.getEngine().setCreatePopupHandler(JSHandlers.getPopupHandler());
		webView.getEngine().setOnAlert(JSHandlers::alertHandler);
		webView.getEngine().setConfirmHandler(JSHandlers.getConfirmHandler());
		if(ownerWindow instanceof Stage)
		{
			Stage stage = (Stage) ownerWindow;
			
			// Sync the tittle of the Stage with the title of the loaded web page
			webView.getEngine().titleProperty().addListener(
			(prop,oldTitle,newTitle) -> stage.setTitle(newTitle));
		}
	
	}
		
	public WebView getWebView()
	{
		return webView;
	}
}