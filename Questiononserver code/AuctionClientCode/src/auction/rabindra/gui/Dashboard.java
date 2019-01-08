package auction.rabindra.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import auction.rabindra.gui.QuestionClient;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Dashboard {

	private JFrame frmWelcomeToSurvey;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frmWelcomeToSurvey.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToSurvey = new JFrame();
		frmWelcomeToSurvey.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Screenshot_1.png"));
		frmWelcomeToSurvey.setTitle("Survey for online auction");
		frmWelcomeToSurvey.setBounds(100, 100, 659, 396);
		frmWelcomeToSurvey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToSurvey.getContentPane().setLayout(null);
		frmWelcomeToSurvey.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 676, 357);
		frmWelcomeToSurvey.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("You are welcome for auction survey,");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(31, 95, 611, 31);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\startsurvey.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {// action listener event after clicking button
			public void actionPerformed(ActionEvent e) {
				QuestionClient q = new QuestionClient();
				q.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(417, 252, 171, 75);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Thanks for help and support. Please start with survey now.");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 298, 441, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblSurveyForOnline = new JLabel("Survey for Online Auction");
		lblSurveyForOnline.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSurveyForOnline.setBounds(188, 31, 327, 36);
		panel.add(lblSurveyForOnline);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Auction-gavel.jpg"));
		lblNewLabel_6.setBounds(0, 0, 648, 357);
		panel.add(lblNewLabel_6);
	}
}
