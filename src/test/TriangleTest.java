package test;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import bl.triangle.Triangle;

public class TriangleTest {
	
	@Test
	public void toStringtest() {
		
		Triangle t = new Triangle(3.0,4.0,5.0);
		
		assertEquals("Triangle [coteA=3.0, coteB=4.0, coteC=5.0]",t.toString());
		
	}

	
	@Test
	public void NonTriangletest() {
		
		Triangle t = new Triangle(1.0,1.0,5.0);
		
		assertEquals("Ceci n'est pas un triangle",t.toString());
		
	}


}
