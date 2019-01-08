package auction.rabindra.rmiserver;

import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry; 
//import java.rmi.RemoteException; 


import auction.rabindra.rmiinterface.RemoteInterface; 

public class StartServer {
	   public static void main(String args[]) { 
	      try { 
	    	// Instantiating the implementation class 
	          QuestionsList obj = new QuestionsList(); 
	     
	          // Exporting the object of implementation class here we are exporting the remote object to the stub) 
	          RemoteInterface rmi = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);  
	          

  
	         // Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.createRegistry(1099); 
	         registry.rebind("QuestionService1819", rmi);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	   } 
}
