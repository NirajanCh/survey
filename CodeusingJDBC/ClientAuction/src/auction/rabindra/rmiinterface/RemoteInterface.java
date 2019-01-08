package auction.rabindra.rmiinterface;


import java.rmi.Remote; 

import java.util.*;
//Creating Remote interface for our application 
public interface RemoteInterface extends Remote {
	public List<QuestionClass> getQuestions() throws Exception;


}
