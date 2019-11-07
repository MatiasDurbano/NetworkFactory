package com.MessangeSearcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.RedSocial.Red;

public class MessengerFactory {
	
	
	private Messenger messeger;
	private MessageReader readerMessage;
	
	
	public MessengerFactory(List<Red> redes) {
		messeger = new Messenger(redes);
		readerMessage = new MessageReader();
			
	}
	
	public List<String> searchMessage() {
		
		try {
		
			return this.readerMessage.getMessages(this.messeger.getMessage());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<String>();
		
	}
	
}
