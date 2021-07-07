package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내단 999개 공간
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];

		Random r = new Random(1);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1;// 0~3(1~4)
			내답[i] = r.nextInt(4) + 1;
		}
		System.out.println("번호 :   답안         내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "     : " + 답안[i] + " <   -    > " + 내답[i]);
		}
		// 점수 채점을 위한 1당 1점 부여
		int score = 0;
		// 답안과 내답 동일
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] == 내답[i]) {
				score++;
			}
		}
		System.out.println("당신의 점수는" + score);
		//답안보다 내답이 정답이 큰 경우 몇 문제 카운트
		int high = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(답안[i] < 내답[i]) {
				high++;
			}
		}
		System.out.println("내 답이 더큰 경우" + high);
	}
}
