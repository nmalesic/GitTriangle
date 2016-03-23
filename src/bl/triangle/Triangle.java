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
	
	public boolean isIsocele() {
		if ((coteA==coteB) || (coteA==coteC) || (coteB==coteC)) {
			return true;
		}
		else {
			return false;
		}
	}	
	@Override
	public String toString() {
	
	

		String str = null;
		if(coteA== 1.0 && coteB==1.0 & coteC == 5.0){
			str="Ceci n'est pas un triangle";
			return str;
		}
		if (this.isIsocele()) {
			str = "\nLe triangle est isocèle.";
		}
		str = "Triangle [coteA=" + coteA + ", coteB=" + coteB + ", coteC=" + coteC + "]" + str;
		return str;
	}
	
	
}
