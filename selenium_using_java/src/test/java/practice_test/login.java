package practice_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();	
		
		//get title
		//Thread.sleep(5000);
		String titel=driver.getTitle();
		String Extitle="OrangeHRM";
		
		// 
		if (titel.equals(Extitle))
		{
			System.out.println("Test Pass");
			System.out.println(titel);
		}
		else
		{
			System.out.println("Test Faild");
		}
		
		driver.close();

	}

}
