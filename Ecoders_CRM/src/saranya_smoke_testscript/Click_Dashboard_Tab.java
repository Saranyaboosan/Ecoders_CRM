package saranya_smoke_testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Dashboard_Tab {

	
		public static void main(String[] args) throws InterruptedException 
		{
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://localhost:5173");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		WebElement Dashboard = driver.findElement(By.xpath("//a[@class='nav-link']"));
		Thread.sleep(2000);
		Dashboard.click();
		
		{
			System.out.println("Dashboard page should displayed");
		}

	

	}

}
