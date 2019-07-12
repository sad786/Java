import java.io.File;
import java.net.MalformedURLException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.beans.value.ObservableValue;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class NavigationBar extends HBox
{
	private FileChooser fileChooser = new FileChooser();
	
	public NavigationBar(WebView webView,String homePageUrl,boolean gotoHomePage)
	{
		this.setSpacing(4);
		this.setStyle("-fx-background-color:lightblue;-fx-padding:5;");
		
		WebEngine webEngine = webView.getEngine();
		TextField pageUrl = new TextField();
		Button refreshButton = new Button("Refresh");
		Button goBtn = new Button("Go");
		Button homeBtn = new Button("Home");
		Button openBtn = new Button("Open");
		
		//Let the TextField grow horizontally
		HBox.setHgrow(pageUrl,Priority.ALWAYS);
		this.getChildren().addAll(pageUrl,goBtn,homeBtn,refreshButton,openBtn);
		
		//Ad and actionListener to navigate to the entered URL
		pageUrl.setOnAction(e -> webEngine.load(pageUrl.getText()));
		
		//update the URL in the TextField when user navigates to another page.
		webEngine.locationProperty().addListener(
												(ObservableValue<? extends String>prop,
												String oldValue,String newValue) -> pageUrl.setText(newValue));
												
		//Add and ActionListener for the Refresh Button
		refreshButton.setOnAction(e -> webEngine.reload());
		
		//Add an ActionListener for the Go Buton
		goBtn.setOnAction(e -> webEngine.load(pageUrl.getText()));
		
		//Add an  ActionListener for the Home Button
		homeBtn.setOnAction(e -> webEngine.load(homePageUrl));
		
		//Configure the FileChooser
		fileChooser.setTitle("Open Web Content");
		fileChooser.getExtensionFilters()
					.addAll(new ExtensionFilter("HTML Files","*.hmtl","*.html"));
				
		//Add an ActionListener for the Open Button
		openBtn.setOnAction(e ->
		{
			File selectedFile = fileChooser.showOpenDialog(webView.getScene().
									getWindow());
			if(selectedFile!=null)
			{
				try{
					webEngine.load(selectedFile.toURI().toURL().toExternalForm());
				}catch(MalformedURLException e2){System.out.println(e2);}
			}
		
		});
	}
	
}