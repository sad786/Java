import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.collections.SetChangeListener;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
public class SetExample
{
	public static void main(String args[])
	{
		ObservableSet<String> set = FXCollections.<String>observableSet("Saddam","Atul","Akash");
		InvalidationListener listener = ob -> System.out.println("Set become invalid");
		
		set.addListener(SetExample::onChanged);
		set.addListener(SetExample::invalidated);
		set.add("Dilshad");
		set.remove("Akash");
		set.add("Akash");
		set.add("Saddam");
	}
	
	public static void invalidated(Observable b)
	{
		System.out.println("Invalid");
	}
	
	public static void onChanged(SetChangeListener.Change change)
	{
		if(change.wasAdded())
			System.out.println("New Element Added to the List is '"+change.getElementAdded()+"'");
		else if(change.wasRemoved())
			System.out.println("One Element Removed from the List is '"+change.getElementRemoved()+"'");
		
		System.out.println("Modified List is "+change.getSet());
	}
}