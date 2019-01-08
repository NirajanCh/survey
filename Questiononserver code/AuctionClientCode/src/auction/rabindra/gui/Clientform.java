package auction.rabindra.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONObject;


public class Clientform extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField fullname;
	private static JTextField emailaddress;
	private static JTextField profession;
	
	private static ArrayList<String> name = new ArrayList<String>();
	private static ArrayList<String> address = new ArrayList<String>();
	private static ArrayList<String> profess = new ArrayList<String>();
	
	
	/**
	 * Launch the application.
	 */
	public static void makeJson(String filename) throws Exception {
		JSONObject jb = new JSONObject();

		name.add(fullname.getText());
		address.add(emailaddress.getText());
		profess.add(profession.getText());
		
		jb.put("name", name);
		jb.put("address", address);
		jb.put("profession", "profession");
		Files.write(Paths.get(filename), jb.toJSONString().getBytes());
	}
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Clientform frame = new Clientform();
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
	public Clientform() {
		setTitle("Online Auction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProvideSomeDetails = new JLabel("Enter User Detail");
		lblProvideSomeDetails.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblProvideSomeDetails.setBounds(138, 11, 271, 51);
		contentPane.add(lblProvideSomeDetails);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblFullName.setBounds(76, 94, 131, 22);
		contentPane.add(lblFullName);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblEmailAddress.setBounds(76, 154, 156, 22);
		contentPane.add(lblEmailAddress);
		
		fullname = new JTextField();
		fullname.setBounds(244, 90, 252, 32);
		contentPane.add(fullname);
		fullname.setColumns(10);
		
		emailaddress = new JTextField();
		emailaddress.setBounds(242, 150, 254, 32);
		contentPane.add(emailaddress);
		emailaddress.setColumns(10);
		
		JButton btnsave = new JButton("Start Survey");
		btnsave.setFont(new Font("Sitka Text", Font.BOLD, 20));
		btnsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					makeJson("ClientDetail.json");
					JOptionPane.showMessageDialog(null, "Client Detail saved");
					QuestionClient q = new QuestionClient();
//					QuestionForm q= new QuestionForm();
					q.setVisible(true);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnsave.setBounds(203, 266, 167, 38);
		contentPane.add(btnsave);
		
		profession = new JTextField();
		profession.setColumns(10);
		profession.setBounds(242, 193, 254, 32);
		contentPane.add(profession);
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblProfession.setBounds(76, 202, 156, 22);
		contentPane.add(lblProfession);
	
	}

}
