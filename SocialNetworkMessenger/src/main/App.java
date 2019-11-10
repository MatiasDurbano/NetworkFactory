package main;

import java.io.IOException;
import java.util.List;

import com.MessangeSearcher.MessengerFactory;
import com.initializer.Initializer;

public class App {

	public static void main(String[] args) throws IOException {
		
		MessengerFactory mController= new MessengerFactory(Initializer.getInitialize());
		MessageReader reader = new MessageReader();
		
		List<String> msgs = reader.getMessages(mController.searchMessage());
		for (String msg : msgs) {
			System.out.println(msg);
		}
	    
	    
	}

}
