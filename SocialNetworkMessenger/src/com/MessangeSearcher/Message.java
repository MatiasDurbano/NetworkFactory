package com.MessangeSearcher;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Network.Network;

public class Message {

	private List<Network> networks;
	
	public Message(List<Network> redes) {
		this.networks = redes;
	}
	
	public void getMessages(PipedOutputStream pipedOutput) {
		
		for(Network red : this.networks) {
			red.get(pipedOutput);
		}
	
	}
	
	
}
