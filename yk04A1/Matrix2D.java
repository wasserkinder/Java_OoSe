package yk04A1;

public class Matrix2D {
	
	public double a;											// double-Werte der Eintraege einer 2D-Matrix
	public double b;
	public double c;
	public double d;
	
	public Matrix2D(double a, double b, double c, double d) {	// Konstruktor, in dem die Werte von m1 uebergeben und gesetzt werden

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public String toString() {
		return String.format(" %s %s\n%s %s", a, b, c, d);
	
	}
	
	public Object applyOperator(Operator o) {
		
		return o.execute(this);
	}

}
