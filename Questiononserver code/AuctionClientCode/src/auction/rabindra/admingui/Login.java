package auction.rabindra.admingui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import auction.rabindra.admingui.Dashboard;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Screenshot_1.png"));
		setTitle("Survey for Online Auction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 604, 345);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(41, 145, 126, 36);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(322, 145, 112, 36);
		panel.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(124, 151, 133, 30);
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(406, 151, 138, 30);
		panel.add(password);
		
		JButton Login = new JButton("Login");
		Login.setFont(new Font("Tahoma", Font.BOLD, 20));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname= username.getText();
				String pass = password.getText();
				if (uname.equals("admin") && pass.equals("admin"))
				{
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
					Dashboard d=new Dashboard();
					d.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			}
		});
		Login.setBounds(223, 227, 153, 43);
		panel.add(Login);
		
		JLabel lblLoginDashboard = new JLabel("Login Dashboard");
		lblLoginDashboard.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLoginDashboard.setBounds(189, 75, 223, 36);
		panel.add(lblLoginDashboard);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\auction-shopping-sites.jpg"));
		lblNewLabel.setBounds(0, 0, 604, 345);
		panel.add(lblNewLabel);
	}
}
