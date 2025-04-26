package parallelTesting_26April;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Beforelaunch {
	
	WebDriver driver=null;
	
	@BeforeMethod
	
	@Parameters("browser")
	
	public void launch(String str)
	
	{
		if(str.equals("chrome"))
			
			driver = new ChromeDriver();
		
		if(str.equals("firefox"))
			
			driver= new FirefoxDriver();
		
		if(str.equals("edge"))
			
			driver = new EdgeDriver();
		
	}
	
	@AfterMethod
	
	public void quit()
	
	{
		driver.quit();
	}

}
