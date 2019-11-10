package com.factory;


import java.util.List;

import com.Network.Network;

public interface SocialNetworkFactory {

	public Network create(String c);

	public List<Network> crearInstancias(List<String> files);
	
}
