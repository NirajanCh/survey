
package auction.rabindra.rmiserver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import auction.rabindra.rmiinterface.Question;
import auction.rabindra.rmiinterface.RemoteInterface;

import java.util.ArrayList;

//Implementing the remote interface 
public class RemoteQuestions extends UnicastRemoteObject implements RemoteInterface{

    private static final long serialVersionUID = 0L;
    
    List<Question>questions = new ArrayList<Question>();

    public RemoteQuestions() throws RemoteException{
        String[] answer1 = {"Yes","No"};
        String[] answer2 = {"Daily","Monthly"};
        String[] answer3 = {"Desktop","Web"};
        String[] answer4 = {"Yes","Maybe"};
        String[] answer5 = {"Seperate auction email","Push notification"};
        String[] answer6 = {"Yes","No"};
        String[] answer7 = {"Cash","Debit Card"};
        Question question1 = new Question("1. Have you ever participated in online aucton system before ?", answer1);
        questions.add(question1);
        Question question2 = new Question("2. How often would you take part in online auciton?", answer2);
        questions.add(question2);
        Question question3 = new Question("3. Which platform would you most access the auction on?", answer3);
        questions.add(question3);
        Question question4 = new Question("4. Are you satisfied with the online auction system?", answer4);
        questions.add(question4);
        Question question5 = new Question("5. How would you prefer to receive information about new products in auction?", answer5);
        questions.add(question5);
        Question question6 = new Question("6. Are you satisfied with he online auction system?", answer6);
        questions.add(question6);
        Question question7 = new Question("7. Which payment method do you prefer to buy after highest bid?", answer7);
        questions.add(question7);
        
    }
    // overriding the interface method 
    @Override
    public int getNumberOfQuestions() throws RemoteException {
	return questions.size();
    }
    
    @Override
    public String getQuestion(int i) throws RemoteException {
	return questions.get(i).getQuestion();
    }
    
    @Override
    public void setAnswerFrequecy(int i, int j){
        questions.get(i).addFrequency(j);
    }
    
    @Override
    public String[] getPossibleAnswers(int i){
        return questions.get(i).getPossibleAnswers();
    }
    
    @Override
    public Question getQuestionObject(int i){
        return questions.get(i);
    }
}
