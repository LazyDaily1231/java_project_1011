package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		int [] score = new int[1000];
		//변수 개수:1002개
		//램의 크기:4012bite
		System.out.println(score.length + "개");
		System.out.println(score);
		//기본형 변수(값)의 개수 : 1001
		//참조형 변수(주소)의 개수 : 1
		Random r = new Random();
		System.out.println(r.nextInt(100));
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(100);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		for (int x : score) {
			System.out.println(x);
		}
	}

}
