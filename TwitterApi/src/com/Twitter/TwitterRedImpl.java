package com.Twitter;
import java.util.List;

import com.Network2.ObjectConverter;
import com.Network2.Red;
import com.propertiesTwitter.PropertiesLoaderTwitter;



public class TwitterRedImpl implements Red {
	
	TwitterApi twitter;
	ObjectConverter objectReceiver;
	
	public TwitterRedImpl(){
		twitter = new TwitterApi(new TwitterConfiguration(new PropertiesLoaderTwitter()));
	}


	@Override
	public List<String> get() {
		objectReceiver= new ObjectConverterTwitter();
		return objectReceiver.getMessageObject(twitter.obtenerTwitters());
	
	}

}
