package 문제풀이;

import java.util.Iterator;
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		//1. 정수의 5개 크기의 배열을 만들어서
		//10,20,30,40,50을 순서대로 넣는다
		//첫번째값과 세번째 값을 더해서 프린트
		
		int[]num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력 >> ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		sc.close();//스트림(연결통로)를 닫아라
		
		
		//2.스트링 3개 크기의 배열을 만들어서
		//자바,스프링,JSP를 순서대로 넣는다
		//자바보다는 스프링으로 출력
		String[] s = new String[3];
		//배열 자동 초기화{null,null,null}
		Scanner sc1 = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력>> ");
			s[i] = sc.next();
		}
		System.out.println(s[0] + "보다는" + s[1]);
		sc1.close();
		
	}

}
