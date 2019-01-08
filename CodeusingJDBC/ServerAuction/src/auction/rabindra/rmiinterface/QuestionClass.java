package auction.rabindra.rmiinterface;

import java.io.Serializable;


public class QuestionClass implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int question_id,option_id;   
	   private String question, question_option;    
	  
	   public int getQuestion_id() { 
	      return question_id; 
	   } 
	   public String getQuestion() { 
	      return question; 
	   }   
	   public void setQuestion_id(int question_id) { 
		      this.question_id = question_id; 
	   } 
	   public void setQuestion(String question) { 
	      this.question = question; 
	   } 
		public int getOption_id() {
			return option_id;
		}
		public String getQuestion_option() {
			return question_option;
		}
		public void setOption_id(int option_id) {
			this.option_id = option_id;
		}
		public void setQuestion_option(String question_option) {
			this.question_option = question_option;
		}
}
