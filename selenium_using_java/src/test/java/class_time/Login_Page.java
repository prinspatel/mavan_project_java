package class_time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		/* Test case
			--------
		1) Launch browser
		2) open url
			https://opensource-demo.orangehrmlive.com/
		3) Provide username  - Admin
		4) Provide password  - admin123
		5) Click on Login button 
		6) Verify the title of dashboard page   
			Exp title : OrangeHRM
		7) close browser  */

public class Login_Page {

	public static void main(String[] args) throws InterruptedException 
	{	
		// 1) Launch Webdriver 
		// 1) ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2) open url
		// https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		
		//maximize window
		driver.manage().window().maximize();
		
		// without store data direct find element and send data.
		// 3) Provide username  - Admin	
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		/*
		//store web element in a variable and send data.
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("Admin");
		*/
		
		//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5) Click on Login button 
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// Wait for 10 second 
		Thread.sleep(10000);
		
		//get title
		String title=driver.getTitle();
		
		
		// 6) Verify the title of dashboard page   
		// Exp title : OrangeHRM
		if (title.equals("OrangeHRM"))
		{
			System.out.println("Test Pass");
			System.out.println("Titel of the site is : "+title);			
		}
		else
		{
			System.out.println("Test Faild");
		}

		// 7) close browser 
		driver.close();
	}
	
}
