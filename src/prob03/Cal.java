package prob03;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conv = new CurrencyConverter();

		
		while (true) {
			System.out.println("환율을 입력하세요 : ");
			conv.setRate(sc.nextDouble());
			System.out.println("원화에서 달러로 바꾸시려면 1 " + " 달러에서 원화로 바꾸시려면 2를 선택하세요");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("얼마를 바꾸시겠습니까?");
				double won = sc.nextDouble();
				conv.toDollor(won);
				break;
			case 2:
				System.out.println("얼마를 바꾸시겠습니까?");
				double dollar = sc.nextDouble();
				conv.toKRW(dollar);
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");

			}
			System.out.println(" 더 바꾸시겠습니까 ? (y/n)");
			if(sc.next().equals('n')|| sc.next().equals('N'))
				break;

		}

	}

}
