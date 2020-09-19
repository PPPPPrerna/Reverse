package piku;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B {
	
	@Test(dataProvider = "getData")
	public void hjk(String q , String p) {
		System.out.println(p);
		System.out.println(q);
	}
	
	
	
	@DataProvider
	public String[][] getData() {
		String [][] a = new String[3][2];
		a[0][0]="first";
		a[0][1]="first";
		a[1][0]="secod";
		a[1][1]="seco";
		a[2][0]="two";
		a[2][1]="two";
		
		return a;
	}
	
	@Test
	public void aaa() {
		System.out.println("Pandey");
	}

	
	@Test
	public void aa() {
		System.out.println("Go");
	}
}
