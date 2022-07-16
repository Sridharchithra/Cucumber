package sdet_Sri;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.File.FileReaderManager;
import com.Sri_Project.Base_Class;

import Pojo_Class.Search_Hotel;
import Pojo_Class.loginpg;

public class Adactin_Sri extends Base_Class {
	public static void main(String[] args) throws InterruptedException, IOException {

		getBrowser("chrome");
		getUrl(FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_url());
		PageObjectManager pom = new PageObjectManager(driver);
		inputText(pom.getInstanceLPage().getUsename(),FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Uname());
		inputText(pom.getInstanceLPage().getPassword(), FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Pass());

		clickButton(pom.getInstanceLPage().getLogin());
		dropdown(pom.getInstanceSearch().getLoca(), "visibletext", "Paris");
		dropdown(pom.getInstanceSearch().getHotel(),"byvalue","Hotel Sunshine");
		dropdown(pom.getInstanceSearch().getRoom(),"byindex","2");
		dropdown(pom.getInstanceSearch().getRoomnos(),"byindex","3");
		inputText(pom.getInstanceSearch().getCheckin(),"08/07/2022");
		inputText(pom.getInstanceSearch().getCheckout(),"12/07/2022");
		dropdown(pom.getInstanceSearch().getAdult(),"byindex","2");
		dropdown(pom.getInstanceSearch().getChildroom(),"byindex","1");
		clickButton(pom.getInstanceSearch().getSubmit());
		
		screenshot("C:\\Users\\avita\\eclipse-workspace\\Project_sri_july\\Driver\\hotel.png");

		//close();

	}

}
