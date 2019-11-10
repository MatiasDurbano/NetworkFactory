package com.FacebookMock;

import java.util.ArrayList;
import java.util.List;

import com.Network.Adapter;

public class AdapterImpl implements Adapter {

	@Override
	public List<String> getMessageObject(Object arg) {
		List<FacebookMockObject> facebookObjs = (List<FacebookMockObject>) arg;
		List<String> messages = new ArrayList<String>();
		for(FacebookMockObject facebookObj : facebookObjs) {
			messages.add(facebookObj.getMessage());
		}
		return messages;
	}
	

}
