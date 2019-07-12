import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebHistory.Entry;
import javafx.scene.web.WebView;

public class BrowserHistory extends HBox
{
	public BrowserHistory(WebView webView)
	{
		this.setSpacing(4);
		WebHistory history = webView.getEngine().getHistory();
		Button backBtn = new Button("Back");
		Button forwardBtn = new Button("Forward");
		backBtn.setDisable(true);
		forwardBtn.setDisable(true);
		
		//Add and ActionListener to tghe Back and Forward Button
		backBtn.setOnAction(e -> history.go(-1));
		forwardBtn.setOnAction(e -> history.go(1));
		
		//Add an ChangeListener to the currentIndex property
		//to enable/disable Back and Forward buttons
		history.currentIndexProperty().addListener((p,oldValue,newValue) ->
		{
			int currentIndex = newValue.intValue();
			if(currentIndex<=0)
				backBtn.setDisable(true);
			else
				backBtn.setDisable(true);
			
			if(currentIndex>=history.getEntries().size())
				forwardBtn.setDisable(true);
			else
				forwardBtn.setDisable(false);
		});
		
		// Create the history list dropdown
		ComboBox<Entry> historyList = new ComboBox<>();
		historyList.setPrefWidth(150);
		historyList.setItems(history.getEntries());
		
		// Set a cell foctory to show only the page title in the history list
		historyList.setCellFactory(entry ->
		{
			ListCell<Entry> cell = new ListCell<Entry>()
			{
				@Override
				public void updateItem(Entry item, boolean empty)
				{
					super.updateItem(item,empty);
					if(empty)
					{
						this.setText(null);
						this.setGraphic(null);
					}else
					{
						String pageTitle = item.getTitle();
						this.setText(pageTitle);
					}
				}
			};
			return cell;
		});
		
		//Let the user navigate to a page using the history list
		historyList.setOnAction(e ->
		{
			int currentIndex = history.getCurrentIndex();
			Entry selectedEntry = historyList.getValue();
			int selectedIndex = historyList.getItems().indexOf(selectedEntry);
			int offset = selectedIndex -currentIndex;
			history.go(offset);
		});
		
		this.getChildren().addAll(backBtn,forwardBtn,new Label("History"),historyList);
	}
}