package 문제풀이;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
	
		int[] num = new int[4];
		Scanner sc = new Scanner(System.in);
		String[] fruit = {"사과", "바나나", "포도", "키위"};
		
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("제일 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료 >>");
			int fav = sc.nextInt();
			System.out.print("--------------------------");
			System.exit(0);
			if (fav == 0) {
				System.out.println("시스템이 종료됩니다.");
			for (int i = 0; i < fruit.length; i++) {
				System.out.println(fruit[i] + ":" + num[i] + "원입니다");
			}
			int total = (num[0] + num[1])* 2000 + (num[2] + num[3]) * 3000;
			System.out.println("구매하려면 전체 금액은" + total + "입니다");
			break;
			}
			num[fav - 1]++;
			System.out.println(fruit[fav - 1] + "가 선택되었습니다");
			System.out.println();
			}sc.close();
		}
	}


