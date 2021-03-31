package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.login_Page;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass {

	public static WebDriver driver = Runner.driver;
	
	login_Page lp = new login_Page(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User enter the \"([^\"]*)\" username in the text box$")
	public void user_enter_the_username_in_the_text_box(String arg1) throws Throwable {
		inputValueElement(lp.getUsername(), arg1);
		
	}

	@When("^User enter the \"([^\"]*)\" password in the text box$")
	public void user_enter_the_password_in_the_text_box(String arg1) throws Throwable {
		inputValueElement(lp.getPassword(), arg1);
	}

	@Then("^User verify the username and password$")
	public void user_verify_the_username_and_password() throws Throwable {
		clickOnElement(lp.getLogin());
	}

}
