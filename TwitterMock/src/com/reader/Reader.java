package com.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	private FileReader f;
	private BufferedReader b;
	
	public Reader() {
		try {
			f = new FileReader("D:\\programacion\\eclipse-workspace\\PRUEBAPP2\\TwitterMock\\archivo.txt");
		
			b = new BufferedReader(f);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> getMessages() throws IOException {
		List<String> ret = new ArrayList<String>();
        String cadena;
      
        do {
        	cadena = b.readLine();
        	if(cadena!=null) {
        		ret.add(cadena);
        	}
        }while(cadena!=null);
       
        b.close();
        return ret;
		 
	}
}
