package expediatest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	
	public void AssertionsRep() {
		
		String expected_result = "Yahoo";
		String actual_result = "gmail";
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual_result, expected_result);
		//Assert.assertEquals(actual_result, expected_result); // Hard Assert
		
		System.out.println("Boxed Image");
		softAssert.assertEquals(true, false);
		
		System.out.println("True Image");
		softAssert.assertEquals(true, true);
		
		softAssert.assertAll(); // unless this is here it won't show the test failed.
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
