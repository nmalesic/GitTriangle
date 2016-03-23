package bl.triangle;

public class Rectangle {

	
	public boolean rectangle(Triangle triangle) {
		
        boolean rect1, rect2, rect3;
        rect1 = ((triangle.getCoteA()*triangle.getCoteA()) +(triangle.getCoteB()*triangle.getCoteB()) == (triangle.getCoteC()*triangle.getCoteC()));
        rect2 = ((triangle.getCoteA()*triangle.getCoteA()) +(triangle.getCoteC()*triangle.getCoteC()) == (triangle.getCoteB()*triangle.getCoteB()));
        rect3 = ((triangle.getCoteC()*triangle.getCoteC()) +(triangle.getCoteB()*triangle.getCoteB()) == (triangle.getCoteA()*triangle.getCoteA()));

        return rect1 ||rect2 || rect3;

  }
}
