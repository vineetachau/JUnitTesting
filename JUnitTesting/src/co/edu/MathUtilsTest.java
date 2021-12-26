package co.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest {

	MathUtils mathUtilsTest;
	
	@BeforeAll 
	static void runsBeforeAllTests() {
		System.out.println("@Before All");
	}
	@AfterAll 
	static void runsAfterAllTests() {
		System.out.println("@After All");
	}
	
	@BeforeEach
	void first() {
		mathUtilsTest = new MathUtils();
		System.out.println("@Before Each");
	}
	@AfterEach
	void last() {
		System.out.println("@AfterEach is cleaningup");
	}
	
	@Test
	void test1() {
		int expected=6;
		int actual = mathUtilsTest.add(4, 2);
		assertEquals(expected, actual,"add two numbers");
		System.out.println("test1 pass");
	}
	
	@Test
	void test2() {
		int expected=6;
		int actual = mathUtilsTest.sub(12, 6);
		assertEquals(expected, actual,"sub two numbers");
		System.out.println("test2 pass");
	}
	
	
}
