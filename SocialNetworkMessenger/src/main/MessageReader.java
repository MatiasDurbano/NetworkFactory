package main;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.List;

public class MessageReader {

	
	public MessageReader() {}
	
	public List<String> getMessages(PipedInputStream pipedInput) throws IOException{
		
		List<String> ret = new ArrayList<String>();
		System.out.println(new String(pipedInput.readAllBytes()));
		return ret;
		
	}
}
