import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import java.util.Locale;
public class StringTest
{
	public static void main(String args[])
	{
		DoubleProperty radius = new SimpleDoubleProperty(5.0);
		DoubleProperty area = new SimpleDoubleProperty(0.0);
		
		StringProperty rad = new SimpleStringProperty("Radius = ");
		
		area.bind(radius.multiply(radius).multiply(Math.PI));
		
		StringExpression newArea = rad.concat(radius.asString())
									.concat(", Area = ")
									.concat(area.asString(Locale.US,"%.2f"));
									
		
		System.out.println(newArea.getValueSafe());
		radius.set(10.0);
		System.out.println(newArea.getValueSafe());
									
	}
}