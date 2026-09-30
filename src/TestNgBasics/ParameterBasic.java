package TestNgBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBasic {
	@Parameters({"straw"})
	@Test
	public void parameterValue(String val) {
		System.out.println("the value given is "+val);
	}

}
