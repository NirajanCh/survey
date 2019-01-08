package auction.rabindra.rmiserver;

import java.sql.*; 
import java.util.*;

import auction.rabindra.rmiinterface.QuestionClass;
import auction.rabindra.rmiinterface.RemoteInterface;


//Implementing the remote interface
public class QuestionsList implements RemoteInterface{
	public List<QuestionClass> getQuestions() throws Exception {  
	      List<QuestionClass> list = new ArrayList<QuestionClass>(); 
	      
	   // JDBC driver name and database URL 
	      String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
	      String DB_URL = "jdbc:mysql://localhost/db_question";  
	      
	      // Database credentials 
	      String USER = "root"; 
	      String PASS = "mysql"; 
	      
	      Connection conn = null; 
	      Statement stmt = null;  
	      
	      //Register JDBC driver 
	      Class.forName(JDBC_DRIVER);   
	      
	      
	      //Open a connection
	      System.out.println("Connecting to a selected database..."); 
	      conn = DriverManager.getConnection(DB_URL, USER, PASS); 
	      System.out.println("Connected database successfully...");  
	      
	      //Execute a query 
	      System.out.println("Creating statement..."); 
	      
	      stmt = conn.createStatement();  
	      String sql = "SELECT questions.question_id, questions.question, question_options.question_option from questions LEFT JOIN question_options ON questions.question_id = question_options.question_id"; 
	      ResultSet rs = stmt.executeQuery(sql);  
	      
	      //Extract data from result set 
	      while(rs.next()) { 
	         // Retrieve by column name 
	         int question_id  = rs.getInt("question_id"); 
	         
	         String question = rs.getString("question");
	         String question_option = rs.getString("question_option"); 
 
	         
	         // Setting the values 
	         QuestionClass qc = new QuestionClass(); 
	         qc.setQuestion_id(question_id); 
	         qc.setQuestion(question);
	         qc.setQuestion_option(question_option);

	         list.add(qc); 
	      } 
	      rs.close(); 
	      return list;     

	}
}
