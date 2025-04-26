package parallelTesting_26April;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchWebsite extends Beforelaunch {
	
	@Test
	
	
	
	public void launch()
	{
		
			
			driver.get("https://www.flipkart.com/");
		
		
		
		
		//driver.quit();
	}

}
