package practice_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class Drop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement dp=driver.findElement(By.cssSelector("select.custom-select"));
		
		Select dropdown=new Select(dp);
		dropdown.selectByVisibleText("Greece");
		
		driver.quit();
		

	}

}
