package step_definitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationPageTest extends TestBase {
   
	public RegistrationPageTest() throws IOException {
		super();
		
	}

   @Given("user is already in registration page")
	public void user_is_already_in_registration_page() {
		System.out.println(driver.getTitle());
		
	    driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("user provide \"(. *)\", \"(. *)\", \"(. *)\"")
	public void user_provide_username_password_confirmPassword
	(String username, String password, String  confirmPassword) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
		}

//	@When("clicks submit button")
//	public void clicks_submit_button() {
	//	driver.findElement(By.name("submit")).click();

//	}

//	@Then("user should be registered should see confirmation of username")
//	public void user_should_be_registered_should_see_confirmation_of_username() {

//	}
	


}
