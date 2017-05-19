package yk04A1;

public class SymmetryOperator implements Operator {
	
	public Object execute(Matrix2D m1) {
		
		boolean bc = (m1.b == m1.c);
		return bc;										// Symmetrie 2x2-Matrix der Form:
														// a b
	}													// c d
	
}
