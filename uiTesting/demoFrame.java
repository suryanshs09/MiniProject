package uiTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class demoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField useremailTxt;
	private JPasswordField passTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demoFrame frame = new demoFrame();
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
	public demoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new BackgroundImageJPanel("S:\\Suryansh\\Downloads\\appBgImagesLogin2.png");
		//contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton loginBtn = new JButton("log in");
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = useremailTxt.getText();
				String pass = new String(passTxt.getPassword());
				if(pass.equals("1234")) {
					JOptionPane.showMessageDialog(contentPane, "Welcome " + user,"Login Successfull", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "the password for " + user + " dosn't match!","Incorrect Password", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		loginBtn.setBounds(537, 540, 134, 35);
		contentPane.add(loginBtn);
		
		JLabel emailLabel = new JLabel("E M A I L");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Poppins", Font.PLAIN, 15));
		emailLabel.setBounds(463, 292, 65, 13);
		contentPane.add(emailLabel);
		
		useremailTxt = new JTextField();
		useremailTxt.setBounds(463, 315, 300, 35);
		contentPane.add(useremailTxt);
		useremailTxt.setColumns(10);
		
		JLabel passLabel = new JLabel("P A S S W O R D");
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Poppins", Font.PLAIN, 15));
		passLabel.setBounds(463, 379, 116, 13);
		contentPane.add(passLabel);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(463, 402, 300, 35);
		contentPane.add(passTxt);
		
		JLabel forgetPassLabel = new JLabel("Forgot Password?");
		forgetPassLabel.setForeground(Color.WHITE);
		forgetPassLabel.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		forgetPassLabel.setBounds(537, 471, 134, 23);
		contentPane.add(forgetPassLabel);
	}
}