package 문제풀이;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		//2.스트링 3개 크기의 배열을 만들어서
		//자바,스프링,JSP를 순서대로 넣는다
		//자바보다는 스프링으로 출력

		String[] s = new String[3];
		//배열 자동 초기화{null,null,null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력>> ");
			s[i] = sc.next();
		}
		System.out.print(s[0] + "보다는" + s[1]);
		sc.close();
	}

}
