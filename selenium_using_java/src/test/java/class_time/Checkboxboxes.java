package class_time;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkboxboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		int ck=checkbox.size();
		/*for(WebElement ck:checkbox)
		{	
			System.out.print(ck.getAttribute("id")+" : ");
			System.out.println(ck.isSelected());
			
		}*/
		
		
		//click last 2 box
		for(int i=5;i<ck;i++)
		{
			checkbox.get(i).click();
			System.out.print(checkbox.get(i).isSelected()+" : ");
			System.out.println(checkbox.get(i).getAttribute("id"));
		}
		driver.quit();
		
		
		

	}

}
