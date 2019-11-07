package main;

import java.io.IOException;
import java.util.List;

import com.MessangeSearcher.MessengerFactory;
import com.initializer.Initializer;

public class App {

	public static void main(String[] args) throws IOException {
		
		MessengerFactory mController= new MessengerFactory(Initializer.getInitialize());
	    List<String> mensajes= mController.searchMessage();
	    System.out.println("MENSAJES : "+mensajes.size());
	    
	}

}
