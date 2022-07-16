package com.Sri_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver = null;

	// browser launch
	public static WebDriver getBrowser(String browser) {

		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	// click
	public static void clickButton(WebElement element) {
		element.click();

	}

	// geturl
	public static void getUrl(String url) {
		driver.get(url);

	}

	// sendkeys
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);

	}

	// close
	public static void close() {

		driver.close();
	}

	// dropdown
	public static void dropdown(WebElement element, String type, String value) {

		Select a = new Select(element);

		if (type.equalsIgnoreCase("byvalue")) {
			a.selectByValue(value);
		} else if (type.equalsIgnoreCase("visibletext")) {
			a.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);// string convert to integer
			a.selectByIndex(index);
		}

	}
	// get text
		public static void gettext(WebElement element) {
			String text = element.getText();
			System.out.println("get text is :"+text);
		}
		//wait
		public static void implicitwait(int time) {
		  driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);

		}

	
	//takescreenshot
	public static void screenshot(String path) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileUtils.copyFile(source, destination);
		

	}
	
	
	
	
	
	
	

}
