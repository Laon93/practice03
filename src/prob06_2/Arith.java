package prob06_2;

public abstract class Arith {
	
	protected double a;
	protected double b;
	
	public abstract double calc();
	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	

}
