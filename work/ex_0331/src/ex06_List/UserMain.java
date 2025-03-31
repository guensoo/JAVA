package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<>();
		UserInfo ui = new UserInfo();
		Scanner sc = new Scanner(System.in);
		
		out:while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			ui.setId(id);
			
			System.out.print("패스워드 입력 : ");
			int pwd = sc.nextInt();
			ui.setPwd(pwd);
			
			// 중복체크하기(숙제)
			System.out.println(ui.getId());
			if(ui.getId().contains(id)) {
				System.out.println("중복된 ID입니다.");
				continue out;
			}

			
			
			System.out.println(arr);
			arr.add(ui);
			
			for(UserInfo x : arr) {
				System.out.println(ui.getId());
				System.out.println(ui.getPwd());
			}
			
		}
	}
}
