package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Actions act=new Actions(driver);

		//min slide
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("current location is "+min_slider.getLocation());  // current location is (59, 250)
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("After move min Slide location is "+min_slider.getLocation());
		
		System.out.println("----------------------------------------");
		
		//max slide
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("current location "+max_slider.getLocation()); // current location (612, 250)
		act.dragAndDropBy(max_slider, -100, 200).build().perform();
		System.out.println("After Move max Slide location "+max_slider.getLocation());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
