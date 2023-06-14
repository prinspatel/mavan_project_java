package class_time;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getWindowHandle());
		Set<String> windowid=driver.getWindowHandles();
		for(String Winid:windowid)
		{
			System.out.println(Winid);
		}
		
		
		driver.quit();
	}
	

}
