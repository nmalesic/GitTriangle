package bl.triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangleRectangle {

	Triangle tRectangle;
	Triangle tPasRectangle;
	
	@Before
	public void init() {
		tRectangle = new Triangle(3,4,5);
		tPasRectangle = new Triangle(2,3,4);
	}
	
	@Test
	public void testRectangle() {
		assertTrue("Triangle rectangle", tRectangle.isRectangle());
	}

	@Test
	public void testPasRectangle() {
		assertFalse("Triangle rectangle", tPasRectangle.isRectangle());
	}

}
