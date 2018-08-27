package JavaScriptTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void ScrollDown() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/Link1.html");
	 RemoteWebDriver r=(RemoteWebDriver)driver;
	 String C="window.scrollTo(0,document.body.scrollHeight)";
	 r.executeScript(C);
	

	}

}
