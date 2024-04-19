package smoke_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHomepage {

	public static void main(String[] args)
    {
		//System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
		// open the chrome broswer. 
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		// navigate to hom epage of application. 
		driver.get("http://localhost:5173");
		
//		driver.navitage().to("http://localhost:5173");
		
		Thread.sleep(2000);
		
		
		// to capture the url, or the title of the page. 
		String actualtitle = driver.getTitle();
		String actulurl = driver .getCurrentUrl();
		
		String expectedtittle = "";
		
		String expectedurl = "";
		
		if(expectedtittle.equals(actualtitle))
		{
			System.out.println("Test case pass, title matches.");
		}
		else {
			System.out.println("Test case failed, title did not matches.");
		}
		
		if(expectedurl.equals(actulurl))
		{
			System.out.println("Test case pass, url matches.");
		}
		else {
			System.out.println("Test case failed, url did not matches.");
		}
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
