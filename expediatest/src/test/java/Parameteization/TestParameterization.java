package Parameteization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	
	@Test(dataProvider = "getData")
	public void getLogin(String username, String password) {
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[32][2];
		
		data[0][0] ="BABY POWDER UNISEX";
		data[0][1] = "jelly22fih";
		
		data[1][0] ="1 MILLION MEN";
		data[1][1] = "1Ki77y";
		
		data[2][0] ="212 MEN";
		data[2][1] = "m3llycat";
				 
		return data;
			
		}
		}

