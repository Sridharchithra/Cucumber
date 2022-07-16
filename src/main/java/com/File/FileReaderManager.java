package com.File;

import java.io.IOException;

public class FileReaderManager {
	//psdp
	//private
	private FileReaderManager() {
		
	}
	//static
	public static FileReaderManager getInstance_Frm() {
		FileReaderManager frm= new FileReaderManager();
		return frm;
		

	}
	//non static
	public Confi_Reader get_Insttance_Cr() throws IOException {
		Confi_Reader reader=new Confi_Reader();
		return reader;

	}
	
	

}
