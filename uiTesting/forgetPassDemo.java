package uiTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class forgetPassDemo extends JFrame {

	private JPanel contentPane;
	private JTextField forgotPassTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgetPassDemo frame = new forgetPassDemo();
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
	public forgetPassDemo() {
		Image icon = Toolkit.getDefaultToolkit().getImage("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\logoIcon.png"); 
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new BgImgJPanel("S:\\Suryansh\\programs\\MiniProject\\BackgroundImages\\loginPages.png");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel emailLabel = new JLabel("E M A I L");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Poppins", Font.PLAIN, 15));
		emailLabel.setBounds(453, 332, 65, 13);
		contentPane.add(emailLabel);
		
		forgotPassTxt = new JTextField();
		forgotPassTxt.setColumns(10);
		forgotPassTxt.setBounds(453, 355, 300, 35);
		contentPane.add(forgotPassTxt);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.setForeground(Color.WHITE);
		lblForgotPassword.setFont(new Font("Poppins", Font.BOLD, 25));
		lblForgotPassword.setBounds(495, 264, 230, 36);
		contentPane.add(lblForgotPassword);
		
		JButton btnSend = new JButton("send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(contentPane,"the Password is: " + "1234", "Password", JOptionPane.OK_CANCEL_OPTION);
				if(input == JOptionPane.OK_OPTION) {
					dispose();
				}
			}
		});
		btnSend.setForeground(Color.BLUE);
		btnSend.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnSend.setFocusPainted(false);
		btnSend.setBackground(Color.WHITE);
		btnSend.setBounds(536, 443, 134, 35);
		contentPane.add(btnSend);
	}
}
