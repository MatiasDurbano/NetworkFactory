package com.MessangeSearcher;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

import com.RedSocial.Red;

public class Messenger {
	
	private PipedInputStream  pipedInput;
	private PipedOutputStream pipedOutput;
	private Message message;
	
	public Messenger(List<Red> redes) {

		try {
			message = new Message(redes);
			
			this.pipedInput = new PipedInputStream();
			this.pipedOutput = new PipedOutputStream();
			
			this.pipedInput.connect(this.pipedOutput);
			
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public Messenger(List<Red> redes, PipedOutputStream pipedOutput) {

		try {
			
			message = new Message(redes);
			
			this.pipedInput = new PipedInputStream();
			this.pipedOutput = pipedOutput;
			
			this.pipedInput.connect(this.pipedOutput);
			
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public PipedInputStream getMessage() throws IOException {
		
		message.getMessages(this.pipedOutput);	
		
		this.pipedOutput.close();
		
		return this.pipedInput;
	
	}
	
}
