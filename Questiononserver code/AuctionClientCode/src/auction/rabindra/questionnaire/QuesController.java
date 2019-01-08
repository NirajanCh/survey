package auction.rabindra.questionnaire;

import java.io.Serializable;
import java.rmi.Naming;

import auction.rabindra.rmiinterface.Question;
import auction.rabindra.rmiinterface.RemoteInterface;

public class QuesController implements Serializable{
	private static final long serialVersionUID = 411121017680537995L;
	RemoteInterface remotequestionsint;
    
    public QuesController() {
        super();
        try {
        	// Looking up the registry for the remote object
        	remotequestionsint = (RemoteInterface) Naming.lookup("rmi://localhost/QuestionService1819");
        } catch (Exception e) {
            System.out.println("A problem occured: "+e.toString());
            e.printStackTrace();
            System.out.println("server is running?");
        }
    }
    
    public int getNumberOfQuestion(){
        try {
            return remotequestionsint.getNumberOfQuestions();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public String getQuestion(int i){
        try {
            return remotequestionsint.getQuestion(i);
        } catch (Exception e) {
            e.printStackTrace();
            return "connection lost";
        }
    }
    
    public String[] getPossibleAnswers(int i){
       try {
            return remotequestionsint.getPossibleAnswers(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
    
    public void setAswerFrequency(int i, int j){
        try {
        	remotequestionsint.setAnswerFrequecy(i, j);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public Question getQuestionObject(int i){
        try {
          return remotequestionsint.getQuestionObject(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }

}
