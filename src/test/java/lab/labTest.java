package lab;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class labTest {

	@Test
	public void fahrenheitToCentigradeConvertShouldBeCorrect() {
		assertEquals(0, Lab.fahrenheitToCentigrade(32));
	}
	
	@Test
	public void centigradeToFahrenheitConvertShouldBeCorrect() {
		assertEquals(32, Lab.centigradeToFahrenheit(0));
	}
	
	@Test
	public void removeSignOfExclaimationShouldBeCorrect() {
		assertEquals("Test String", Lab.removeSignOfExclaimation("Test String!!!"));
	}
	
	@Test
	public void getCurrentDayShouldBeCorrect() {
		assertEquals(10, Lab.getCurrentDay());
	}
	
	@Test
	public void getCurrentMonthShouldBeCorrect() {
		assertEquals(6, Lab.getCurrentMonth());
	}
	
	@Test
	public void getCurrentYearShouldBeCorrect() {
		assertEquals(2020, Lab.getCurrentYear());
	}

}
