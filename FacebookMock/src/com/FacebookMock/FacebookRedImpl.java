package com.FacebookMock;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.RedSocial.Red;

public class FacebookRedImpl implements Red{

	public FacebookRedImpl() {}
	
	@Override
	public List<String> get() {
		List<String> ret = new ArrayList<String>();
		String a= "el pan dulce tenia pasas de uva \n";
		String b= "la ensalada de fruta estaba buena \n";
		ret.add(a);
		ret.add(b);
		return ret;
	}

}
