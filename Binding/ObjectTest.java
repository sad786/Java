import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.value.ChangeListener;

public class ObjectTest
{
	public static void main(String args[])
	{
		var b1 = new Book("First Book","01245684",500);
		var b2 = new Book("Third Book","457400",600);
		
		ObjectProperty<Book> obj1= new SimpleObjectProperty<>(b1);
		ObjectProperty<Book> obj2 = new SimpleObjectProperty<>(b2);
		
		BooleanBinding isEqual = obj1.isEqualTo(obj2);
		ChangeListener<Boolean> listener = (prop,oldValue,newValue) ->System.out.println("OldValue = "+oldValue+" New Value "+newValue);
		isEqual.addListener(listener);
		
		//System.out.println(isEqual.getValue());
		
		obj2.set(b1);
		///System.out.println(isEqual.getValue());
		
	//	obj2.set(b2);
		b2.setISBN(b1.getISBN());
		b2.setPrice(b1.getPrice());
		b2.setTitle(b1.getTitle());
		obj2.set(b2);
		//System.out.println(isEqual.getValue());
	}
}


class Book
{
	private StringProperty title = new SimpleStringProperty(null);
	private StringProperty ISBN = new SimpleStringProperty(null);
	private IntegerProperty price = new SimpleIntegerProperty(0);
	
	public Book()
	{
		title.set("");
		ISBN.set("");
		price.set(0);
	}
	
	public Book(String title,String ISBN,int price)
	{
		this.title.set(title);
		this.ISBN.set(ISBN);
		this.price.set(price);
	}
	
	public void setPrice(int price)
	{
		this.price.set(price);
	}
	
	public int getPrice()
	{
		return this.price.getValue();
	}
	
	public ReadOnlyIntegerProperty priceProperty()
	{
		return price;
	}
	
	public void setTitle(String title)
	{
		this.title.set(title);
	}
	
	public String getTitle()
	{
		return this.title.getValue();
	}
	
	public ReadOnlyStringProperty titleProperty()
	{
		return this.title;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN.set(ISBN);
	}
	
	public String getISBN()
	{
		return this.ISBN.getValue();
	}
	
	public ReadOnlyStringProperty ISBNProperty()
	{
		return this.ISBN;
	}
	
}
