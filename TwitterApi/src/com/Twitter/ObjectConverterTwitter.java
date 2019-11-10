package com.Twitter;

import java.util.ArrayList;
import java.util.List;

import com.Network2.ObjectConverter;

import twitter4j.Status;

public class ObjectConverterTwitter implements ObjectConverter{

	@Override
	public List<String> getMessageObject(Object arg) {
		List<Status> list= (List<Status>) arg;
		List<String> ret = new ArrayList<String>();
		
		for(Status status: list) {
			ret.add(status.getText());
		}
		return ret;
		
	}

}
