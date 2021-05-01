package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

      public class TestBase {
	    public static WebDriver driver;
	    public static Properties prop;
	    
	    public TestBase() throws IOException {
		    prop = new Properties();
			FileInputStream fis;
			 
		fis = new FileInputStream("C:\\Users\\tony2\\OneDrive\\"
				+ "Desktop\\Eclipse Workspace\\Aug2JulyBDDPOM\\"
				+ "src\\main\\java\\property\\config.properties");
		prop.load( fis);
	    }
	    
	  public void intialization() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tony2\\"
					     + "OneDrive\\Desktop\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get(prop.getProperty("url"));
	    }
	  
	  public void tearDown() {
	     	driver.close();
	    }
			
			
			
		
	

}
