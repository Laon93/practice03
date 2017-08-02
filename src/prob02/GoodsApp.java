package prob02;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하실 데이터의 수를 입력하세요");
		int count = sc.nextInt();

		System.out.println("상품명  가격  수량  순으로 입력하세요");
		Goods goods[] = new Goods[count];

		//입력
		for(int i=0; i<count; i++)
		{
			String name = sc.next();
			int price = sc.nextInt();
			int countStock = sc.nextInt();
			
			Goods g = new Goods();
			g.setName(name);
			g.setCountStock(countStock);
			g.setPrice(price);
			goods[i] = g;
			
		}
		
		//출력
		for (int i = 0; i < count; i++) {
			
			System.out.println(goods[i].getName() + " (가격  : " + goods[i].getPrice() + ")이 "
					+ goods[i].getCountStock() + "개 입고 되었습니다.");

		}
	}

}
