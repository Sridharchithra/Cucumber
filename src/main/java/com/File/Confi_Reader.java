package com.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Confi_Reader {
       public static Properties p;
	
	 public Confi_Reader() throws IOException {
		File f=new File("C:\\Users\\avita\\eclipse-workspace\\Project_sri_july\\src\\main\\java\\com\\File\\Confi.Properties");
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		p.load(fis);
		
	}
	
	public String get_url() {
	      String url= p.getProperty("url");
          return url;
	}
	
	      public String get_Uname() {
			String uname = p.getProperty("username");
			return uname;

		}
	
	
	public String get_Pass() {
		String pass = p.getProperty("password");
        return pass;
	}
}
