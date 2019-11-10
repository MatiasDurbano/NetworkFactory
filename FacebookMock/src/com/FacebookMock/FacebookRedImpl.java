package com.FacebookMock;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.Network.Adapter;
import com.Network.Network;

public class FacebookRedImpl implements Network{

	public FacebookRedImpl() {}
	
	@Override
	public void get(PipedOutputStream pip) {
		String a= "el pan dulce tenia pasas de uva \n";
		String b= "la ensalada de fruta estaba buena \n";
		List<FacebookMockObject> facebookObjs= new ArrayList<FacebookMockObject>();
		facebookObjs.add(new FacebookMockObject(a));
		facebookObjs.add(new FacebookMockObject(b));
		
		Adapter adapter = new AdapterImpl();
		for(String str : adapter.getMessageObject(facebookObjs)) {
			try {
				pip.write(str.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
