package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] score = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(331);// 0-331
		}

		// 1.수능만점자는 몇명일까
		int count = 0;
		for (int i = 0; 1 < score.length; i++) {
			if (score[i] == 330) {
				count++;// count = count + 1;
				System.out.println("번호: " + i);
			}
		}
		System.out.println(count);
		

	}
}
