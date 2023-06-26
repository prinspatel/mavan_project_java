package mouse_action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.*;

public class Hover_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement compo=driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		WebElement moniter=driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		
		Actions act=new Actions(driver);		
		act.moveToElement(compo).moveToElement(moniter).click().build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
