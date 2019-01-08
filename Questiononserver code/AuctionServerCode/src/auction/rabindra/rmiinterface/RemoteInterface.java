package auction.rabindra.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Creating Remote interface for our application 
public interface RemoteInterface extends Remote{
    //declaring interface method
    public int getNumberOfQuestions() throws RemoteException;
    
    public String getQuestion(int i) throws RemoteException;
    
    public void setAnswerFrequecy(int i, int j) throws RemoteException;

    public String[] getPossibleAnswers(int i) throws RemoteException;
    
    public Question getQuestionObject(int i) throws RemoteException;
}
