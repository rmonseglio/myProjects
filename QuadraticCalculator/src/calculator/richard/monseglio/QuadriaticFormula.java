package calculator.richard.monseglio;

public class QuadriaticFormula {
	private double A;
	private double B;
	private double C;
	private double x1;
	private double x2;
	
	public QuadriaticFormula() {
		
	}
	
	public QuadriaticFormula(double A, double B, double C) {
		this.A = A;
		this.B = B;
		this.C = C;
		
		
	}

	/**
	 * @return the a
	 */
	public double getA() {
		return A;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		A = a;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return B;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		B = b;
	}

	/**
	 * @return the c
	 */
	public double getC() {
		return C;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		C = c;
	}
	
	/**
	 * @return the x1
	 */
	public double getX1() {
		double result = B * B - 4.0 * A * C;
		if(result > 0.0) {
			double x1 = (-B + Math.pow(result, 0.5))/(2.0 * A);	
			System.out.println("The value of x1 is " + x1);
		}
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(double x1) {
		this.x1 = x1;
	}

	/**
	 * @return the x2
	 */
	public double getX2() {
		double result = B * B - 4.0 * A * C;
		if(result > 0.0) {
			double x2 = (-B - Math.pow(result, 0.5))/(2.0 * A);
			System.out.println("The value of x2 is " + x2);	
		}
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(double x2) {
		this.x2 = x2;
	}
}
