package com.Searcher.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.properties.PropertiesFileSearch;



public class AbsolutFileSearch implements PropertiesFileSearch {
	
	private String ruta = "D:\\programacion\\eclipse-workspace\\SocialNetworkMessenger\\src\\com\\Searcher\\Properties\\archivo.properties";
	 
	public AbsolutFileSearch() {
	}			
	
	public FileReader getFileAddress() throws FileNotFoundException	{
		System.out.println(ruta);
		FileReader ret = new FileReader(ruta);
		return ret;
	}	
	public void setAddress(String nuevaRuta) {
		this.ruta = nuevaRuta;
	}

}
