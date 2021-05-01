package step_definitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageLinkFunctionalityTest extends TestBase {
	
	public HomePageLinkFunctionalityTest() throws IOException {
		super();
		
	}

	

	@Given("^user is already in home page$")
	public void user_is_already_in_home_page() throws InterruptedException {
	     System.out.println(driver.getTitle());
	}

	@When("^user clicks on register link$")
	public void user_clicks_on_register_link() throws InterruptedException {
		 driver.findElement(By.linkText("REGISTER")).click();
		 Thread.sleep(2000);
	}

	@Then("^Register page should open$")
	public void register_page_should_open() throws InterruptedException {
          Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
          Thread.sleep(2000);
         
	}
	
	@When("user clicks on flights link")
	public void user_clicks_on_flights_link() throws InterruptedException {
	   driver.findElement(By.linkText("Flights")).click();
	   Thread.sleep(2000);
	}

	@Then("Flight finder page should open")
	public void flight_finder_page_should_open() throws InterruptedException {
	   Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	   Thread.sleep(2000);
	  
	}
    
	

}
