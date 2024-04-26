package smoke_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHomepage {

	public static void main(String[] args) throws InterruptedException
    {
		//System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
		// open the chrome broswer. 
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		// navigate to hom epage of application. 
		driver.get("http://localhost:5173");
		
//		driver.navitage().to("http://localhost:5173");
		
		Thread.sleep(2000);
			
		driver.quit();

	}

}
