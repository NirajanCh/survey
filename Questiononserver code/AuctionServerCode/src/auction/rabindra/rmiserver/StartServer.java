package auction.rabindra.rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import auction.rabindra.rmiinterface.RemoteInterface;


public class StartServer {
	public static void main(String[] args) {
        
		System.out.println("Server has started now.");
		// Start RMI registry service and bind 
	            try {
	            	// Instantiating the implementation class
	        RemoteInterface rmi = new RemoteQuestions();
	        
	     // Binding the remote object (rmi) in the registry
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("QuestionService1819",rmi);

			System.out.println("Service started.");
			} catch (RemoteException e) {
	                    System.out.println("An error occured: "+e.toString()); 
	                    e.printStackTrace();
			} 
		}

}
