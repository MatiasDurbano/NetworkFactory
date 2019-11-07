package com.MessangeSearcher;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.RedSocial.Red;

public class Message {

	private List<Red> redes;
	
	public Message(List<Red> redes) {
		this.redes = redes;
	}
	
	public void getMessages(PipedOutputStream pipedOutput) {
		
		for(Red red : this.redes) {
			this.saveMessage(pipedOutput, red.get());
		}
	
	}
	
	private void saveMessage(PipedOutputStream pipedOutput, List<String> messages) {
		try {
		
			for(String message : messages) {
				pipedOutput.write(message.getBytes());
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
