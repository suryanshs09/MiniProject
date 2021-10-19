package uiTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class demoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
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
		setBounds(100, 100, 715, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton loginBtn = new JButton("log in");
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = usernameTxt.getText();
				String pass = new String(passTxt.getPassword());
				if(pass.equals("1234")) {
					JOptionPane.showMessageDialog(contentPane, "Welcome " + user,"Login Successfull", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "the password for " + user + " dosn't match!","Incorrect Password", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		loginBtn.setBounds(276, 450, 134, 35);
		contentPane.add(loginBtn);
		
		JLabel lblNewLabel = new JLabel("E M A I L");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 15));
		lblNewLabel.setBounds(202, 202, 65, 13);
		contentPane.add(lblNewLabel);
		
		usernameTxt = new JTextField();
		usernameTxt.setBounds(202, 225, 300, 35);
		contentPane.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("P A S S W O R D");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(202, 289, 116, 13);
		contentPane.add(lblNewLabel_1);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(202, 312, 300, 35);
		contentPane.add(passTxt);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot Password?");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(276, 381, 134, 23);
		contentPane.add(lblNewLabel_2);
	}
}
