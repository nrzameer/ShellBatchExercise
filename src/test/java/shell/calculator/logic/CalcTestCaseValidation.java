package shell.calculator.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalcTestCaseValidation {

	CalcSample calc;
	
	//This gets execute before each method/testcase
	@Before
	public void thisIsBeforeAnnotation() {
		calc = new CalcSample();
		
	}
	
	//This is the addition testcase
	@Ignore //To ignore a testcase
	@Test
	public void validateAddition() {
		int expectedResult = 40;
		int actualResult = calc.addition(10, 20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	//This is the subtraction testcase
	@Test
	public void validateSubtraction() {
		int expectedResult = 5;
		int actualResult = calc.subtraction(10, 5);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is completed");
	}

}
