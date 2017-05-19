package yk04A1;

public class DeterminantOperator implements Operator {
	
	public Object execute(Matrix2D m1) {
		
		return m1.a*m1.d-m1.b*m1.c;						// Determinante 2x2-Matrix der Form:
														// a b
	}													// c d
}



