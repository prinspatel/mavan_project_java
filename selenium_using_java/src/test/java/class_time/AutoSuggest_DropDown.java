package class_time;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class AutoSuggest_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		List <WebElement>drop=driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
		System.out.println(drop.size());
		
		for(int i=0;i<=drop.size();i++)
		{
			if(drop.get(i).getText().equals("selenium python")) 
			{
				drop.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.quit();
	}

}
