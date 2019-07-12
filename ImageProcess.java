import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.imageio.ImageIO;
public class ImageProcess extends JPanel
{
	public void paint(Graphics g)
	{
		var img = this.createImage();
		g.setColor(Color.BLUE);
		g.drawImage(img,0,0,this);
		try
		{
			var fout = new File("image.jpg");
			ImageIO.write(img,"jpg",fout);
		}catch(IOException e){System.out.println("Image cannot be processed..");}
		System.out.println("Image successfully created....");
	}
	private BufferedImage createImage()
	{
		var img = new BufferedImage(600,600,BufferedImage.TYPE_INT_RGB);
		Color c = Color.BLUE;
		for(int i=0;i<img.getHeight(); i++)
		{
			for(int j=0;j<img.getWidth(); j++)
			{
				img.setRGB(i,j,c.getRGB());
			}
		}
		
		var g = img.getGraphics();
		
		g.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
		g.drawString("m",250,100);
		g.setFont(new Font(Font.MONOSPACED,Font.BOLD,40));
		g.drawString("i",295,100);
		g.setColor(Color.RED);
		g.drawString("e",310,100);
		g.setColor(Color.WHITE);
		g.drawString("t",335,100);
		
		return img;
	}
	public static void main(String args[])
	{
		var fr = new JFrame();
		fr.getContentPane().add(new ImageProcess());
		fr.setTitle("Image Processing Using Java");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(600,200);
		fr.setVisible(true);
	}
}