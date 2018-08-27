package JavaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void ScrollDownTest() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Link1.html");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		WebElement s=driver.findElement(By.id("r1"));
		Point a=s.getLocation();
		int y=a.getY();
		String c="window.scrollTo(0,"+y+")";
		r.executeScript(c);
		
	}

}
