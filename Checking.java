import javafx.application.Platform;
import javafx.application.ConditionalFeature;

public class Checking
{
	public static void main(String args[])
	{
		boolean support = Platform.isSupported(ConditionalFeature.SCENE3D);
		
		if(support)
			System.out.println("3D is Supported in your machine");
		else
			System.out.println("3D is not Supported in your machine");
	}
}