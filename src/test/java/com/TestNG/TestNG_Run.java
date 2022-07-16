package com.TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.File.FileReaderManager;
import com.Sri_Project.Base_Class;

import sdet_Sri.PageObjectManager;

public class TestNG_Run extends Base_Class{
	public static WebDriver driver = getBrowser("edge");
	public static PageObjectManager pom = new PageObjectManager(driver);
    
	@Test
	public void browserlaunch() throws IOException {
		 
		getUrl(FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_url());
       
	}
	@Test
	public void login() throws IOException {
		
		inputText(pom.getInstanceLPage().getUsename(),FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Uname());
		inputText(pom.getInstanceLPage().getPassword(), FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Pass());

		clickButton(pom.getInstanceLPage().getLogin());

	}
	

}
