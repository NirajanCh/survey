package auction.rabindra.admingui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ClientList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ClientList frame = new ClientList();
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
	public ClientList() {
		setTitle("Survey for Online Auction");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Screenshot_1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnLoadClientDetails = new JButton("Load Client Details");
		btnLoadClientDetails.setBounds(236, 71, 218, 33);
		btnLoadClientDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLoadClientDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnLoadClientDetails);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\a.png"));
		lblNewLabel.setBounds(0, 0, 684, 377);
		contentPane.add(lblNewLabel);
	}
}
