package auction.rabindra.rmiinterface;

import java.io.Serializable;
//implementing tagged interface to fetch object through parameter
public class Question implements Serializable{
	private static final long serialVersionUID = 0L; 
    private int [] answerFrequency;
    private String question; 
    private String[] possibleAnswers;
    
    
    public Question(String question,String[] possibleAnswers){
	super();
	this.question = question;
        this.possibleAnswers = possibleAnswers;
        answerFrequency = new int[this.possibleAnswers.length];
    }
  //creating getter setter methods
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public int[] getAnswerFrequency() {
        return answerFrequency;
    }

    public void setAnswerFrequency(int[] answerFrequency) {
        this.answerFrequency = answerFrequency;
    }
    
    public void addFrequency(int i){
        answerFrequency[i]++;
    }

}
