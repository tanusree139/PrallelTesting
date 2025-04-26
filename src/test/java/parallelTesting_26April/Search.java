package parallelTesting_26April;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search extends Beforelaunch{
	
	
@Test

	public void launch()
	{
			driver.get("https://www.flipkart.com/");
		
		
		
		
		WebElement e1 = driver.findElement(By.xpath("//input[@name='q']"));
		
		e1.sendKeys("mobile");
		
		e1.sendKeys(Keys.ENTER);
		
		//e1.sendKeys(Keys.ARROW_DOWN);
		
		//e1.sendKeys(Keys.ARROW_DOWN);
		
		driver.quit();
	}

}
