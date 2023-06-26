package class_time;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_inputbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		/*This is actual URL,, 
		 * driver.get("http://the-internet.herokuapp.com/basic_auth");
		 * 
		 * to inject user id and password we need to modify url
		 *  and pass value along with user id and password
		 *  http://@admin:admin@the-internet.herokuapp.com/basic_auth
		*/
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement msg=driver.findElement(By.tagName("p"));
		
		if(msg.getText().equals("Congratulations! You must have the proper credentials."))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		driver.quit();
	}

}
