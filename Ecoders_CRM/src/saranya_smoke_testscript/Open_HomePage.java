package saranya_smoke_testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_HomePage {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://localhost:5173");
	{
		System.out.println("Home page should displayed");
	}

	}

}
