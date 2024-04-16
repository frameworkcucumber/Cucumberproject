package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass{
	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement loginbtn = driver.findElement(By.name("login"));
		btnclick(loginbtn);
	}

	@Then("user will redirect to invalid credential page")
	public void user_will_redirect_to_invalid_credential_page() {
		System.out.println("credential page");
		Assert.assertTrue(false);
	}

}
