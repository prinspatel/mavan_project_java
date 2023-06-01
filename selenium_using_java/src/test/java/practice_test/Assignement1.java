package practice_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Assignement1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(5000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String text=driver.findElement(By.cssSelector("div[class='content-header'] h1")).getText();
		String extext="Dashboard";
		
		if (text.equals(extext))
		{
			System.out.println("Test Pass");
			System.out.println("Text is "+extext);
		}
		else
		{
			System.out.println("Test Faild");
		}
		
		driver.quit();
				
	}

}
