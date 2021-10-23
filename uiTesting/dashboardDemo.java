package uiTesting;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class dashboardDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboardDemo frame = new dashboardDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dashboardDemo() {
		Image icon = Toolkit.getDefaultToolkit().getImage("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\logoIcon.png"); 
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new BgImgJPanel("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\loginPages.png");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel inventoryOptionLbl = new JLabel("");
		ImageIcon inventoryIcon = new ImageIcon("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\inventoryIcon.png");
		inventoryOptionLbl.setBounds(71, 272, 250, 250);
		inventoryOptionLbl.setIcon(inventoryIcon);
		contentPane.add(inventoryOptionLbl);
		
		JLabel customerOptionLbl = new JLabel("");
		ImageIcon customerIcon = new ImageIcon("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\customerIcon.png");
		customerOptionLbl.setBounds(472, 272, 250, 250);
		customerOptionLbl.setIcon(customerIcon);
		contentPane.add(customerOptionLbl);
		
		JLabel billOptionLbl = new JLabel("");
		ImageIcon billIcon = new ImageIcon("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\billIcon.png");
		billOptionLbl.setBounds(879, 272, 250, 250);
		billOptionLbl.setIcon(billIcon);
		contentPane.add(billOptionLbl);
	}
}
