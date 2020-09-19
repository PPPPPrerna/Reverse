package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day1 {

	@Test(dataProvider="getData")
	public void ere(String a , String b) {
		System.out.println("d u win d match");
		
		System.out.println(a);
		System.out.println(b);
	}
	
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0]="First";
		data[0][1]="first";
		data[1][0]="sec";
		data[1][1]="sec";
		data[2][0]="tgjk";
		data[2][1]="htht";
		
		return data;
		
	}
	
	@Test(groups= {"Smoke"})
	public void qws() {
		System.out.println("Output printted");
	}
}
