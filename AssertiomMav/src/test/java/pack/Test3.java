package pack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
@Test
public void Assert2() {
	Reporter.log("Step1",true);
	SoftAssert s=new SoftAssert();
	s.assertEquals("abc","abc");
	Reporter.log("Step2",true);
	s.assertEquals("abc","xyz");
	Reporter.log("Step3",true);
	s.assertAll();
}
}
