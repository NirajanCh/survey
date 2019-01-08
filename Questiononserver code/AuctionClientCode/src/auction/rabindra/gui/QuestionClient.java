package auction.rabindra.gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import auction.rabindra.questionnaire.QuesController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
//import javax.swing.UIManager;
//import java.awt.SystemColor;
//inherit properties of JFrame to class QuestionClient
public class QuestionClient extends JFrame {

	private JPanel contentPane;


	private static final long serialVersionUID = 0L;

	QuesController controller = new QuesController();
	int count = 0;

	/**
	 * Create the frame.
	 */
	public QuestionClient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\Screenshot_1.png"));
		setTitle("Survey for Online Auction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 723, 628);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel question1 = new JLabel("Yes");
		question1.setForeground(new Color(139, 0, 0));
		question1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1.setBounds(35, 27, 545, 21);
		question1.setText(controller.getQuestion(0));
		contentPane.add(question1);
		
		JButton answer1 = new JButton("Yes");
		answer1.setBackground(Color.PINK);
		answer1.setForeground(new Color(178, 34, 34));
		answer1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer1.setBounds(50, 67, 85, 21);
		answer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[]option1=controller.getPossibleAnswers(0);
				answer1.setText(option1[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		contentPane.add(answer1);
		
		JButton answer2 = new JButton("No");
		answer2.setForeground(new Color(139, 0, 0));
		answer2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer2.addActionListener(new ActionListener() {
			String[]option1=controller.getPossibleAnswers(0);
			public void actionPerformed(ActionEvent e) {
				answer2.setText(option1[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer2.setBounds(200, 67, 85, 21);
		contentPane.add(answer2);
		
		JLabel question2 = new JLabel("");
		question2.setForeground(new Color(139, 0, 0));
		question2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question2.setBounds(35, 98, 545, 23);
		question2.setText(controller.getQuestion(1));
		contentPane.add(question2);
		
		JButton answer3 = new JButton("Daily");
		answer3.setForeground(new Color(139, 0, 0));
		answer3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer3.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(1);
			public void actionPerformed(ActionEvent e) {
				answer3.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer3.setBounds(50, 131, 85, 21);
		contentPane.add(answer3);
		
		JButton answer4 = new JButton("Monthly");
		answer4.setForeground(new Color(139, 0, 0));
		answer4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer4.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(1);
			public void actionPerformed(ActionEvent e) {
				answer4.setText(option2[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer4.setBounds(200, 131, 85, 21);
		contentPane.add(answer4);
		
		JLabel question3 = new JLabel("connection lost");
		question3.setForeground(new Color(139, 0, 0));
		question3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question3.setBounds(35, 182, 396, 13);
		question3.setText(controller.getQuestion(2));
		contentPane.add(question3);
		
		JButton answer5 = new JButton("Desktop");
		answer5.setForeground(new Color(139, 0, 0));
		answer5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer5.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(2);
			public void actionPerformed(ActionEvent e) {
				answer5.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer5.setBounds(50, 218, 85, 21);
		contentPane.add(answer5);
		
		JButton answer6 = new JButton("Web");
		answer6.setForeground(new Color(139, 0, 0));
		answer6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer6.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(2);
			public void actionPerformed(ActionEvent e) {
				answer6.setText(option2[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer6.setBounds(200, 218, 85, 21);
		contentPane.add(answer6);
		
		JLabel question4 = new JLabel("connection lost");
		question4.setForeground(new Color(139, 0, 0));
		question4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question4.setBounds(35, 266, 349, 13);
		question4.setText(controller.getQuestion(3));
		String[]option2=controller.getPossibleAnswers(3);
		contentPane.add(question4);
		
		JButton answer7 = new JButton("Yes");
		answer7.setForeground(new Color(139, 0, 0));
		answer7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				answer7.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer7.setBounds(50, 289, 85, 21);
		contentPane.add(answer7);
		
		JButton answer8 = new JButton("Maybe");
		answer8.setForeground(new Color(139, 0, 0));
		answer8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer8.setText(option2[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			
			}
		});
		answer8.setBounds(200, 289, 85, 21);
		contentPane.add(answer8);
		
		JLabel question5 = new JLabel("connection lost");
		question5.setForeground(new Color(139, 0, 0));
		question5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question5.setBounds(35, 334, 480, 13);
		question5.setText(controller.getQuestion(4));
		contentPane.add(question5);
		
		JButton answer9 = new JButton("Seperate auction email");
		answer9.setForeground(new Color(139, 0, 0));
		answer9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer9.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(4);
			public void actionPerformed(ActionEvent e) {
				answer9.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			
			}
		});
		answer9.setBounds(50, 359, 201, 21);
		contentPane.add(answer9);
		
		JButton answer10 = new JButton("Push notification");
		answer10.setForeground(new Color(139, 0, 0));
		answer10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer10.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(4);
			public void actionPerformed(ActionEvent e) {
				answer9.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer10.setBounds(261, 357, 170, 23);
		contentPane.add(answer10);
		
		JLabel question6 = new JLabel("connection lost");
		question6.setForeground(new Color(139, 0, 0));
		question6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question6.setBounds(35, 402, 444, 13);
		question6.setText(controller.getQuestion(5));
		contentPane.add(question6);
		
		JButton answer11 = new JButton("Yes");
		answer11.setForeground(new Color(139, 0, 0));
		answer11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer11.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(5);
			public void actionPerformed(ActionEvent e) {
				answer11.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer11.setBounds(50, 425, 85, 21);
		contentPane.add(answer11);
		
		JButton answer12 = new JButton("No");
		answer12.setForeground(new Color(139, 0, 0));
		answer12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer12.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(5);
			public void actionPerformed(ActionEvent e) {
				answer12.setText(option2[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer12.setBounds(200, 425, 85, 21);
		contentPane.add(answer12);
		
		JLabel question7 = new JLabel("connection lost");
		question7.setForeground(new Color(139, 0, 0));
		question7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question7.setBounds(35, 456, 463, 21);
		question7.setText(controller.getQuestion(6));
		contentPane.add(question7);
		
		JButton answer13 = new JButton("Cash");
		answer13.setForeground(new Color(139, 0, 0));
		answer13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer13.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(6);
			public void actionPerformed(ActionEvent e) {
				answer13.setText(option2[0]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer13.setBounds(50, 502, 85, 21);
		contentPane.add(answer13);
		
		JButton answer14 = new JButton("Debit Card");
		answer14.setForeground(new Color(139, 0, 0));
		answer14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answer14.addActionListener(new ActionListener() {
			String[]option2=controller.getPossibleAnswers(6);
			public void actionPerformed(ActionEvent e) {
				answer14.setText(option2[1]);
				controller.setAswerFrequency(0, 0);
		        System.err.println(controller.getQuestionObject(0).getAnswerFrequency().length);
		        int[] i = controller.getQuestionObject(0).getAnswerFrequency();
		        System.err.println(i[0]);
		        System.err.println(i[1]);
			}
		});
		answer14.setBounds(200, 502, 114, 21);
		contentPane.add(answer14);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\submit.png"));
		btnOk.setForeground(new Color(255, 0, 0));
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Successfully Submitted. Thank you for your time.");
				JOptionPane.showMessageDialog(null, "Successfully Submitted. Thank you for your time.");
				dispose();
			}
		});
		btnOk.setBounds(446, 533, 148, 46);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rabindra Ghatuwal\\Desktop\\CIS\\auction-gavel-public-sale_2227-177.jpg"));
		lblNewLabel.setBounds(370, 72, 328, 238);
		contentPane.add(lblNewLabel);
	}
}
