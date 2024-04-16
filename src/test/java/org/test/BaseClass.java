package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void ChromeBrowser() {
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
	}
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	public static void pagetittle() {
		String tittle = driver.getTitle();
		System.out.println(tittle);
	}
	public static void pageurl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
public static void filltextbox(WebElement element, String value) {
	element.sendKeys(value);
}
public static void btnclick(WebElement ref) {
	ref.click();

}







}








