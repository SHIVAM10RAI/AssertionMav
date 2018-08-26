package pack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
public void Assert1() {
	Reporter.log("Step1",true );
	Assert.assertEquals("abc","abc");
	Reporter.log("Step2",true );
	Assert.assertEquals("abc","xyz");
	Reporter.log("Step1",true );
}

}
