package uiTesting;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BgImgJPanel extends JPanel{
	
	private Image bgImage;
	
	public BgImgJPanel (String bg){
		bgImage = new ImageIcon(bg).getImage();
	}

	@Override
	  protected void paintComponent(Graphics g) {

	    super.paintComponent(g);
	        g.drawImage(bgImage, 0, 0, null);
	}
}
