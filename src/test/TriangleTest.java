package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bl.triangle.Triangle;

public class TriangleTest {
	
	@Test
	public void toStringtest() {
		
		Triangle t = new Triangle(3.0,4.0,5.0);
		
		assertEquals("Triangle [coteA=3.0, coteB=4.0, coteC=5.0]",t.toString());
		
	}

}
