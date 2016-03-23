package bl.triangle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class EquilateralTest {

	@Test
    public void isEquilateralTest() {
        int ligne1 = 5;
        int ligne2 = 5;
        int ligne3 = 5;
        Equilateral triangle = new Equilateral();
        boolean result = triangle.isEquilateral(ligne1,ligne2,ligne3);
        assertTrue(result);
    }

	@Test
    public void isNotEquilateralTest() {
        int ligne1 = 8;
        int ligne2 = 6;
        int ligne3 = 5;
        Equilateral triangle = new Equilateral();
        boolean result = triangle.isEquilateral(ligne1,ligne2,ligne3);
        assertFalse(result);
    }
   
	
}
