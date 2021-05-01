package step_definitions;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginFunctionalityTest extends TestBase {
	
   
	public LoginFunctionalityTest() throws IOException {
		super();
		
	}

	@Given ("^user is in homePage$")
	    public void user_is_in_homePage() {
		   System.out.println(driver.getTitle());
	}  
	
	@When ("^user provides valid username and valid password$")
	public void user_provides_valid_username_and_valid_password() {
		driver.findElement(By.name("userName")).sendKeys("test 123");
		driver.findElement(By.name("password")).sendKeys("123");
		
	}
	
	@And ("^user clicks submit button$")
	public void user_clicks_submit_button() {
		driver.findElement(By.name("submit")).click();;
	}
	
	@Then ("^login should happen login success message should be displayed$")
	public void login_should_happen_login_success_message_should_be_displayed() {
		String actualLoginSuccessMsg = driver.findElement(By.xpath("//h3[contains"
				+ "(text(),'Login Successfully']")).getText();
		String expectedLoginSuccessMsg ="Login Successfully";
		Assert.assertEquals(expectedLoginSuccessMsg, actualLoginSuccessMsg);
		
	}
	
	@When("^user provides invalid username and invalid password$")
	public void user_provides_invalid_username_and_invalid_password() {
		driver.findElement(By.name("userName")).sendKeys("tom 12");
		driver.findElement(By.name("password")).sendKeys("1234");
  	}

	@Then("^login should not happen and error message should be displayed$")
	public void login_should_not_happen_and_error_message_should_be_displayed() {
	   String acutualErrormMsg = driver.findElement(By.xpath("//span[contains"
	   		+ "(text(),'Enter your userName and password correct')]"))
			   .getText().trim();
	   Assert.assertEquals(acutualErrormMsg, "Enter your userName"
	   		                             + " and password correct");
	}   


}
