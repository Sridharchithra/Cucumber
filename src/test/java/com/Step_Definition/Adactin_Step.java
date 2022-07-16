package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.File.FileReaderManager;
import com.Runner.Runner_File;
import com.Sri_Project.Base_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sdet_Sri.PageObjectManager;

public class Adactin_Step extends Base_Class {

	public static WebDriver driver = Runner_File.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
    
	@Given("user is  launch the  application")
	public void user_is_launch_the_application() throws IOException {

		getUrl(FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_url());
	}

//	@When("user is enter the username")
//	public void user_is_enter_the_username() throws IOException {
//		inputText(pom.getInstanceLPage().getUsename(),
//				FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Uname());
//
//	}
//
//	@And("user is enter the password")
//	public void user_is_enter_the_password() throws IOException {
//		inputText(pom.getInstanceLPage().getPassword(),
//				FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Pass());
//	}
	@When("user is enter the user {string}")
	public void user_is_enter_the_user(String string) {
		inputText(pom.getInstanceLPage().getUsename(),string);
	}
	@And("user is enter the pass {string}")
	public void user_is_enter_the_pass(String string) {
		inputText(pom.getInstanceLPage().getPassword(),string);
	}

	@Then("user is enter the submit Button")
	public void user_is_enter_the_submit_button() {
		clickButton(pom.getInstanceLPage().getLogin());
	}

	@When("hotel area")
	public void hotel_area() {
		dropdown(pom.getInstanceSearch().getLoca(), "visibletext", "Paris");
		
	}
	@When("hotel room")
	public void hotel_room() {
		dropdown(pom.getInstanceSearch().getHotel(), "byvalue", "Hotel Sunshine");
		dropdown(pom.getInstanceSearch().getRoom(), "byindex", "2");
		implicitwait(10);
		gettext(pom.getInstanceSearch().getText1());
		

	}


}
