import javax.swing.*;
//import javax.swing.layout.*;

public class JFLAP1 extends JFrame
{
	public JFLAP1(String title)
	{
		super(title);
		
		
		JButton btn1 = new JButton("Finite Automation");
		btn1.setWidth(200.0D);
		JButton btn2 = new JButton("Mealy Machine");
		btn2.setWidth(200.0D);
		JButton btn3 = new JButton("Moore Machine");
		btn3.setWidth(200.0D);
		JButton btn4 = new JButton("Pushdown Automation");
		btn4.setWidth(200.0D);
		JButton btn5 = new JButton("Turing Machine");
		btn5.setWidth(200.0D);
		JButton btn6 = new JButton("Multi-tape Turing Machine");
		btn6.setWidth(200.0D);
		JButton btn7 = new JButton("Grammar");
		btn7.setWidth(200.0D);
		JButton btn8 = new JButton("L-System");
		btn8.setWidth(200.0D);
		JButton btn9 = new JButton("Regular Expression");
		btn9.setWidth(200.0D);
		JButton btn10 =new JButton("Regular Pumping Lemma");
		btn10.setWidth(200.0D);
		JButton btn11 = new JButton("Context-free Pumping Lemma");
		btn11.setWidth(200.0D);
		
		//Creating the MenuBar for MenuItems
		JMenuBar     mb = new JMenuBar();
		JMenu  fileMenu = new JMenu("File");
		JMenu  helpMenu = new JMenu("Help");
		JMenu batchMenu = new JMenu("Batch");
		JMenu  prefMenu = new JMenu("Preferences");
		
		//adding the menu to menu bar
		//mb.addAll(fileMenu,helpMenu,batchMenu,prefMenu);
		
		//Creating the menu items for menu
		JMenuItem open = new JMenuItem("Open");
		JMenuItem quit = new JMenuItem("Quit");
		
		fileMenu.add(open);fileMenu.add(quit);
		
		
		VBox vbox =new VBox();
		vbox.addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11);
		
		add(vbox);
	}
	public static void main(String args[])
	{
		JFLAP1 jp = new JFLAP1("JFLAP");
		
		jp.setLayout(null);
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp.setVisible(true);
		
	}
}