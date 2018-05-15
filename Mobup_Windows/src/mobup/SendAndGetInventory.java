package mobup;

import java.io.*;
import java.net.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mobup.controller.InventoryController;;

public class SendAndGetInventory extends Thread {
	
	private String Address = null;
    private int Port = 0;

	public SendAndGetInventory(String name, String address, int port) {
		super(name);
		this.Address = address;
		this.Port = port;
	}
	
	public void run() {
		 // declaration section:
	    // clientSocket: our client socket
	    // os: output stream
	    // is: input stream

	        Socket clientSocket = null; 
	        DataOutputStream os = null;
	        BufferedReader is = null;
	        ObservableList<Items> items = FXCollections.observableArrayList();

	    // Initialization section:
	    // Try to open a socket on the given port
	    // Try to open input and output streams

	        try {
	            clientSocket = new Socket(this.Address, this.Port);
	            os = new DataOutputStream(clientSocket.getOutputStream());
	            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	        } catch (UnknownHostException e) {
	            System.err.println("Don't know about host: " + this.Address);
	        } catch (IOException e) {
	            System.err.println("Couldn't get I/O for the connection to: " + this.Address);
	        }

	    // If everything has been initialized then we want to write some data
	    // to the socket we have opened a connection to on the given port

	    if (clientSocket == null || os == null || is == null) {
	        System.err.println( "Something is wrong. One variable is null." );
	        return;
	    }

	    try {
	        while ( true ) {
	        	//System.out.print( "" );
	        	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        	//String keyboardInput = br.readLine();
	        	os.writeBytes("__inventory");
	        	String data = "";
	        	while (is.ready()) {
	        		data += (char)is.read();
	        	}

	        	if (data == "Stop") {
	        		break;
	        	}
	        	
	        	try {
	        		items.clear();
					JSONArray inv_array = new JSONArray(data);
					
					JSONObject oneObject;
					for (int i=0; i < inv_array.length(); i++) {
						oneObject = new JSONObject(inv_array.getString(i));
						items.add(new Items(oneObject.getInt("id"), oneObject.getString("name"), oneObject.getInt("number"), oneObject.getString("desc")));
					}
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	
	        	InventoryController.updateItemsTab(items);
	        //System.out.println(responseLine);
	        }

	        // clean up:
	        // close the output stream
	        // close the input stream
	        // close the socket

	        os.close();
	        is.close();
	        clientSocket.close();   
	    } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	    } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	    }
		
	}

}
