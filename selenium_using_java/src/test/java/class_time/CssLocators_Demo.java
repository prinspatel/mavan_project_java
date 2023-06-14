package class_time;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class CssLocators_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//find by CssSelector  /// tagname#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("HTC One Mini Blue");
		
		//tagname[attribut]
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		//tagname class and attriute
		driver.findElement(By.cssSelector("button.button-2[onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/19/1/1\"),!1']")).click();
		
		//tagname.class ( if there is any space them delete after space )
		driver.findElement(By.cssSelector("a.ico-cart")).click();
		 
		driver.findElement(By.id("termsofservice")).click();
		
		driver.findElement(By.name("checkout")).click();
		
		String title=driver.findElement(By.cssSelector("div.page-title")).getText();
		String extitle="Welcome, Please Sign In!";
		
		if (title.equals(extitle))
		{
			System.out.println("Test Pass. Checkout Sucess");
		}
		else
		{
			System.out.println("Test faild");
		}
		
		driver.close();
	}

}
