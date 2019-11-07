package com.Searcher.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.properties.PropertiesFileSearch;

public class PropertiesLoader {
	private PropertiesFileSearch fileSercher;
	private Properties properties;
	private DataConfig data;
	
	public PropertiesLoader() {
		
		this.fileSercher = new AbsolutFileSearch();
		this.properties = new Properties();
		this.data = new DataConfig();
		this.readProperties();
	}
	
	public void readProperties() {
		try {
			FileReader file = fileSercher.getFileAddress();
			properties.load(file);			
			this.readPath();
			this.readArchivo();
			}
		catch (IOException e) {
			System.out.println("no se puede leer el archivo properties");
		}
	}
	
	public void readPath() {
		String path = properties.getProperty("path");
		if(path == null) 	
			System.out.println("Directorio no definido");				
		data.setPath(path);
		
	}
	
	public void readArchivo() {
		String archivo = properties.getProperty("archivo");
		if(archivo == null) 	
			System.out.println("archivo no definido");				
		data.setArchivo(archivo);;
		
	}

	
	 
	public DataConfig getDataConfig() {
		return data;
	}
	
	public void setAdress(String arg0) {
		fileSercher.setAddress(arg0);
		readProperties();
	}
	
}
