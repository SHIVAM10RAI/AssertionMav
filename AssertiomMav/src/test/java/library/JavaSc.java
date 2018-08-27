package library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaSc {
		
	/**
	 * JavaScript click element.
	 *
	 * @param driver - The driver
	 * @param element - The element to click
	 */
	public static void javascriptClickElement(WebDriver driver, WebElement element){
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}
	
	
	/**
	 * JavaScript type into textbox.
	 *
	 * @param driver the driver
	 * @param element1 the element1
	 * @param value - The value to type
	 */
	public static void javascriptType(WebDriver driver, WebElement element1, String value){
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+value+"'",element1);
	}
	
	/**
	 * JavaScript scroll window.
	 *
	 * @param driver - The driver
	 * @param xScroll the horizontal scroll
	 * @param yScroll the vertical scroll
	 */
	public static void javascriptScrollWindow(WebDriver driver, int xScroll, int yScroll){
		((JavascriptExecutor)driver).executeScript("window.scrollTo("+xScroll+","+yScroll+")");
	}
}
