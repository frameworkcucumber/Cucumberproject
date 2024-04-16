package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		LaunchUrl("http://www.facebook.com/");
		maxwindow();
	}

	@When("user should enter invalid {string} and invalid {string}")
	public void user_should_enter_invalid_and_invalid(String username, String pass) {
		WebElement user = driver.findElement(By.id("email"));
		filltextbox(user, username);
		WebElement passwd = driver.findElement(By.id("pass"));
		filltextbox(passwd, pass);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement loginbtn = driver.findElement(By.name("login"));
		btnclick(loginbtn);
	}

	@Then("user will  navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		System.out.println("credential page");
	}



}
