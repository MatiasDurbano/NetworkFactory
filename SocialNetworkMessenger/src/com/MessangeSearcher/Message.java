package com.MessangeSearcher;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Network.Network;

public class Message {

	private List<Network> redes;
	
	public Message(List<Network> redes) {
		this.redes = redes;
	}
	
	public void getMessages(PipedOutputStream pipedOutput) {
		
		for(Network red : this.redes) {
			red.get(pipedOutput);
		}
	
	}
	
	
}
