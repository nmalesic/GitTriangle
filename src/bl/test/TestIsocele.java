package bl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import bl.triangle.Triangle;

public class TestIsocele {

	@Test
	public void testIsoceleOK() {
		Triangle triangle = new Triangle();
		
		assertTrue(triangle.isIsocele());
	}

}
