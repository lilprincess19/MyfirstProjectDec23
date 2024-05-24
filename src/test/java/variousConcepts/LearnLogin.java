package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLogin {
	//
	WebDriver driver; // creating global variable (driver) / or object variable

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();  // all this driver is reffering to global driver
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLogin() {  // 2 operations are happening overhere, driver is finding the elements and we are sending the keys
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");// calling object variable everywhere
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
		
		//type name =value
		WebElement USER_NAME_FIELD=driver.findElement(By.xpath("\"//*[@id=\\\"user_name\\\"]"));
		
	}
}