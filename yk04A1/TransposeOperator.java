package yk04A1;

public class TransposeOperator implements Operator {
	
	public Object execute(Matrix2D m1) {
		
		return new Matrix2D(m1.a, m1.c, m1.b, m1.d);	// Transponierte 2x2-Matrix der Form:
														// a b >> a c
	}													// c d >> b d

}
