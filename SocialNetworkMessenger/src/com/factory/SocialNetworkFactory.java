package com.factory;


import java.util.List;

import com.RedSocial.Red;

public interface SocialNetworkFactory {

	public Red create(String c);

	public List<Red> crearInstancias(List<String> files);
	
}
