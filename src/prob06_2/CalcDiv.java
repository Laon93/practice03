package prob06_2;

public class CalcDiv extends Arith {

	@Override
	public double calc() {
		if(a!=0 && b!= 0)
			return a/b;
		else
			return 0;
	}

}
