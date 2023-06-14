package practice_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Sarch : ");
		String s=sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(5000);
		driver.findElement(By.id("searchInput")).sendKeys(s);
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
		Thread.sleep(5000);
		String ans = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]")).getText();
		
		WebElement body=driver.findElement(By.id("bodyContent"));
		String pera=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p")).getText();
		System.out.println(pera);
		
		driver.quit();
		System.out.println(ans);
		

	}

}
