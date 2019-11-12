package com.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.Network.Network;

public class SocialFactory{
	
	private List<Network> networks;
	
	public SocialFactory() {
		networks= new ArrayList<Network>();
		ServiceLoader<Network> loader = ServiceLoader.load(Network.class);
        Iterable<Network> iterable = () -> loader.iterator();
        Stream<Network> stream = StreamSupport.stream(iterable.spliterator(), false);
        List<Class> locales = stream.map(i -> i.getClass()).collect(Collectors.toList());
        for(Class local: locales) {
        	try {
        	
        	Class<?>  clz = Class.forName(local.getName());
        	Class<? extends Network> sub = clz.asSubclass(Network.class);
        	/* Get the default constructor. */
        	Constructor<? extends Network> ctor = sub.getConstructor();
        	/* Create an instance of "MyCustomAction". */
        	Network custom = ctor.newInstance();
        	//System.out.println(custom.getClass().getName());
        	networks.add(custom);
        	}catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
    				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
	}
	
	private Network create(String arg) {
		for(Network red: this.networks) {
			if(red.getClass().getName().equals(arg)) {
				return red;
			}
		}
		return null;
	}

	public List<Network> createInstances(List<String> files) {
		List<Network> ret = new ArrayList<Network>();
		for(String file: files) {
			ret.add(create(file));
		}
		return ret;
	}

}
