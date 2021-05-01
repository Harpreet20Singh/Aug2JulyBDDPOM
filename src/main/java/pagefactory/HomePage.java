package pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
    WebDriver driver;
    
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username")
	WebElement UsernameTxtField;
	
	@FindBy(name="password")
	WebElement PasswordTxtField;
	
	@FindBy(name="submit")
	WebElement SubmitBtn;
	
	    public void typeUsername(String username) {
	    	UsernameTxtField.sendKeys(username);
	    }
		
	    public void typepassword(String password) {
	    	PasswordTxtField.sendKeys(password);
	    }
	    
	    public void clickSubmitBtn() {
	    	SubmitBtn.click();
	    }
	    
	    public String getHomePageTitle() {
	    	return driver.getTitle();
	    }
		
		
		
		
	

}
