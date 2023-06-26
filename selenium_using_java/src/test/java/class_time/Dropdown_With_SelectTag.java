package class_time;

import java.time.Duration;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Dropdown_With_SelectTag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement dp=driver.findElement(By.cssSelector("select.custom-select"));
		Select dropdown=new Select(dp);
		// SelectValue in Drop down list
		dropdown.selectByVisibleText("Greece");
		
		// Find Total Number of option in dropDown
		List<WebElement>dlist=dropdown.getOptions();
		System.out.println(dlist.size());
		
		
		//print all option
		System.out.println("----------------------------------");
		for(int i=0;i<dlist.size();i++)
		{
			System.out.println(dlist.get(i).getText());
			
			if (dlist.get(i).getText().equals("Spain"))
			{
				System.out.print("Country Name is available");
			}
			
		}
		
		System.out.println("----------------------------------");
		System.out.println("using enhance loop print all data");
		for(WebElement op:dlist)
		{
			System.out.print(op.getText()+", ");
		}
		
		
		driver.quit();

	}

}
