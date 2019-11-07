package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public interface PropertiesFileSearch {
	
	public FileReader getFileAddress() throws FileNotFoundException;
	
	public void setAddress(String arg0);
}
