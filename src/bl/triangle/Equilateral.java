package bl.triangle;

public class Equilateral extends Triangle {

	public boolean isEquilateral(int ligne1, int ligne2, int ligne3) {
		
		return ((ligne1 == ligne2) && (ligne1 == ligne3));
	}

}
