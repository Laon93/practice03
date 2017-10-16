package prob03;

public class CurrencyConverter {
	private static double rate;

	public static double toDollor(double won) {
		double result = won / rate;
		
		
		System.out.println("result : " + result);
		return result;
	}

	public static double toKRW(double dollar) {
		double result = dollar * rate;
		System.out.println("result : " + result);
		return result;
	}

	public static void setRate(double r) {
		rate = r;
	}
}
