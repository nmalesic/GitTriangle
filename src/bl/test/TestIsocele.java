package bl.test;

import org.junit.Test;

import static org.junit.Assert.*;

import bl.triangle.Triangle;

public class TestIsocele {

	@Test
	public void testIsoceleOK() {
		Triangle triangle = new Triangle(20,20,10);
		
		assertTrue(triangle.isIsocele());
	}

}
