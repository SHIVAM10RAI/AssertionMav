package JavaScriptTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.JavaSc;

public class Test1 extends JavaSc {
	@Test
	public void testGoogle() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		WebElement srchTxBx=driver.findElement(By.name("q"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Selenium"+"'",srchTxBx);
		Thread.sleep(2000);
		WebElement srchBtn=driver.findElement(By.name("btnK"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", srchBtn);
		Thread.sleep(2000);
		driver.quit();
		}
}
