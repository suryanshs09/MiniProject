package uiTesting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BackgroundImageJPanel extends JPanel{
	
	private Image bgImage;
	
	public BackgroundImageJPanel (String bg){
		bgImage = Toolkit.getDefaultToolkit().createImage(bg);
	}

	@Override
	  protected void paintComponent(Graphics g) {

	    super.paintComponent(g);
	        g.drawImage(bgImage, 0, 0, null);
	}
}
