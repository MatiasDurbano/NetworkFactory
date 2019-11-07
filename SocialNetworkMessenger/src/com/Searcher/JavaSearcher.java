package com.Searcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.Searcher.Properties.PropertiesLoader;


public class JavaSearcher {
	PropertiesLoader fileSearch;
	List<String> files;
	
	
	public JavaSearcher() {
		fileSearch=new PropertiesLoader();
		files= this.listFiles(fileSearch.getDataConfig().getPath());
	}
	
	public List<String> getFiles(){
		return files;
	}
	
	private  List<String>listFiles(String directoryName){
		 File directory = new File(directoryName);
		 File[] fList = directory.listFiles();
		 List<String> matches = new ArrayList<String>();
	    	for (File file : fList){
	            if (file.isFile()){
	            	if(file.getName().contains(fileSearch.getDataConfig().getArchivo())) {
	            	String ret= this.recortar(file.getAbsolutePath());
	            	matches.add(ret);
	            	}
	            } else if (file.isDirectory()){
	                List<String> recursiva=listFiles(file.getAbsolutePath());
	                for(String archivo: recursiva) {
	                	matches.add(archivo);
	                }
	            }
	        }
	    return matches;	
	 }
	
	private String recortar (String arg) {
		String ret="";
		for(int i=0 ;i< arg.length();i++) {
			if(arg.substring(i, i+3).equals("com")){
				ret = arg.substring(i, arg.length()-5);
				ret=ret.replace("\\", ".");
				return ret;
			}
		}
		return ret;
	}
}
