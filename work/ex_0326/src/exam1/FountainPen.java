package exam1;

import java.util.Scanner;

public class FountainPen extends Pen { //만년필
	public FountainPen () {
		getAmount();
		getColor();
		
	}
	
	public static void main(String[] args) {
		
		
		
		Pen Fountain = new Pen();
		
		
		
//		int x = 2;
//		String str = "흰색";
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String str = sc.nextLine();
		Fountain.getAmount(); // 남은 량
		Fountain.setAmount(x); // 남은 량 설정
		Fountain.getColor(); // 색깔
		Fountain.setColor(str); // 색깔 재설정
		Fountain.refill(x); // 만년필 용량 입력
	}
}
