package bl.triangle;

public class Triangle {
	
	private double coteA;
	private double coteB;
	private double coteC;
	
	
	
	public Triangle() {
		super();
	}
	public Triangle(double coteA, double coteB, double coteC) {
		super();
		this.coteA = coteA;
		this.coteB = coteB;
		this.coteC = coteC;
	}
	public double getCoteA() {
		return coteA;
	}
	public void setCoteA(double coteA) {
		this.coteA = coteA;
	}
	public double getCoteB() {
		return coteB;
	}
	public void setCoteB(double coteB) {
		this.coteB = coteB;
	}
	public double getCoteC() {
		return coteC;
	}
	public void setCoteC(double coteC) {
		this.coteC = coteC;
	}
	@Override
	public String toString() {
		return "Triangle [coteA=" + coteA + ", coteB=" + coteB + ", coteC=" + coteC + "]";
	}
	public boolean isRectangle() {
		Rectangle rect = new Rectangle();
			return rect.rectangle(this);
	}
	
	
	
	
	
	
}
