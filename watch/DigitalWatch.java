package com.watch;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.time.LocalTime;

public class DigitalWatch extends Application
{
	private Button btn = new Button("");
	private Thread t = null;
	private String str = "";
	private String st = "";
	private int hour;
	@Override
	public void start(Stage stage)
	{
		var pane = new BorderPane();
		pane.setCenter(btn);
		btn.setFont(Font.font(null,FontWeight.BOLD,50));
		//btn.setGraphic(Color.YELLOW);
		var scene = new Scene(pane,500,200);
		scene.setFill(Color.CYAN);
		stage.setScene(scene);
		stage.setTitle("Digital Watch");
		stage.setResizable(false);
		stage.setOnCloseRequest(e -> this.close());
		stage.show();
		t = new Thread(this::runTask);
		t.setDaemon(true);
		t.start();
	}
	private void close()
	{
		str = "close";
	}
	public void runTask()
	{
		while(!str.equals("close"))
		{
			var time = LocalTime.now();
			 hour = time.getHour();
			var min  = time.getMinute();
			var sec  = time.getSecond();
			if(hour>=12){
				hour = hour-12;
				st = "PM";
			}else
				st = "AM";
			Platform.runLater(()-> btn.setText(hour+":"+min+":"+sec+" "+st));
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
		}
	}
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
}