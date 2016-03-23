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

	@Test
	public void testIsoceleNOK() {
		Triangle triangle = new Triangle(10,15,20);
		
		assertFalse(triangle.isIsocele());
	}
	
	
}
