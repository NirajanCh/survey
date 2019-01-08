package auction.rabindra.admingui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import auction.rabindra.admingui.ClientList;

import auction.rabindra.questionnaire.QuesController;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Dashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	QuesController controller = new QuesController();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Dashboard frame = new Dashboard();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Screenshot_1.png"));
		setTitle("Survey for Online Auction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 756, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToAdmin = new JLabel("ADMIN DASHBOARD");
		lblWelcomeToAdmin.setBounds(247, 22, 242, 31);
		lblWelcomeToAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblWelcomeToAdmin);
		
		JButton clientlist = new JButton("View Client List");
		clientlist.setFont(new Font("Tahoma", Font.BOLD, 15));
		clientlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientList cl= new ClientList();
				cl.setVisible(true);
				dispose();
			}
		});
		clientlist.setBounds(30, 87, 195, 56);
		panel.add(clientlist);
		
		JButton analyse = new JButton("Analyse Data");
		analyse.setFont(new Font("Tahoma", Font.BOLD, 15));
		analyse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		analyse.setBounds(30, 201, 195, 56);
		panel.add(analyse);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\i_love_auctions_tag.jpg"));
		lblNewLabel.setBounds(215, 64, 513, 243);
		panel.add(lblNewLabel);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 620, 349);
		contentPane.add(background);
	}
}
