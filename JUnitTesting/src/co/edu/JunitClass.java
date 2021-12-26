package co.edu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitClass {
	@Test
	public void setup() {
		String str = "This is first junit program";
		assertEquals("This is first junit program", str);
	}
}
