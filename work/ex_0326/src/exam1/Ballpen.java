package exam1;

import java.util.Scanner;

public class Ballpen extends Pen { // 볼펜
	public static void main(String[] args) {
		Pen Ballpen = new Pen();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String str = sc.nextLine();
		Ballpen.getAmount(); // 남은 량
		Ballpen.setAmount(x); // 남은 량 설정
		
		Ballpen.getColor(); // 색깔
		Ballpen.setColor(str); // 색깔 재설정
	}
}
