package com.initializer;

import java.io.IOException;
import java.util.List;

import com.MessangeSearcher.MessengerFactory;
import com.Network.Network;
import com.Searcher.JavaSearcher;
import com.factory.SocialFactory;


public class Initializer {
	 
	 //private MessangeController messageController;
	 
     private Initializer() {
    	throw new RuntimeException("Do not try to instantiate this");
     }
     
     public static List<Network> getInitialize() throws IOException {
    	 JavaSearcher searcher = new JavaSearcher();
    	 SocialFactory socialFactory= new SocialFactory();
    	 List<Network> redes = socialFactory.createInstances(searcher.getFiles());
    	 return redes;
    	 
     }
     
     
	
	
}
