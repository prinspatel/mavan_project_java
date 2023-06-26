package class_time;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1) Find total number of rows 
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(col);
		
		//2) Find total number of columns
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(row);
		
		//3) Read specific row & column data
		String read=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[2]")).getText();
		System.out.println(read);
		
		Thread.sleep(3000);
		
		//4) Read data from all the rows & columns
		List <WebElement>cols=driver.findElements(By.xpath("(//table[@name='BookTable'])[1]//tr"));
		List <WebElement>rows=driver.findElements(By.xpath("(//table[@name='BookTable'])[1]//th"));
		
		for(int f=1;f<=cols.size();f++)
		{
			for(int r=1;r<=rows.size();r++)
			{
				WebElement table=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+f+"]/td["+r+"]"));
				
				System.out.print(table.getText());
			}
		
		//5) Print book names whose author is Amit
		
		//6)Find sum of prices for all the books
		driver.quit();
		

	}}

	}
