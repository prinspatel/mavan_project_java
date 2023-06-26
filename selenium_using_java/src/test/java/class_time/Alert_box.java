package class_time;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("//button[@onclick=\'jsAlert()\']")).click();
			Thread.sleep(3000);
			Alert awin=driver.switchTo().alert();
			
			System.out.println(awin.getText());
			awin.accept();
			
			driver.findElement(By.xpath("//button[@onclick=\'jsPrompt()\']")).click();
			Alert atbox=driver.switchTo().alert();
			atbox.sendKeys("Prins");
			atbox.accept();
			
			WebElement result=driver.findElement(By.xpath("//p[2]"));
			String ans=result.getText();
			if (ans.equals("You entered: Prins")) 
			{
				System.out.println("Result Pass");
			}
			else
			{
				System.out.println("Result Fail");
			}
			
			driver.quit();
;
		}

	


}
