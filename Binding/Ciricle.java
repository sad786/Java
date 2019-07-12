import javafx.beans.property.IntegerProperty;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
public class Ciricle
{
	public static void main(String args[])
	{
		DoubleProperty area = new SimpleDoubleProperty(0);
		
		IntegerProperty radius = new SimpleIntegerProperty(5);
		double pi = 3.14;
		
		area.bind(radius.multiply(radius).multiply(pi));
		
		area.addListener(Ciricle::changed);
		radius.set(10);
		radius.set(5);
		radius.set(5);
		
		area.unbind();
		area.set(500);
		
	}
	
	public static void changed(ObservableValue<? extends Number> prop, Number oldValue,Number newValue)
	{
		System.out.println("Area is changed");
		System.out.println("Old Area "+oldValue+" New Area "+newValue);
	}
}