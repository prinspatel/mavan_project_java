package methods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// 1 ) get(url);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// wait for 3 second.
		Thread.sleep(3000);
		// 2 ) getTitle();
		System.out.println(driver.getTitle());
				
		// 3 ) getCurrentURL();
		System.out.println(driver.getCurrentUrl());
		
		// 4 ) getPageSource();
		//System.out.println(driver.getPageSource());
		
		// 5 ) getWindowHandle(); // it will return window(tab) id of browser.
		//System.out.println(driver.getWindowHandle());
		
		//second window.
		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
		Thread.sleep(3000);
		
		Set<String> windowsid=driver.getWindowHandles();
		// 6 ) getWindowHandles();
		 for (String winid: windowsid)
		 {
			 System.out.println(winid);
		 }
		
		System.out.println();
		driver.quit();
		

	}

}
