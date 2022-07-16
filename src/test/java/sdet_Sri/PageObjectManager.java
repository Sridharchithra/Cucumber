package sdet_Sri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pojo_Class.Search_Hotel;
import Pojo_Class.loginpg;

public class PageObjectManager {
	public static WebDriver driver;
	private loginpg lpage;
	 private Search_Hotel search;
	 
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public loginpg getInstanceLPage() {
		 lpage=new loginpg(driver);
		return lpage;
	}
	public Search_Hotel getInstanceSearch() {
	 search=new Search_Hotel(driver);
		return search;
	}
	
	 

}
