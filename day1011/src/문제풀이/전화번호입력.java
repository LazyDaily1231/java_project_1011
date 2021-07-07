package 문제풀이;

import java.util.Scanner;

public class 전화번호입력 {

	public static void main(String[] args) {
		// 전화번호 입력 >> 011 - 245 -1234
		// 1)양쪽 공백을 제거하시오
		// 2)-을 기준으로 분리해내세요(String[])
		// 3)첫번째 문자열이 011이면 SK, 019이면 LG, 나머지면 Apple
		// 4)두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
							//아니면 유효하지 않는 번호
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력>> ");
		String data = sc.next();
		
		String data2 = data.trim();
		String [] data3 = data2.split("-");
		
		if (data3[0].equals("011")) {
			System.out.println("SK");
		}else if(data3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("APPlE");
		}
		
		if (data3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		if (data3.length <= 10) {
			System.out.println("유효한 번호");
		} else {
			System.out.println("유효하지 않는 번호");
		}
	
	}

}
