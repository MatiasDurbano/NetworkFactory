package com.MessangeSearcher;

import java.io.IOException;
import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.List;

import com.Network.Network;

public class MessengerFactory {
	
	
	private Messenger messeger;

	
	
	public MessengerFactory(List<Network> redes) {
		messeger = new Messenger(redes);
			
	}
	
	public PipedInputStream searchMessage() throws IOException {
		
		return this.messeger.getMessage();	
	
	}
	
}
