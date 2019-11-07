package com.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.RedSocial.Red;

public class SocialFactoryImpl implements SocialNetworkFactory{
	
	List<Red> redes;
	
	public SocialFactoryImpl() {
		redes= new ArrayList<Red>();
		ServiceLoader<Red> loader = ServiceLoader.load(Red.class);
        Iterable<Red> iterable = () -> loader.iterator();
        Stream<Red> stream = StreamSupport.stream(iterable.spliterator(), false);
        List<Class> locales = stream.map(i -> i.getClass()).collect(Collectors.toList());
        for(Class local: locales) {
        	try {
        	
        	Class<?>  clz = Class.forName(local.getName());
        	Class<? extends Red> sub = clz.asSubclass(Red.class);
        	/* Get the default constructor. */
        	Constructor<? extends Red> ctor = sub.getConstructor();
        	/* Create an instance of "MyCustomAction". */
        	Red custom = ctor.newInstance();
        	//System.out.println(custom.getClass().getName());
        	redes.add(custom);
        	}catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
    				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
	}
	
	public Red create(String c) {
		for(Red red: redes) {
			if(red.getClass().getName().equals(c)) {
				return red;
			}
		}
		return null;
	}

	@Override
	public List<Red> crearInstancias(List<String> files) {
		List<Red> ret = new ArrayList<Red>();
		for(String file: files) {
			ret.add(create(file));
		}
		return ret;
	}

}
