package Pojo_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpg {
	public static WebDriver driver; //null driver
	@FindBy(id="username")
	private WebElement usename;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

	public loginpg(WebDriver driver) {//parameterized constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
		
	}



	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}

	


}
