package auction.rabindra.gui;


import java.util.*;
import java.rmi.Naming;


import auction.rabindra.rmiinterface.QuestionClass;
import auction.rabindra.rmiinterface.RemoteInterface;  

public class Client {  
   private Client() {}  

public static void main(String[] args)throws Exception {  
	 
      try { 

          
          // Looking up the registry for the remote object 
    	  RemoteInterface remotequestionsint = (RemoteInterface) Naming.lookup("QuestionService1819");

         // Calling the remote method using the obtained object 
         List<QuestionClass> list = (List<QuestionClass>)remotequestionsint.getQuestions(); 
         for (QuestionClass qc:list)  { 
            
 
           System.out.println(qc.getQuestion_id()+ " " + qc.getQuestion());
           System.out.println(qc.getQuestion_option());
        


         }  
//       System.out.println(list); 
      } catch (Exception e) { 
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 

      } 
   } 
}