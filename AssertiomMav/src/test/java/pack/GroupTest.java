package pack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(priority=1,groups="Smoke")
	
	public void testCaseOne() {
		
	Reporter.log("Test Case1",true);
}
	@Test(priority=2,groups="Smoke")
	
	public void testCaseTwo() {
		
	Reporter.log("Test Case2",true);
}
	@Test(priority=3,groups="Regression")
	
	public void testCaseThree() {
		
	Reporter.log("Test Case3",true);
}
	@Test(priority=4,groups="Regression")
	
	public void testCaseFour() {
		
	Reporter.log("Test Case4",true);
}
}
