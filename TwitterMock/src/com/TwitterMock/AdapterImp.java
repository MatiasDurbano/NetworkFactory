package com.TwitterMock;

import java.util.ArrayList;
import java.util.List;

import com.Network.Adapter;

public class AdapterImp implements Adapter{

	@Override
	public List<String> getMessageObject(Object arg) {
		List<TwitterMockObject> twitterObjs = (List<TwitterMockObject>) arg;
		List<String> messages = new ArrayList<String>();
		for(TwitterMockObject twitterObj : twitterObjs) {
			messages.add(twitterObj.getMessage());
		}
		return messages;
	}

}
