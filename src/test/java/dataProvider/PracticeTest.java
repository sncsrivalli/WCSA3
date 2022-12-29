package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTest {
	
	@Test(dataProvider = "dataForTicketBooking")
	public void demo(String src, String dest) {
		System.out.println(src+"\t"+dest);
	}

	@DataProvider
	public Object[][] dataForTicketBooking(){
		
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "Bangalore";
		obj[0][1] = "Chennai";
		
		obj[1][0] = "Bangalore";
		obj[1][1] = "Hyderabad";
		
		obj[2][0] = "Kolkata";
		obj[2][1] = "Delhi";
		
		obj[3][0] = "Mumbai";
		obj[3][1] = "Kochi";
		
		return obj;
	}
}
