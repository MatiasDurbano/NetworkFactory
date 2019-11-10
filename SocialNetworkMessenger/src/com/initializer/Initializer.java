package com.initializer;

import java.io.IOException;
import java.util.List;

import com.MessangeSearcher.MessengerFactory;
import com.Network.Network;
import com.Searcher.JavaSearcher;
import com.factory.SocialNetworkFactory;
import com.factory.SocialFactoryImpl;


public class Initializer {
	 
	 //private MessangeController messageController;
	 
     private Initializer() {
    	throw new RuntimeException("Do not try to instantiate this");
     }
     
     public static List<Network> getInitialize() throws IOException {
    	 JavaSearcher searcher = new JavaSearcher();
    	 SocialNetworkFactory socialFactory= new SocialFactoryImpl();
    	 List<Network> redes = socialFactory.crearInstancias(searcher.getFiles());
    	 return redes;
    	 
     }
     
     
	
	
}
