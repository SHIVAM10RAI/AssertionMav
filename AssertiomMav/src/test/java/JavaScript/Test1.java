package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		WebElement srchTxBx=driver.findElement(By.name("q"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value()='"+"Selenium"+"'",srchTxBx);
		driver.quit();
		WebElement srchTxBtn=driver.findElement(By.name("btnk"));
		srchTxBtn.click();
		driver.quit();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", srchTxBtn);
	}
}
