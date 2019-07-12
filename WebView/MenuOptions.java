import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.beans.property.SimpleStringProperty;
import static javafx.scene.text.FontSmoothingType.GRAY;
import static javafx.scene.text.FontSmoothingType.LCD;

public class MenuOptions extends MenuButton
{
	public MenuOptions(WebView view,String title)
	{
		this.setText(title);
		
		//Enabled Context Menu option
		CheckMenuItem ctxMenu = new CheckMenuItem("Enable Context Menu");
		ctxMenu.setSelected(true);
		view.contextMenuEnabledProperty().bind(ctxMenu.selectedProperty());
		
		//Font Scale options
		Menu scallingMenu =new Menu("Font Scale");
		/*scallingMenu.textProperty().bind(
										new SimpleStringProperty("Font Scale")
										.concat(view.fontScaleProperty().multiply(100.0))
										.concat("%"));
										*/	
		MenuItem normalFontMenu = new MenuItem("Normal");
		MenuItem biggerFontMenu = new MenuItem("10% Bigger");
		MenuItem smallerFontMenu = new MenuItem("10% Smaller");
		biggerFontMenu.setOnAction(e -> view.setFontScale(view.getFontScale()+0.10));
		normalFontMenu.setOnAction(e -> view.setFontScale(1.0));
		smallerFontMenu.setOnAction(e -> view.setFontScale(view.getFontScale()-0.10));
		scallingMenu.getItems().addAll(normalFontMenu,biggerFontMenu,smallerFontMenu);
		
		
		//Font Smoothing options
		Menu smoothingMenu = new Menu("Font Smoothing");
		RadioMenuItem grayMenu = new RadioMenuItem("GRAY");
		grayMenu.setSelected(true);
		RadioMenuItem lcdMenu = new RadioMenuItem("LCD");
		lcdMenu.setOnAction(e -> view.setFontSmoothingType(LCD));
		grayMenu.setOnAction(e -> view.setFontSmoothingType(GRAY));
		new ToggleGroup().getToggles().addAll(lcdMenu,grayMenu);
		smoothingMenu.getItems().addAll(grayMenu,lcdMenu);
		
		//Zooming options
		Menu zoomMenu = new Menu("Zoom");
		
		/*zoomMenu.textProperty().bind(
									new SimpleStringProperty("Zoom")
									.concat(view.zoomProperty().multiply(100.0))
									.concat("%"));
									*/
		MenuItem normalZoomMenu = new MenuItem("Normal");
		MenuItem biggerZoomMenu = new MenuItem("10% Bigger");
		MenuItem smallerZoomMenu = new MenuItem("10% Bigger");
		normalZoomMenu.setOnAction(e -> view.setZoom(1.0));
		smallerZoomMenu.setOnAction(e -> view.setZoom(view.getZoom() - 0.10));
		biggerZoomMenu.setOnAction(e -> view.setZoom(view.getZoom()+0.10));
		zoomMenu.getItems().addAll(normalZoomMenu,biggerZoomMenu,smallerZoomMenu);
		
		//Enabled JavaScript Option
		CheckMenuItem scriptMenu = new CheckMenuItem("Enable JavaScript");
		scriptMenu.setSelected(true);
		view.getEngine().javaScriptEnabledProperty().bind(scriptMenu.selectedProperty());
		
		//Add menus to the menu button
		this.getItems().addAll(ctxMenu,scallingMenu,
								smoothingMenu,zoomMenu,new SeparatorMenuItem(),scriptMenu);
								
	}
}