import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Group;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;


public class ShapesTest extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		Box box = new Box(100,100,100);
		box.setTranslateX(150.0D);
		box.setTranslateY(0.0D);
		box.setTranslateZ(400.0D);
		box.setDrawMode(DrawMode.LINE);
		
		Sphere sphere = new Sphere(50);
		sphere.setTranslateX(300.0D);
		sphere.setTranslateY(-50.0D);
		sphere.setTranslateZ(300.0D);
		sphere.setDrawMode(DrawMode.LINE);
		
		
		Cylinder cyl = new Cylinder(50,120);
		cyl.setTranslateX(500.0D);
		cyl.setTranslateY(-50.0D);
		cyl.setTranslateZ(500.0D);
		cyl.setDrawMode(DrawMode.LINE);
		
		PointLight light = new PointLight();
		light.setTranslateX(100.0D);
		light.setTranslateY(50.0D);
		light.setTranslateZ(150.0D);
		
		Group root = new Group(box,sphere,cyl,light);
		
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setTranslateX(100.0D);
		camera.setTranslateY(-50.0D);
		camera.setTranslateZ(300.0D);
		
		Scene scene = new Scene(root,300,100,true);
		scene.setCamera(camera);
		stage.setScene(scene);
		stage.setTitle("Shapes Test");
		stage.show();
	}
}