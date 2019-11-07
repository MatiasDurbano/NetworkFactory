package com.TwitterMock;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.RedSocial.Red;
import com.reader.Reader;

public class TwitterMockRedImpl implements Red {

	@Override
	public List<String> get() {
		List<String> ret = new ArrayList<String>();
		try {	
			
			Reader reader = new Reader();
			for(String str :reader.getMessages()) {
				ret.add(str);
			}
			
		
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return ret;
	    
	}

}
