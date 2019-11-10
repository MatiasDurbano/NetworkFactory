package com.TwitterMock;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Network.Adapter;
import com.Network.Network;
import com.reader.Reader;

public class TwitterMockNetworkImpl implements Network {
	
	@Override
	public void get(PipedOutputStream pip) {
		try {	
			
			Reader reader = new Reader();
			Adapter adapter = new AdapterImp();
			
			for(String str : adapter.getMessageObject(reader.getMessages())) {
				pip.write(str.getBytes());
			}
			
		
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	    
	}

}
