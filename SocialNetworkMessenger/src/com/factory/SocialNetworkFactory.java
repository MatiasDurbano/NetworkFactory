package com.factory;


import java.util.List;

import com.RedSocial.Network;

public interface SocialNetworkFactory {

	public Network create(String c);

	public List<Network> crearInstancias(List<String> files);
	
}
