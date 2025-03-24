package ex04_array;

import java.util.Arrays;

public class Ex02_Arrays {
	public static void main(String[] args) {
		// Arrays 클래스는 배열의 복사, 항목의 정렬, 항목 검색 등
		// 배열을 다루기 위한 다양한 메서드를 제공한다.
		// Arrays 클래스를 이용하면 배열의 기능을 더욱 쉽게 사용할 수 있다.
		
		// Scanner, Random 클래스의 경우
		// 객체를 먼저 생성하고 메서드를 사용함
		
		// Arrays.함수명()로 작성하여 기능을 호출한다.
		
		// 1. 배열의 출력
		// toString()
		// 반복문의 도움 없이 배열을 출력할 수 있도록 도와준다.
		// 배열에 정의된 값을 문자열 형태로 변환하여 출력해준다.
		
		
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		// 2. 배열의 정렬
		// sort()
		// 기본적으로 오름차순으로 정렬해준다.
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
	}
}
