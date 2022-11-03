package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	 
	@Given("User is on SwagLab homepage")
	public void user_is_on_swag_lab_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS SWETHA\\chrome102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
	}

	@When("User enters Username")
	public void user_enters_username() {
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
	}

	@When("User enters Password")
	public void user_enters_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	   
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
		
	
	
//	@When("User clicks on Tshirt addcart button")
//	private void user_clicks_on_tshirt_addcart_button() {
//		
//		WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
//		
//		
//	}

	@Given("User clicks on Tshirt addcart button")
	public void user_clicks_on_Tshirt_addcart_button() {
		WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product1);
		product1.click();
	    
	}
 
	    
	

	@Given("User clicks on Jacket addcart button")
	public void user_clicks_on_jacket_addcart_button() throws InterruptedException {
		WebElement product2= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		product2.click();
		Thread.sleep(1000);
	}

	@Given("User clicks on shopping cart container button")
	public void user_clicks_on_shopping_cart_container_button() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();	
		
	}

}
