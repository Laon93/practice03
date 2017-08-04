package prob06_2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			/* 코드를 완성 합니다 */
			System.out.print(">> ");
			String expression = sc.nextLine();
			if ("quit".equals(expression)) {
				break;
			}

			String[] tokens = expression.split(" ");

			if (tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}

			double a = Double.parseDouble(tokens[0]);
			double b = Double.parseDouble(tokens[2]);
			double result = 0;
			switch (tokens[1]) {
			case "+":
				CalcAdd add = new CalcAdd();
				add.setValue(a, b);
				result = add.calc();
				break;

			case "-":
				CalcSub sub = new CalcSub();
				sub.setValue(a, b);
				result = sub.calc();
				break;

			case "*":
				CalcMul mul = new CalcMul();
				mul.setValue(a, b);
				System.out.println(mul.calc());
				break;

			case "/":
				CalcDiv div = new CalcDiv();
				div.setValue(a, b);
				System.out.println(div.calc());
				break;

			default:
				System.out.println("Error ");
				break;
			}
		}
	}

}
