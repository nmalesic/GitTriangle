package bl.triangle;

public class Triangle {
	
	private double a, b, c;
	
	// Constructeur
		public Triangle(double a, double b, double c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			//ared
					
		}
		
		public Triangle() {
		}
	
	public boolean isIsocele() {
		if ((a==b) || (a==c) || (b==c)) {
			return true;
		}
		else {
			return false;
		}
	}	

	public String toString() {
		if (this.isIsocele()) {
			return "Le triangle est isocèle. \nSon périmètre est :";
		}
		return null;
	}
	
	
}
