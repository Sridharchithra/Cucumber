package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Sri_Project.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\login.feature",
               glue="com.Step_Definition",
             //  tags="@smoketest or @smoke_run or @smoke"
               monochrome = true,
              dryRun = false,
               strict = true,
               publish = true,
               plugin = {"html:Reportcucu/htmlreport.html",
            		   "pretty",
            		   "json:Reportcucu/jsonreport.json.html"            		 }
	  
		)


public class Runner_File {
	public static WebDriver driver; //null driver
	@BeforeClass
	public static void setup() {
		driver=Base_Class.getBrowser("chrome");

	}
	@AfterClass
	public static void teardown() {
		driver.close();

	}
	
	
	
	
}
