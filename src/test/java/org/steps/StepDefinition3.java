package org.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

import io.cucumber.java.en.*;

public class StepDefinition3 extends BaseClass{
	@Given("user should be in snapdeal home page")
	public void user_should_be_in_snapdeal_home_page() {
	    LaunchUrl("https://www.snapdeal.com/");
	    maxwindow();
	}

	@When("user should enter the product name in search box")
	public void user_should_enter_the_product_name_in_search_box(io.cucumber.datatable.DataTable d) {
	    List<Map<String, String>> m = d.asMaps();
		WebElement product = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
	    filltextbox(product, m.get(0).get("New Product"));
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
	    WebElement searchBtn = driver.findElement(By.xpath("//span[text()='Search']"));
	    btnclick(searchBtn);
	}

	@Then("user will navigate to product page")
	public void user_will_navigate_to_product_page() {
	    System.out.println("user is in product page");
	}

}
