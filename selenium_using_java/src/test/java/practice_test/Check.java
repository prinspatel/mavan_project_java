package practice_test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Check {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List <WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
		
		
		for(int i=5;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
			String a=checkbox.get(i).getAttribute("id");
			System.out.println(a);
			System.out.println(checkbox.get(i).isSelected());
		}
		
		driver.quit();
		
	}

}
