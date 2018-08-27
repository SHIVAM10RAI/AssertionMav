package group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest1 {
	
	@Test(groups="Smoke")
	
	public void testCaseSix() {
		
	Reporter.log("Test Case6",true);
}
	@Test(groups="Regression")
	
	public void testCaseSeven() {
		
	Reporter.log("Test Case7",true);
}
	@Test(groups="Regression")
	
	public void testCaseEight() {
		
	Reporter.log("Test Case8",true);
}
	@Test(groups="Regression")
	
	public void testCaseNine() {
		
	Reporter.log("Test Case9",true);
}
}
